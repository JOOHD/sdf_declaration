package com.z5.zcms.frontsys.front.web;

import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.z5.zcms.admsys.board.dao.FrontBoardDAO;
import com.z5.zcms.admsys.board.domain.FrontBoardVo;
import com.z5.zcms.admsys.board.domain.ZFileVo;
import com.z5.zcms.admsys.board.service.FrontBoardService;
import com.z5.zcms.admsys.common.dao.CommonDAO;
import com.z5.zcms.admsys.common.domain.CommonUseVo;
import com.z5.zcms.admsys.module.dao.ZMemberDAO;
import com.z5.zcms.admsys.module.domain.ZMemberVo;
import com.z5.zcms.admsys.user.dao.ZUserDAO;
import com.z5.zcms.admsys.user.domain.ZUser2Vo;
import com.z5.zcms.admsys.user.domain.ZUserVo;
import com.z5.zcms.admsys.user.service.ZUserLogService;
import com.z5.zcms.frontsys.front.dao.FrontMemberDAOImpl;
import com.z5.zcms.util.DataTable;
import com.z5.zcms.util.FormMail;
import com.z5.zcms.util.IpUtil;
import com.z5.zcms.util.SecuritySessionUtil;
import com.z5.zcms.util.StringUtil;
import com.z5.zcms.util.ZPrint;

import egovframework.com.cmm.ComDefaultCodeVO;
import egovframework.com.cmm.service.EgovCmmUseService;
import egovframework.com.cmm.service.EgovFileMngUtil;
import egovframework.com.cmm.service.EgovProperties;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Resource(name = "messageSource")
@Controller
public class FrontMemberController {
	// 부조리신고 boardno : 44
	public static final int REPORT_BOARD_NO = 44;
	
	public static final String REPORT_TBL_NAME = "ZBOARDCOMMON36";
	
	public static final Logger log = LoggerFactory.getLogger(FrontMemberController.class);
	
	@Autowired
	MessageSource messageSource;
	@Autowired
	FrontBoardService frontBoardService;
	@Autowired
	ZMemberDAO zMemberDAO;
	@Autowired
	ZUserDAO zUserDAO;
	@Autowired
	CommonDAO commonDAO;
	@Autowired
	private FrontBoardDAO frontBoardDAO;
	@Autowired
	PasswordEncoder passwordEncoder;
	@Autowired
	AuthenticationManager authenticationManager;
	@Autowired
	FrontMemberDAOImpl frontMemberDAOImpl;
	@Resource(name = "EgovCmmUseService")
	private EgovCmmUseService cmmUseService;
	@Autowired
	private ZUserLogService zUserLogService;
	@Autowired
	ZUserDAO userDAO;

