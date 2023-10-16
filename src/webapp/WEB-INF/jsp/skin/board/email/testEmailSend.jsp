<%@ page contentType="text/html;charset=utf-8"%>
<%@ page import="javax.mail.internet.InternetAddress" %>
<%@ page import="java.util.Properties" %>
<%@ page import="javax.mail.Authenticator" %>
<%@ page import="javax.mail.Session" %>
<%@ page import="javax.mail.internet.MimeMessage" %>
<%@ page import="javax.mail.Transport" %>
<%@ page import="javax.mail.PasswordAuthentication" %>
<%@ page import="javax.mail.Message" %>
<%@ page import="javax.mail.MessagingException" %>
<%@ page import="javax.mail.internet.AddressException" %>
<%@ page import="com.z5.zcms.admsys.user.domain.ZUserVo" %>
<%@ page import="org.springframework.web.multipart.MultipartFile" %>
<%@ page import="org.springframework.mail.javamail.MimeMessageHelper" %>
<%@ page import="java.io.UnsupportedEncodingException" %>
<%@ page import="java.io.IOException" %>
<%@ page import="org.apache.commons.io.IOUtils" %>
<%@ page import="org.springframework.core.io.ByteArrayResource" %>
<%@ page import="javax.mail.internet.MimeUtility" %>

