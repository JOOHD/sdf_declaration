package com.z5.zcms.admsys.user.domain;

import java.io.Serializable;
import java.util.List;

public class ZUserVo extends ZUser implements Serializable {
	private static final long serialVersionUID = 1L;
	private int pageSize;
	private int pageIndex;
	private String cond1;  // 우편번호
	private String cond2;  // 기본 주소
	private String cond3;  // 상세 주소
	private String cond4;  // 집 전화번호
	private String cond5;  // 휴대전화
	private String cond6;  // 담당업무
	private String cond7;  // 직급
	private String cond8;  // 발생일시
	private String cond9;  // 신고 제목
	private String cond10; // 신고 내용
	
	private String cond11; //
	private String cond12; // 22.12.23 추가 (이메일)
	private String cond13; // 22.12.27 추가 (NiceID DI)
	
	private String keyword;
	private String sdate;
	private String edate;
	private int n;
	private int m;
	private String sitedomain;
	private String sitetitle;
	private String tx_content;
	private int cnt;
	private int maxno;
	private String authority;
	private String holoff;
	private String hq_cd;
	private String hq_nm;
	private String dept_cd;
	private String dept_nm;
	private String dept_full_nm;
	private String holoff_cls;
	private String tel_offc;
	private String gpin_code;
	private String nice_code;
	private String annualPause;
	private String limitYearMonth;
	private String duesno;
	private String duesjoin;
	private String semimemberconfirm;
	private String etc;
	private String regyear;
	private String payCheck;
	private String andOr;
	private String search;
	private String paytype2;
	private String workplace;
	private String postal;
	private String account_code;
	private String account_no;
	private String paytype;
	private String executive;
	private String executivenm;
	private String committee;
	private String committeenm;
	private String groupuser;
	private String usercompanyname;
	private String usercompanystatus;
	private String cancelreason;
	private String pausereason;
	private String orgUserDelegate;
	private String orgOfficer;
	private String orgUserOfficer;
	private String orgUserDept;
	private String orgUserEmail;
	private String orgUserPhone;
	private String orgUserType;
	private String approve;
	private String foreigner;
	private String workGrade;
	private String branch;
	private String vlseq;
	private String count;
	private String visitdate;
	private String st_sec1;
	private String st_sec2;
	private String st_sec3;
	private String logdate;
	private String logip;
	private String logname;
	private int logboardno;
	private int logbbsno;
	private String logact;
	private int siteno;
	private int menuno;
	private List<ZUserVo> yearList;
	private List<ZUserVo> monthList;
	private List<ZUserVo> dayList;
	private String dayOfMonth;
	private String inter_subject;
	private String inter_object;
	private String hope_area1;
	private String hope_area2;
	private String mento_exp;
	private String mento_agency;
	private String mento_period;
	private String mento_motive;
	private String menti_future;
	private String menti_motive;
	private String pro_id;
	private String apply_type;
	private String mentoringCnt;
	private String eventCnt;
	private String eduCnt;
	private String email1;
	private String email2;
	private String reg_dt;
	private String re_agree_date;
	private String select;
	private String groupby;
	private String usernos;
	private String cnt_per;
	private String sns_naver_token;
	private String sns_kakao_token;
	private String whereQry;
	private String adr1officer;
	private int seq;
	private String tablePrefix;
	private List<Integer> arrDeleteNo;
	private String downid;
	private String downname;
	private String downdate;
	private String downip;
	private String downmenu;
	private String downdetail;
	private String downreason;
	private String newsYn;
	private String snsYn;
	private String emailYn;
	private String checkid;
	private String checkpw;
	private String DI;
	private String sns_google_token;
	private String sns_facebook_token;
	private String news_yn;
	private String sns_yn;
	private String email_yn;

	public String getSns_facebook_token() {
		return this.sns_facebook_token;
	}

	public void setSns_facebook_token(String sns_facebook_token) {
		this.sns_facebook_token = sns_facebook_token;
	}

	public String getSns_google_token() {
		return this.sns_google_token;
	}