    	// 부패업 신고센터 신고글
	@RequestMapping(value = { "/skin/member/{skin}/call.html" }, method = { RequestMethod.POST })
	public String call(@ModelAttribute("frontBoardVo") FrontBoardVo frontBoardVo, @ModelAttribute("zUserVo") ZUserVo zUserVo, HttpServletRequest request, Model model,
			HttpSession session, HttpServletResponse response, MultipartHttpServletRequest multi) throws IOException {

		int menuno = Integer.parseInt(request.getParameter("menuno")); // hidden tag
		int cateno = Integer.parseInt(request.getParameter("cateno")); // hidden tag
		
		// jsp form에서 name 값들을 가져오는
		String name = (String) session.getAttribute("niceName");
		String mobileno = request.getParameter("usermobile1") + request.getParameter("mobile2") + request.getParameter("mobile3");  
		String email = request.getParameter("email_id") +"@"+request.getParameter("email_domain");
		String title = request.getParameter("title");
		String content = (String)request.getParameter("content");
		String sDupInfo = (String)session.getAttribute("sDupInfo");

		MultipartHttpServletRequest mulReq = (MultipartHttpServletRequest) request; 
		MultipartFile attachFile= mulReq.getFile("attachFile");

		try {
			
			String seqname = String.valueOf(REPORT_TBL_NAME) + "_SEQ.NEXTVAL";
			int bbsno = this.frontBoardDAO.selectBbsno(seqname);
			log.debug("bbsno={}", bbsno);

			zUserVo.setSeq(bbsno);	// 신고글 번호
			zUserVo.setPro_id(SecuritySessionUtil.getUserid(request)); // securitySession userId
			zUserVo.setMenuno(Integer.parseInt(request.getParameter("cateno"))); // menuno = cateno, 부패공익센터 main 473=대표이사 477=갑질피해 481=임직원비리 485=금품수수

			// 신고 작성 페이지 입력 값 넣는 변수
			zUserVo.setUsername(name);								// 신고자 성명
			//zUserVo.setCond1(request.getParameter("zipcode"));	// 우편번호
			//zUserVo.setCond2(request.getParameter("addr1")); 		// 기본주소
			//zUserVo.setCond3(request.getParameter("addr2"));		// 상세주소
			//zUserVo.setCond4(request.getParameter("fTel") + request.getParameter("tel1") + request.getParameter("tel2"));	 // 전화번호
			zUserVo.setCond5(mobileno); 							// 휴대전화
			//zUserVo.setCond6(request.getParameter("work1")); 		// 담당업무
			//zUserVo.setCond7(request.getParameter("work2")); 		// 직급
			zUserVo.setCond8(request.getParameter("date")); 		// 발생일시
			zUserVo.setCond9(title); 								// 신고제목
			zUserVo.setCond10(content); 							// 신고내용
			//zUserVo.setCond11(request.getParameter("report"));  	// radio box
			zUserVo.setCond12(email);								// 이메일 22/12/23(금) 추가
			zUserVo.setCond13(sDupInfo);							// DI    22/12/29(목) 추가 

			// db ZBOARDCOMMON36 테이블에 insert
			this.zUserDAO.InsertCall(zUserVo);
		
			/* 파일 업로드 로직 추가 */
			if(attachFile != null) { // 값이 있을 때,
			
				MultipartFile file = mulReq.getFile("attachFile"); // file 생성
				
				String boardPath = EgovProperties.getProperty("Globals.upload.board");
				if(boardPath.startsWith("/")) {
					boardPath = StringUtils.substringAfter(boardPath, "/");
				}
				
				
				String uploadPath = EgovProperties.getDocBase() + File.separator + boardPath;
				HashMap<String, String> map = EgovFileMngUtil.uploadFile(file,"Globals.upload.board");
				
				String bbsfilesave = String.valueOf(map.get("uploadFileName")) + "."+ (String) map.get("fileExtension");
				String extension = file.getContentType();
				ZFileVo zFileVo = new ZFileVo();
				zFileVo.setBoardno(REPORT_BOARD_NO);
				zFileVo.setBbsno(bbsno);
				
				zFileVo.setForg(file.getOriginalFilename());
				zFileVo.setFsave(bbsfilesave);
				zFileVo.setFtype(extension);
				
				log.debug("boardPath={}", boardPath);
				log.debug("extension={}", extension);
				log.debug("file insert bbsno={}", bbsno);

				
				EgovFileMngUtil.writeUploadedFile(file, bbsfilesave, String.valueOf(uploadPath) + REPORT_TBL_NAME);
				this.frontBoardDAO.insertBbsFile(zFileVo);
			
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
        // 포맷팅 정의
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
        Date now = new Date();
        // 포맷팅 적용
        String date = formatter.format(now); //현재시각
		
		 
		model.addAttribute("name", name);				// 신고자 성명
		model.addAttribute("date", date); 				// 발생일시
		model.addAttribute("mobileno", mobileno); 		// 휴대폰
		model.addAttribute("email", email);				// 메일
		model.addAttribute("title", title);				// 신고제목
		model.addAttribute("content", content);			// 신고내용
		model.addAttribute("attachFile", attachFile);	// 첨부파일
		model.addAttribute("rmenuno", menuno); 			// menuno
		model.addAttribute("rcateno", cateno); 			// cateno
		model.addAttribute("sDupInfo", sDupInfo);   	// DI

		// 이메일 전송 html return
		return "/skin/board/email/testEmailSend";
	}
}