<%
		String username = (String)request.getAttribute("name");                         // 신고자
		String date = (String)request.getAttribute("date");                             // 신고 날짜
		String mobileno = (String)request.getAttribute("mobileno");                     // 핸드폰 번호
		String email = (String)request.getAttribute("email");                           // 이메일
		String title = (String)request.getAttribute("title");                           // 신고 제목
		String userContent = (String)request.getAttribute("content");                   // 신고 내용
		MultipartFile attachFile = (MultipartFile)request.getAttribute("attachFile");   // 파일 첨부
		String content ="";                                                             // 메일 본문 내용
	//이전 로직 성공 값 
	if(true){
		//파일
		MultipartFile multiPartFile = attachFile;
		//받는사람
		//대표이사 핫라인은 현재 대표님 : kdr@seouldesign.or.kr
		//감사실 전용 이메일은 박주은 선임 : joo17@seouldesign.or.kr
		String toEmail = " kdr@seouldesign.or.kr, joo17@seouldesign.or.kr"+ email;
		// 메일 제목
		String subject = "신고접수 : " + email;
		// 메일 본문 내용
		content += "<div>\n"
				+ "		<section\n"
				+ "			style=\"width:640px; font-weight: 100; margin:0 auto; letter-spacing: -0.25px; font-family: 'Noto Sans'; line-height: 1.4 \">\n"
				+ "			<div style=\"width:540px; display:inline-block; margin:50px 50px 50px 50px;\">\n"
				+ "				<div style=\"width:540px;height: auto;background-color: white;\">\n"
				+ "					<img src=https://seouldesign.or.kr/img/logo.png>\n"
				+ "					<div style=\"margin:27px 0px 0px 0px;\">\n"
				+ "						<p style=\"margin:5px 0px 0px 0px;font-size: 20px;font-weight: 600;color:#333;word-break: keep-all; text-align: center;\">\n"
				+ "								신고서 제출이 완료되었습니다.<br/>\n"
				+ "					제출해주신 신고는 신고사항을 접수한 날부터 7일 이내 처리하되,<br/>\n"
				+ "			신고내용의 조사가 필요한 경우 10일 이내 신고자에게 알린 후 60일 이내 처리할 예정입니다.<br/>\n"
				+ "					신고결과는 신고자의 이메일 주소로 발송되오니 참고하여 주시기 바라며<br/>\n"
				+ "							빠른 접수, 정확한 답변을 위해 항상 노력하겠습니다.<br/><br/>\n"
				+ "								- 재단법인 서울디자인재단 -<br/>\n"
				+ "						</p>\n"
				+ "					</div>\n"
				+ "				</div>\n"
				+ "				<div\n"
				+ "					style=\"width:540px; border-top: 1.4px solid #D9D9D9; border-bottom: 1.4px solid #D9D9D9;\">\n"
				+ "					<table\n"
				+ "						style=\"width:100%; margin:25px 0px 0px 0px;border-top: 1px solid #212121; border-bottom: 1px solid #212121; text-align: left; border-collapse: collapse;\">\n"
				+ "						<tbody>\n"
				+ "							<tr style=\"border-bottom: 1px solid #d9d9d9;\">\n"
				+ "								<td\n"
				+ "									style=\"width:100px; height:40px; background-color: #EEEEEE; font-size:15px;padding-left: 10px;\">\n"
				+ "									제출일시</td>\n"
				+ "								<td style=\"padding-left: 20px;\"><span\n"
				+ "										style=\"height:40px;  font-weight: 400; font-size:15px\">"+date+"</span>\n"
				+ "								</td>\n"
				+ "							</tr>\n"
				+ "							<tr style=\"border-bottom: 1px solid #d9d9d9;\">\n"
				+ "								<td\n"
				+ "									style=\"width:100px; height:40px; background-color: #EEEEEE; font-size:15px;padding-left: 10px;\">\n"
				+ "									성명</td>\n"
				+ "								<td style=\"padding-left: 20px;\"><span\n"
				+ "										style=\"height:40px;  font-weight: 400; font-size:15px\">"+username+"</span>\n"
				+ "								</td>\n"
				+ "							</tr>\n"
				+ "							<tr style=\"border-bottom: 1px solid #d9d9d9;\">\n"
				+ "								<td\n"
				+ "									style=\"width:100px; height:40px; background-color: #EEEEEE; font-size:15px;padding-left: 10px;\">\n"
				+ "									연락처</td>\n"
				+ "								<td style=\"padding-left: 20px;\"><span\n"
				+ "										style=\"height:40px; font-weight: 400; font-size:15px\">"+mobileno+"</span>\n"
				+ "								</td>\n"
				+ "							</tr>\n"
				+ "							<tr style=\"border-bottom: 1px solid #d9d9d9;\">\n"
				+ "								<td\n"
				+ "									style=\"width:100px; height:40px; background-color: #EEEEEE; font-size:15px;padding-left: 10px;\">\n"
				+ "									이메일주소</td>\n"
				+ "								<td style=\"padding-left: 20px;\"><span\n"
				+ "										style=\"height:40px;  font-weight: 400; font-size:15px\">"+email+"</span>\n"
				+ "								</td>\n"
				+ "							</tr>\n"
				+ "							<tr style=\"border-bottom: 1px solid #d9d9d9;\">\n"
				+ "								<td\n"
				+ "									style=\"width:100px; height:40px; background-color: #EEEEEE; font-size:15px;padding-left: 10px;\">\n"
				+ "									제목</td>\n"
				+ "								<td style=\"padding-left: 20px;\"><span\n"
				+ "										style=\"height:40px;  font-weight: 400; font-size:15px\">"+title+"</span>\n"
				+ "								</td>\n"
				+ "							</tr>\n"
				+ "							<tr style=\"border-bottom: 1px solid #d9d9d9;\">\n"
				+ "								<td\n"
				+ "								style=\"width:100px; height:40px; background-color: #EEEEEE; font-size:15px;padding-left: 10px;\">\n"
				+ "								내용</td>\n"
				+ "								<td style=\"padding-left: 20px; max-height: 200px; overflow-y: auto; display: block;\"><span\n"
				+ "									style=\"font-weight: 400; font-size:15px; word-break: break-all;\">"+userContent+"\n"
				+ "									</span>\n"
				+ "								</td>\n"
				+ "							</tr>\n"
				+ "						</tbody>\n"
				+ "					</table>\n"
				+ "					<div style=\"width:100%; height: 140px;\">\n"
				+ "						<div style=\"display: inline-block; margin: 50px 180px 50px 180px\">\n"
				+ "							<form action=\"https://seouldesign.or.kr/?menuno=150\" method=\"post\"> <input type=\"hidden\"\n"
				+ "									name=\"userid\" value=\"joodone\"> <button type=\"submit\"\n"
				+ "									style=\"display: flex;cursor:pointer; width:180px; height:52px;background-color:#000000;border: none;color: #FFFFFF;font-family: 'Noto Sans';line-height: 1.4;text-align: center;align-items: center;justify-content: center;text-decoration: none;\"\n"
				+ "									target=\"_blank\">홈페이지 바로가기</button>\n"
				+ "							</form>\n"
				+ "						</div>\n"
				+ "					</div>\n"
				+ "				</div>\n"
				+ "				<div style=\"width:540px; height: 81px;  font-size: 12px; color:#777777;\">\n"
				+ "					<div style=\"margin: 25px 0px 10px 0px;\">\n"
				+ "						<p style=\"margin:0px;\">인증코드 및 비밀번호가 타인에게 노출되지 않도록 주의해 주세요.</p>\n"
				+ "					</div>\n"
				+ "					<div>\n"
				+ "						<p style=\"margin:0px; font-size: 8px; color:#aaa\">COPYRIGHT ⓒ 2022 Seoul Design Foundation. ALL\n"
				+ "							RIGHTS RESERVED.</p>\n"
				+ "					</div>\n"
				+ "				</div>\n"
				+ "			</div>\n"
				+ "		</section>\n"
				+ "	</div>";
		
		//SMTP 정보 setting
		String SMTPSERVER = "10.100.30.20";
		Properties props;
		Session mailSession;
		final String user = "webmaster2"; 
		final String pw = "sdfmedia2021!";
		
		String from = "postmaster@seouldesign.or.kr";
		String fromName= "서울디자인재단"; 
		String to = toEmail;
		
		
		props = new Properties();
		props.put("mail.smtp.host", SMTPSERVER);
		props.put("mail.smtp.port", 25);
		props.put("mail.smtp.auth", "true"); 
		props.put("mail.transport.protocol","smtp" );
		// 추가된 SMTP 인증할때에 넣어줘야되는 부분
		
		Authenticator authenticator = new Authenticator() {
	        protected PasswordAuthentication getPasswordAuthentication() {
	            return new PasswordAuthentication(user, pw);
	          }
	    };

	    mailSession = Session.getInstance(props, authenticator);

	    // create a message       
	    try {
		    Message msg = new MimeMessage(mailSession);

			String[] toAddress = to.split(",");
			InternetAddress[] address = new InternetAddress[toAddress.length];
			
			for( int i = 0 ; i < toAddress.length ; i++ ) {
				address[i] = new InternetAddress(toAddress[i]);
			}
			
			try {
				msg.setFrom(new InternetAddress(from,fromName,"UTF-8"));
			} catch (UnsupportedEncodingException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			msg.setRecipients(Message.RecipientType.TO, address);
			msg.setSubject(subject);
			msg.setSentDate(new java.util.Date());
			if(multiPartFile.getSize() == 0) {
				//메일 내용
				msg.setContent(content,"text/html; charset=euc-kr"); // HTML 형식		
			}
			if(multiPartFile.getSize() != 0) {
				 MimeMessageHelper helper = new MimeMessageHelper((MimeMessage) msg, true,"UTF-8");
					
					//메일 내용 
					helper.setText(content,true);
			        //첨부 파일 설정
			        String fileName = multiPartFile.getOriginalFilename();
			        
			        try {
						helper.addAttachment(MimeUtility.encodeText(fileName, "UTF-8", "B"), new ByteArrayResource(IOUtils.toByteArray(multiPartFile.getInputStream())));
					} catch (UnsupportedEncodingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			              
			}
			
			Transport.send(msg);
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("실패1 : " + e);
			System.out.println("실패 이유 : " + e.getMessage());
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("실패2"+ e);
			System.out.println("실패 이유 : " + e.getMessage());
		}
%>
	<script>
		alert('메일이 발송 되었습니다.'); 
		location.href = "/?menuno=" + ${rmenuno};
	</script>
<%		
	}else{
%>
	<script>
		alert('입력하신 정보가 정확하지 않습니다.\n다시 확인하시고 입력해 주세요.');
		location.href = "";
	</script>
<%		
	}
%>