	public void setSns_google_token(String sns_google_token) {
		this.sns_google_token = sns_google_token;
	}

	public String getDI() {
		return this.DI;
	}

	public void setDI(String dI) {
		this.DI = dI;
	}

	public String getCheckid() {
		return this.checkid;
	}

	public void setCheckid(String checkid) {
		this.checkid = checkid;
	}

	public String getCheckpw() {
		return this.checkpw;
	}

	public void setCheckpw(String checkpw) {
		this.checkpw = checkpw;
	}

	public String getNewsYn() {
		return this.newsYn;
	}

	public void setNewsYn(String newsYn) {
		this.newsYn = newsYn;
	}

	public String getSnsYn() {
		return this.snsYn;
	}

	public void setSnsYn(String snsYn) {
		this.snsYn = snsYn;
	}

	public String getEmailYn() {
		return this.emailYn;
	}

	public void setEmailYn(String emailYn) {
		this.emailYn = emailYn;
	}

	public int getMenuno() {
		return this.menuno;
	}

	public void setMenuno(int menuno) {
		this.menuno = menuno;
	}

	public String getInter_subject() {
		return this.inter_subject;
	}

	public void setInter_subject(String inter_subject) {
		this.inter_subject = inter_subject;
	}

	public String getInter_object() {
		return this.inter_object;
	}

	public void setInter_object(String inter_object) {
		this.inter_object = inter_object;
	}

	public String getHope_area1() {
		return this.hope_area1;
	}

	public void setHope_area1(String hope_area1) {
		this.hope_area1 = hope_area1;
	}

	public String getHope_area2() {
		return this.hope_area2;
	}

	public void setHope_area2(String hope_area2) {
		this.hope_area2 = hope_area2;
	}

	public String getMento_exp() {
		return this.mento_exp;
	}

	public void setMento_exp(String mento_exp) {
		this.mento_exp = mento_exp;
	}

	public String getMento_agency() {
		return this.mento_agency;
	}

	public void setMento_agency(String mento_agency) {
		this.mento_agency = mento_agency;
	}

	public String getMento_period() {
		return this.mento_period;
	}

	public void setMento_period(String mento_period) {
		this.mento_period = mento_period;
	}

	public String getMento_motive() {
		return this.mento_motive;
	}

	public void setMento_motive(String mento_motive) {
		this.mento_motive = mento_motive;
	}

	public String getMenti_future() {
		return this.menti_future;
	}

	public void setMenti_future(String menti_future) {
		this.menti_future = menti_future;
	}

	public String getMenti_motive() {
		return this.menti_motive;
	}

	public void setMenti_motive(String menti_motive) {
		this.menti_motive = menti_motive;
	}

	public String getPro_id() {
		return this.pro_id;
	}

	public void setPro_id(String pro_id) {
		this.pro_id = pro_id;
	}

	public String getApply_type() {
		return this.apply_type;
	}

	public void setApply_type(String apply_type) {
		this.apply_type = apply_type;
	}

	public String getMentoringCnt() {
		return this.mentoringCnt;
	}

	public void setMentoringCnt(String mentoringCnt) {
		this.mentoringCnt = mentoringCnt;
	}

	public String getEventCnt() {
		return this.eventCnt;
	}

	public void setEventCnt(String eventCnt) {
		this.eventCnt = eventCnt;
	}

	public String getEduCnt() {
		return this.eduCnt;
	}

	public void setEduCnt(String eduCnt) {
		this.eduCnt = eduCnt;
	}

	public String getEmail1() {
		return this.email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public String getEmail2() {
		return this.email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public String getReg_dt() {
		return this.reg_dt;
	}

	public void setReg_dt(String reg_dt) {
		this.reg_dt = reg_dt;
	}

	public String getRe_agree_date() {
		return this.re_agree_date;
	}

	public void setRe_agree_date(String re_agree_date) {
		this.re_agree_date = re_agree_date;
	}

	public String getSelect() {
		return this.select;
	}

	public void setSelect(String select) {
		this.select = select;
	}

	public String getGroupby() {
		return this.groupby;
	}

	public void setGroupby(String groupby) {
		this.groupby = groupby;
	}

	public String getUsernos() {
		return this.usernos;
	}

	public void setUsernos(String usernos) {
		this.usernos = usernos;
	}

	public String getCnt_per() {
		return this.cnt_per;
	}

	public void setCnt_per(String cnt_per) {
		this.cnt_per = cnt_per;
	}

	public String getSns_naver_token() {
		return this.sns_naver_token;
	}

	public void setSns_naver_token(String sns_naver_token) {
		this.sns_naver_token = sns_naver_token;
	}

	public String getSns_kakao_token() {
		return this.sns_kakao_token;
	}

	public void setSns_kakao_token(String sns_kakao_token) {
		this.sns_kakao_token = sns_kakao_token;
	}

	public String getWhereQry() {
		return this.whereQry;
	}

	public void setWhereQry(String whereQry) {
		this.whereQry = whereQry;
	}

	public String getAdr1officer() {
		return this.adr1officer;
	}

	public void setAdr1officer(String adr1officer) {
		this.adr1officer = adr1officer;
	}

	public String getDayOfMonth() {
		return this.dayOfMonth;
	}

	public void setDayOfMonth(String dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}

	public List<ZUserVo> getYearList() {
		return this.yearList;
	}

	public void setYearList(List<ZUserVo> yearList) {
		this.yearList = yearList;
	}

	public List<ZUserVo> getMonthList() {
		return this.monthList;
	}

	public void setMonthList(List<ZUserVo> monthList) {
		this.monthList = monthList;
	}

	public List<ZUserVo> getDayList() {
		return this.dayList;
	}

	public void setDayList(List<ZUserVo> dayList) {
		this.dayList = dayList;
	}

	public int getSiteno() {
		return this.siteno;
	}

	public void setSiteno(int siteno) {
		this.siteno = siteno;
	}

	public String getCond7() {
		return this.cond7;
	}

	public void setCond7(String cond7) {
		this.cond7 = cond7;
	}

	public String getCond8() {
		return this.cond8;
	}

	public void setCond8(String cond8) {
		this.cond8 = cond8;
	}

	public String getCond9() {
		return this.cond9;
	}

	public void setCond9(String cond9) {
		this.cond9 = cond9;
	}

	public String getCond10() {
		return this.cond10;
	}

	public void setCond10(String cond10) {
		this.cond10 = cond10;
	}
	
	public String getCond11() {
		return cond11;
	}

	public void setCond11(String cond11) {
		this.cond11 = cond11;
	}

	public String getCond12() {
		return cond12;
	}

	public void setCond12(String cond12) {
		this.cond12 = cond12;
	}

	public String getCond13() {
		return cond13;
	}

	public void setCond13(String cond13) {
		this.cond13 = cond13;
	}
	
	public String getCond14() {	
		return cond14;	
	}	
	public void setCond14(String cond14) {	
		this.cond14 = cond14;	
	}

	public String getRegyear() {
		return this.regyear;
	}

	public void setRegyear(String regyear) {
		this.regyear = regyear;
	}

	public String getEtc() {
		return this.etc;
	}

	public void setEtc(String etc) {
		this.etc = etc;
	}

	public String getWorkplace() {
		return this.workplace;
	}

	public void setWorkplace(String workplace) {
		this.workplace = workplace;
	}

	public String getPostal() {
		return this.postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}

	public String getAccount_code() {
		return this.account_code;
	}

	public void setAccount_code(String account_code) {
		this.account_code = account_code;
	}

	public String getAccount_no() {
		return this.account_no;
	}

	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}

	public String getPaytype() {
		return this.paytype;
	}

	public void setPaytype(String paytype) {
		this.paytype = paytype;
	}

	public String getExecutive() {
		return this.executive;
	}

	public void setExecutive(String executive) {
		this.executive = executive;
	}

	public String getCommittee() {
		return this.committee;
	}

	public void setCommittee(String committee) {
		this.committee = committee;
	}

	public String getForeigner() {
		return this.foreigner;
	}

	public void setForeigner(String foreigner) {
		this.foreigner = foreigner;
	}

	public String getSemimemberconfirm() {
		return this.semimemberconfirm;
	}

	public void setSemimemberconfirm(String semimemberconfirm) {
		this.semimemberconfirm = semimemberconfirm;
	}

	public String getDuesjoin() {
		return this.duesjoin;
	}

	public void setDuesjoin(String duesjoin) {
		this.duesjoin = duesjoin;
	}

	public String getDuesno() {
		return this.duesno;
	}

	public void setDuesno(String duesno) {
		this.duesno = duesno;
	}

	public String getLimitYearMonth() {
		return this.limitYearMonth;
	}

	public void setLimitYearMonth(String limitYearMonth) {
		this.limitYearMonth = limitYearMonth;
	}

	public String getAnnualPause() {
		return this.annualPause;
	}

	public void setAnnualPause(String annualPause) {
		this.annualPause = annualPause;
	}

	public String getHq_cd() {
		return this.hq_cd;
	}

	public void setHq_cd(String hq_cd) {
		this.hq_cd = hq_cd;
	}

	public String getHq_nm() {
		return this.hq_nm;
	}

	public void setHq_nm(String hq_nm) {
		this.hq_nm = hq_nm;
	}

	public String getDept_cd() {
		return this.dept_cd;
	}

	public void setDept_cd(String dept_cd) {
		this.dept_cd = dept_cd;
	}

	public String getDept_nm() {
		return this.dept_nm;
	}

	public void setDept_nm(String dept_nm) {
		this.dept_nm = dept_nm;
	}

	public String getDept_full_nm() {
		return this.dept_full_nm;
	}

	public void setDept_full_nm(String dept_full_nm) {
		this.dept_full_nm = dept_full_nm;
	}

	public String getHoloff_cls() {
		return this.holoff_cls;
	}

	public void setHoloff_cls(String holoff_cls) {
		this.holoff_cls = holoff_cls;
	}

	public String getTel_offc() {
		return this.tel_offc;
	}

	public void setTel_offc(String tel_offc) {
		this.tel_offc = tel_offc;
	}

	public String getHoloff() {
		return this.holoff;
	}

	public void setHoloff(String holoff) {
		this.holoff = holoff;
	}

	public String getCond4() {
		return this.cond4;
	}

	public void setCond4(String cond4) {
		this.cond4 = cond4;
	}

	public String getCond5() {
		return this.cond5;
	}

	public void setCond5(String cond5) {
		this.cond5 = cond5;
	}

	public String getAuthority() {
		return this.authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getCond3() {
		return this.cond3;
	}

	public void setCond3(String cond3) {
		this.cond3 = cond3;
	}

	public int getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public String getCond1() {
		return this.cond1;
	}

	public void setCond1(String cond1) {
		this.cond1 = cond1;
	}

	public String getCond2() {
		return this.cond2;
	}

	public void setCond2(String cond2) {
		this.cond2 = cond2;
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getSdate() {
		return this.sdate;
	}

	public void setSdate(String sdate) {
		this.sdate = sdate;
	}

	public String getEdate() {
		return this.edate;
	}

	public void setEdate(String edate) {
		this.edate = edate;
	}

	public int getN() {
		return this.n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getM() {
		return this.m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public String getSitedomain() {
		return this.sitedomain;
	}

	public void setSitedomain(String sitedomain) {
		this.sitedomain = sitedomain;
	}

	public String getSitetitle() {
		return this.sitetitle;
	}

	public void setSitetitle(String sitetitle) {
		this.sitetitle = sitetitle;
	}

	public String getTx_content() {
		return this.tx_content;
	}

	public void setTx_content(String tx_content) {
		this.tx_content = tx_content;
	}

	public int getCnt() {
		return this.cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public int getMaxno() {
		return this.maxno;
	}

	public void setMaxno(int maxno) {
		this.maxno = maxno;
	}

	public String getGpin_code() {
		return this.gpin_code;
	}

	public void setGpin_code(String gpin_code) {
		this.gpin_code = gpin_code;
	}

	public String getNice_code() {
		return this.nice_code;
	}

	public void setNice_code(String nice_code) {
		this.nice_code = nice_code;
	}

	public String getOrgUserDelegate() {
		return this.orgUserDelegate;
	}

	public void setOrgUserDelegate(String orgUserDelegate) {
		this.orgUserDelegate = orgUserDelegate;
	}

	public String getOrgUserOfficer() {
		return this.orgUserOfficer;
	}

	public void setOrgUserOfficer(String orgUserOfficer) {
		this.orgUserOfficer = orgUserOfficer;
	}

	public String getOrgUserDept() {
		return this.orgUserDept;
	}

	public void setOrgUserDept(String orgUserDept) {
		this.orgUserDept = orgUserDept;
	}

	public String getOrgUserEmail() {
		return this.orgUserEmail;
	}

	public void setOrgUserEmail(String orgUserEmail) {
		this.orgUserEmail = orgUserEmail;
	}

	public String getOrgUserPhone() {
		return this.orgUserPhone;
	}

	public void setOrgUserPhone(String orgUserPhone) {
		this.orgUserPhone = orgUserPhone;
	}

	public String getGroupuser() {
		return this.groupuser;
	}

	public void setGroupuser(String groupuser) {
		this.groupuser = groupuser;
	}

	public String getOrgUserType() {
		return this.orgUserType;
	}

	public void setOrgUserType(String orgUserType) {
		this.orgUserType = orgUserType;
	}

	public String getOrgOfficer() {
		return this.orgOfficer;
	}

	public void setOrgOfficer(String orgOfficer) {
		this.orgOfficer = orgOfficer;
	}

	public String getExecutivenm() {
		return this.executivenm;
	}

	public void setExecutivenm(String executivenm) {
		this.executivenm = executivenm;
	}

	public String getCommitteenm() {
		return this.committeenm;
	}

	public void setCommitteenm(String committeenm) {
		this.committeenm = committeenm;
	}

	public String getWorkGrade() {
		return this.workGrade;
	}

	public void setWorkGrade(String workGrade) {
		this.workGrade = workGrade;
	}

	public String getBranch() {
		return this.branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCount() {
		return this.count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getVlseq() {
		return this.vlseq;
	}

	public void setVlseq(String vlseq) {
		this.vlseq = vlseq;
	}

	public String getVisitdate() {
		return this.visitdate;
	}

	public void setVisitdate(String visitdate) {
		this.visitdate = visitdate;
	}

	public String getSt_sec1() {
		return this.st_sec1;
	}

	public void setSt_sec1(String st_sec1) {
		this.st_sec1 = st_sec1;
	}

	public String getSt_sec2() {
		return this.st_sec2;
	}

	public void setSt_sec2(String st_sec2) {
		this.st_sec2 = st_sec2;
	}

	public String getCond6() {
		return this.cond6;
	}

	public void setCond6(String cond6) {
		this.cond6 = cond6;
	}

	public String getPayCheck() {
		return this.payCheck;
	}

	public void setPayCheck(String payCheck) {
		this.payCheck = payCheck;
	}

	public String getAndOr() {
		return this.andOr;
	}

	public void setAndOr(String andOr) {
		this.andOr = andOr;
	}

	public String getSearch() {
		return this.search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public String getPaytype2() {
		return this.paytype2;
	}

	public void setPaytype2(String paytype2) {
		this.paytype2 = paytype2;
	}

	public String getSt_sec3() {
		return this.st_sec3;
	}

	public void setSt_sec3(String st_sec3) {
		this.st_sec3 = st_sec3;
	}

	public String getUsercompanyname() {
		return this.usercompanyname;
	}

	public void setUsercompanyname(String usercompanyname) {
		this.usercompanyname = usercompanyname;
	}

	public String getUsercompanystatus() {
		return this.usercompanystatus;
	}

	public void setUsercompanystatus(String usercompanystatus) {
		this.usercompanystatus = usercompanystatus;
	}

	public String getCancelreason() {
		return this.cancelreason;
	}

	public void setCancelreason(String cancelreason) {
		this.cancelreason = cancelreason;
	}

	public String getPausereason() {
		return this.pausereason;
	}

	public void setPausereason(String pausereason) {
		this.pausereason = pausereason;
	}

	public String getApprove() {
		return this.approve;
	}

	public void setApprove(String approve) {
		this.approve = approve;
	}

	public String getLogdate() {
		return this.logdate;
	}

	public void setLogdate(String logdate) {
		this.logdate = logdate;
	}

	public String getLogip() {
		return this.logip;
	}

	public void setLogip(String logip) {
		this.logip = logip;
	}

	public String getLogname() {
		return this.logname;
	}

	public void setLogname(String logname) {
		this.logname = logname;
	}

	public int getLogboardno() {
		return this.logboardno;
	}

	public void setLogboardno(int logboardno) {
		this.logboardno = logboardno;
	}

	public int getLogbbsno() {
		return this.logbbsno;
	}

	public void setLogbbsno(int logbbsno) {
		this.logbbsno = logbbsno;
	}

	public String getLogact() {
		return this.logact;
	}

	public void setLogact(String logact) {
		this.logact = logact;
	}

	public int getSeq() {
		return this.seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getTablePrefix() {
		return this.tablePrefix;
	}

	public void setTablePrefix(String tablePrefix) {
		this.tablePrefix = tablePrefix;
	}

	public List<Integer> getArrDeleteNo() {
		return this.arrDeleteNo;
	}

	public void setArrDeleteNo(List<Integer> arrDeleteNo) {
		this.arrDeleteNo = arrDeleteNo;
	}

	public String getDownid() {
		return this.downid;
	}

	public void setDownid(String downid) {
		this.downid = downid;
	}

	public String getDownname() {
		return this.downname;
	}

	public void setDownname(String downname) {
		this.downname = downname;
	}

	public String getDowndate() {
		return this.downdate;
	}

	public void setDowndate(String downdate) {
		this.downdate = downdate;
	}

	public String getDownip() {
		return this.downip;
	}

	public void setDownip(String downip) {
		this.downip = downip;
	}

	public String getDownmenu() {
		return this.downmenu;
	}

	public void setDownmenu(String downmenu) {
		this.downmenu = downmenu;
	}

	public String getDowndetail() {
		return this.downdetail;
	}

	public void setDowndetail(String downdetail) {
		this.downdetail = downdetail;
	}

	public String getDownreason() {
		return this.downreason;
	}

	public void setDownreason(String downreason) {
		this.downreason = downreason;
	}
  
  public String getNews_yn()
	{
		return news_yn;
	}

	public void setNews_yn(String news_yn)
	{
		this.news_yn = news_yn;
	}

	public String getSns_yn()
	{
		return sns_yn;
	}

	public void setSns_yn(String sns_yn)
	{
		this.sns_yn = sns_yn;
	}

	public String getEmail_yn()
	{
		return email_yn;
	}

	public void setEmail_yn(String email_yn)
	{
		this.email_yn = email_yn;
	}

public String toString() {
    return "ZUserVo{pageSize=" + 
      this.pageSize + 
      ", pageIndex=" + this.pageIndex + 
      ", cond1='" + this.cond1 + '\'' + 
      ", cond2='" + this.cond2 + '\'' + 
      ", cond3='" + this.cond3 + '\'' + 
      ", cond4='" + this.cond4 + '\'' + 
      ", cond5='" + this.cond5 + '\'' + 
      ", cond6='" + this.cond6 + '\'' + 
      ", cond7='" + this.cond7 + '\'' + 
      ", cond8='" + this.cond8 + '\'' + 
      ", cond9='" + this.cond9 + '\'' + 
      ", cond10='" + this.cond10 + '\'' + 
      ", keyword='" + this.keyword + '\'' + 
      ", sdate='" + this.sdate + '\'' + 
      ", edate='" + this.edate + '\'' + 
      ", n=" + this.n + 
      ", m=" + this.m + 
      ", sitedomain='" + this.sitedomain + '\'' + 
      ", sitetitle='" + this.sitetitle + '\'' + 
      ", tx_content='" + this.tx_content + '\'' + 
      ", cnt=" + this.cnt + 
      ", maxno=" + this.maxno + 
      ", authority='" + this.authority + '\'' + 
      ", holoff='" + this.holoff + '\'' + 
      ", hq_cd='" + this.hq_cd + '\'' + 
      ", hq_nm='" + this.hq_nm + '\'' + 
      ", dept_cd='" + this.dept_cd + '\'' + 
      ", dept_nm='" + this.dept_nm + '\'' + 
      ", dept_full_nm='" + this.dept_full_nm + '\'' + 
      ", holoff_cls='" + this.holoff_cls + '\'' + 
      ", tel_offc='" + this.tel_offc + '\'' + 
      ", gpin_code='" + this.gpin_code + '\'' + 
      ", nice_code='" + this.nice_code + '\'' + 
      ", annualPause='" + this.annualPause + '\'' + 
      ", limitYearMonth='" + this.limitYearMonth + '\'' + 
      ", duesno='" + this.duesno + '\'' + 
      ", duesjoin='" + this.duesjoin + '\'' + 
      ", semimemberconfirm='" + this.semimemberconfirm + '\'' + 
      ", etc='" + this.etc + '\'' + 
      ", regyear='" + this.regyear + '\'' + 
      ", payCheck='" + this.payCheck + '\'' + 
      ", andOr='" + this.andOr + '\'' + 
      ", search='" + this.search + '\'' + 
      ", paytype2='" + this.paytype2 + '\'' + 
      ", workplace='" + this.workplace + '\'' + 
      ", postal='" + this.postal + '\'' + 
      ", account_code='" + this.account_code + '\'' + 
      ", account_no='" + this.account_no + '\'' + 
      ", paytype='" + this.paytype + '\'' + 
      ", executive='" + this.executive + '\'' + 
      ", executivenm='" + this.executivenm + '\'' + 
      ", committee='" + this.committee + '\'' + 
      ", committeenm='" + this.committeenm + '\'' + 
      ", groupuser='" + this.groupuser + '\'' + 
      ", usercompanyname='" + this.usercompanyname + '\'' + 
      ", usercompanystatus='" + this.usercompanystatus + '\'' + 
      ", cancelreason='" + this.cancelreason + '\'' + 
      ", pausereason='" + this.pausereason + '\'' + 
      ", orgUserDelegate='" + this.orgUserDelegate + '\'' + 
      ", orgOfficer='" + this.orgOfficer + '\'' + 
      ", orgUserOfficer='" + this.orgUserOfficer + '\'' + 
      ", orgUserDept='" + this.orgUserDept + '\'' + 
      ", orgUserEmail='" + this.orgUserEmail + '\'' + 
      ", orgUserPhone='" + this.orgUserPhone + '\'' + 
      ", orgUserType='" + this.orgUserType + '\'' + 
      ", approve='" + this.approve + '\'' + 
      ", foreigner='" + this.foreigner + '\'' + 
      ", workGrade='" + this.workGrade + '\'' + 
      ", branch='" + this.branch + '\'' + 
      ", vlseq='" + this.vlseq + '\'' + 
      ", count='" + this.count + '\'' + 
      ", visitdate='" + this.visitdate + '\'' + 
      ", st_sec1='" + this.st_sec1 + '\'' + 
      ", st_sec2='" + this.st_sec2 + '\'' + 
      ", st_sec3='" + this.st_sec3 + '\'' + 
      ", logdate='" + this.logdate + '\'' + 
      ", logip='" + this.logip + '\'' + 
      '}';
  }
}


/* Location:              /Volumes/Mac_Ext 1/재단홈페이지/sdf.zsol.co.kr/WEB-INF/classes/!/com/z5/zcms/admsys/user/domain/ZUserVo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */