package com.z5.zcms.admsys.user.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.z5.zcms.admsys.user.domain.SearchUser;
import com.z5.zcms.admsys.user.domain.ZUser;
import com.z5.zcms.admsys.user.domain.ZUser2Vo;
import com.z5.zcms.admsys.user.domain.ZUserOrgVo;
import com.z5.zcms.admsys.user.domain.ZUserVo;
import com.z5.zcms.frontsys.front.domain.MenuStaffVO;

import egovframework.com.cmm.service.impl.EgovComAbstractDAO;

@Repository
public class ZUserDAOImpl extends EgovComAbstractDAO implements ZUserDAO {
	private final String sqlMapNs = "ZUser.";

    // 부조리 신고 센터 
    public void InsertCall(ZUserVo zUserVo) {
		insert("ZUser.InsertCall", zUserVo);
	}

	public Integer listCountUser(ZUserVo vo) {
		return (Integer) selectByPk("ZUser.listCountUser", vo);
	}

	public List<ZUserVo> searchListUser(ZUserVo vo) {
		return list("ZUser.searchListUser", vo);
	}

	public List<ZUserOrgVo> orgSearchListUser(ZUserVo vo) {
		return list("ZUser.orgSearchListUser", vo);
	}

	public List<ZUserVo> getListUser(ZUserVo vo) {
		return list("ZUser.getListUser", vo);
	}

	public List<ZUserVo> getUsers() {
		return list("ZUser.getUsers", null);
	}

	public Integer listCountAdmin(ZUserVo vo) {
		return (Integer) selectByPk("ZUser.listCountAdmin", vo);
	}

	public List<ZUserVo> getListAdmin(ZUserVo vo) {
		return list("ZUser.getListAdmin", vo);
	}

	public List<ZUserVo> getAllList(ZUserVo vo) {
		return list("ZUser.getAllList", vo);
	}

	public void delete(List<Integer> arrDeleteNo) {
		delete("ZUser.delete", arrDeleteNo);
	}

	public void deleteAuth(List<Integer> arrDeleteNo) {
		delete("ZUser.deleteAuth", arrDeleteNo);
	}

	public void deleteAlluserplus(List<Integer> arrDeleteNo) {
		delete("ZUser.deleteAlluserplus", arrDeleteNo);
	}

	public void deleteAlluserlicens(List<Integer> arrDeleteNo) {
		delete("ZUser.deleteAlluserlicens", arrDeleteNo);
	}

	public void deleteAllusercareer(List<Integer> arrDeleteNo) {
		delete("ZUser.deleteAllusercareer", arrDeleteNo);
	}

	public void deleteAlluseraward(List<Integer> arrDeleteNo) {
		delete("ZUser.deleteAlluseraward", arrDeleteNo);
	}

	public void deleteAlluseracademic(List<Integer> arrDeleteNo) {
		delete("ZUser.deleteAlluseracademic", arrDeleteNo);
	}

	public void deleteAllusersociety(List<Integer> arrDeleteNo) {
		delete("ZUser.deleteAllusersociety", arrDeleteNo);
	}

	public ZUserVo selectbypk(ZUserVo vo) {
		return (ZUserVo) selectByPk("ZUser.selectbypk", vo);
	}

	public void updateByAdmsys(ZUserVo vo) {
		update("ZUser.updateByAdmsys", vo);
	}

	public void updateAuthByAdmsys(ZUserVo vo) {
		update("ZUser.updateAuthByAdmsys", vo);
	}

	public void updateUserStatus(ZUserVo vo) {
		update("ZUser.updateUserStatus", vo);
	}

	public String insert(ZUserVo vo) {
		return (String) insert("ZUser.write", vo);
	}

	public List<ZUserVo> getlistAll(ZUserVo vo) {
		return list("ZUser.listAll", vo);
	}

	public Integer getSameUserIdCount(ZUserVo zUserVo) {
		return (Integer) selectByPk("ZUser.getSameUserIdCount", zUserVo);
	}

	public ZUserVo login(ZUserVo vo) {
		return (ZUserVo) selectByPk("ZUser.login", vo);
	}

	public void insertAuth(ZUserVo vo) {
		insert("ZUser.insertAuth", vo);
	}

	public ZUserVo getFindId(ZUserVo vo) {
		return (ZUserVo) selectByPk("ZUser.getFindId", vo);
	}

	public ZUserVo getFindPw(ZUserVo vo) {
		return (ZUserVo) selectByPk("ZUser.getFindPw", vo);
	}

	public void updateTmpPasswd(ZUserVo vo) {
		update("ZUser.updateTmpPasswd", vo);
	}

	public ZUserVo getInfo(ZUserVo vo) {
		return (ZUserVo) selectByPk("ZUser.getInfo", vo);
	}

	public void update(ZUserVo vo) {
		update("ZUser.update", vo);
	}

	public Integer getSameUseremailCount(String useremail) {
		return (Integer) selectByPk("ZUser.getSameUseremailCount", useremail);
	}

	public List<ZUserVo> listAll(ZUserVo vo) {
		return list("ZUser.listAll", vo);
	}

	public void setUserPasswdMD5(ZUserVo vo) {
		update("ZUser.setUserPasswdMD5", vo);
	}

	public String isUserInEpms(ZUserVo vo) {
		return (String) selectByPk("ZUser.isUserInEpms", vo);
	}

	public void updateEnabledToOne(String userid) {
		update("ZUser.updateEnabledToOne", userid);
	}

	public void updateIsTmpPasswdFlagY(String userid) {
		update("ZUser.updateIsTmpPasswdFlagY", userid);
	}

	public void updateIsTmpPasswdFlagN(String userid) {
		update("ZUser.updateIsTmpPasswdFlagN", userid);
	}

	public void updateUserPasswd(ZUserVo vo) {
		update("ZUser.updateUserPasswd", vo);
	}

	public void deleteOneUser(ZUserVo zUserVo) {
		delete("ZUser.deleteOneUser", zUserVo);
	}

	public void deleteOneAuth(ZUserVo zUserVo) {
		delete("ZUser.deleteOneAuth", zUserVo);
	}

	public void add_admin_from_kfuser(String cs_id) {
		insert("ZUser.add_admin_from_kfuser", cs_id);
	}

	public String getuserno(String string) {
		return (String) selectByPk("ZUser.getuserno", string);
	}

	public void insertuseraca(ZUser2Vo zUser2Vo2) {
		insert("ZUser.insertuseraca", zUser2Vo2);
	}

	public void insertusercareer(ZUser2Vo zUser2Vo2) {
		insert("ZUser.insertusercareer", zUser2Vo2);
	}

	public void insertuseraward(ZUser2Vo zUser2Vo2) {
		insert("ZUser.insertuseraward", zUser2Vo2);
	}

	public void insertuserlicens(ZUser2Vo zUser2Vo2) {
		insert("ZUser.insertuserlicens", zUser2Vo2);
	}

	public void insertuserplus(ZUser2Vo zUser2Vo) {
		insert("ZUser.insertuserplus", zUser2Vo);
	}

	public void insertusersociety(ZUser2Vo zUser2Vo) {
		insert("ZUser.insertusersociety", zUser2Vo);
	}

	public int getusercount(ZUserVo zUserVo) {
		return ((Integer) selectByPk("ZUser.getusercount", zUserVo)).intValue();
	}

	public ZUser2Vo getuserplus(ZUserVo zUserVo) {
		return (ZUser2Vo) selectByPk("ZUser.getuserplus", zUserVo);
	}

	public List<ZUser2Vo> getuserlicens(ZUserVo zUserVo) {
		return list("ZUser.getuserlicens", zUserVo);
	}

	public List<ZUser2Vo> getusercareer(ZUserVo zUserVo) {
		return list("ZUser.getusercareer", zUserVo);
	}

	public List<ZUser2Vo> getuseraward(ZUserVo zUserVo) {
		return list("ZUser.getuseraward", zUserVo);
	}

	public List<ZUser2Vo> getuseracademic(ZUserVo zUserVo) {
		return list("ZUser.getuseracademic", zUserVo);
	}

	public List<ZUser2Vo> getusersociety(ZUserVo zUserVo) {
		return list("ZUser.getusersociety", zUserVo);
	}

	public void updateuserplus(ZUser2Vo zUser2Vo) {
		update("ZUser.updateuserplus", zUser2Vo);
	}

	public void deleteuserlicens(ZUser2Vo zUser2Vo) {
		delete("ZUser.deleteuserlicens", zUser2Vo);
	}

	public void deleteusercareer(ZUser2Vo zUser2Vo) {
		delete("ZUser.deleteusercareer", zUser2Vo);
	}

	public void deleteuseraward(ZUser2Vo zUser2Vo) {
		delete("ZUser.deleteuseraward", zUser2Vo);
	}

	public void deleteuseracademic(ZUser2Vo zUser2Vo) {
		delete("ZUser.deleteuseracademic", zUser2Vo);
	}

	public void deleteusersociety(ZUser2Vo zUser2Vo) {
		delete("ZUser.deleteusersociety", zUser2Vo);
	}

	public void userCommitForStudent(String userid) {
		update("ZUser.userCommitForStudent", userid);
	}

	public void updateuseroutrequestToZero(ZUserVo zUserVo) {
		update("ZUser.updateuseroutrequestToZero", zUserVo);
	}

	public void updateEnabledToZero(String userno) {
		update("ZUser.updateEnabledToZero", userno);
	}

	public void updateRequestEnabledToNomal(String userno) {
		update("ZUser.updateRequestEnabledToNomal", userno);
	}

	public int listCountSearch(SearchUser searchUser) {
		return ((Integer) selectByPk("ZUser.listCountSearch", searchUser)).intValue();
	}

	public List<SearchUser> getListSearch(SearchUser searchUser) {
		return list("ZUser.getListSearch", searchUser);
	}

	public List<SearchUser> getListSearchAll(SearchUser searchUser) {
		return list("ZUser.getListSearchAll", searchUser);
	}

	public void insertOrgUser(ZUserOrgVo vo) {
		insert("ZUser.insertOrgUser", vo);
	}

	public Integer getOrgUserListCount(ZUserVo vo) {
		return (Integer) selectByPk("ZUser.getOrgUserListCount", vo);
	}

	public List<ZUserVo> getOrgUserList(ZUserVo vo) {
		return list("ZUser.getOrgUserList", vo);
	}

	public ZUserOrgVo getOrgUserDataByNo(ZUserOrgVo vo) {
		return (ZUserOrgVo) selectByPk("ZUser.getOrgUserDataByNo", vo);
	}

	public void updateOrgUser(ZUserVo vo) {
		update("ZUser.updateOrgZUser", vo);
	}

	public void updateOrgUser(ZUserOrgVo vo) {
		update("ZUser.updateOrgUserInfo", vo);
	}

	public void deleteOrgUser(List<Integer> arrDeleteNo) {
		delete("ZUser.deleteOrgUser", arrDeleteNo);
	}

	public Integer selectVote(ZUserVo vo) {
		return (Integer) selectByPk("ZUser.selectVote", vo);
	}

	public Integer listCountKF(MenuStaffVO menuStaffVO) {
		return (Integer) selectByPk("ZUser.listCountKF", menuStaffVO);
	}

	public List<ZUserVo> getListKF(MenuStaffVO menuStaffVO) {
		return list("ZUser.getListKF", menuStaffVO);
	}

	public MenuStaffVO getInfoKFUser(String cs_id) {
		return (MenuStaffVO) selectByPk("ZUser.getInfoKFUser", cs_id);
	}

	public void userUpdateInfo(ZUserVo vo) {
		update("ZUser.userUpdateInfo", vo);
	}

	public void userUpdateMailYn(ZUserVo vo) {
		update("ZUser.userUpdateMailYn", vo);
	}

	public Integer regDupchk(ZUserVo zUserVo) {
		return (Integer) selectByPk("ZUser.regDupchk", zUserVo);
	}

	public Integer userUpdatePw(ZUserVo vo) {
		return Integer.valueOf(update("ZUser.userUpdatePw", vo));
	}

	public Integer getSameEmailCount(ZUserVo zUserVo) {
		return (Integer) selectByPk("ZUser.getSameEmailCount", zUserVo);
	}

	public void deleteNewsletter(ZUserVo zUserVo) {
		delete("ZUser.deleteNewsletter", zUserVo);
	}

	public void InsertNewsletter(ZUserVo zUserVo) {
		insert("ZUser.InsertNewsletter", zUserVo);
	}

	public List<ZUserVo> getscrapSearch1(ZUserVo zUserVo) {
		return list("ZUser.getscrapSearch1", zUserVo);
	}
	
	public int leave(String userid) {
		return update ("ZUser.leave", userid);
	}
	public String leave2(ZUser zUser) {
		return (String) selectByPk("ZUser.chkPassword", zUser);
	}

	public int userStatusCheck(String userid) {
		return (Integer) selectByPk("ZUser.getUserStatus", userid);
	}
	
	public ZUserVo checkCode(ZUserVo zUserVo) {
		return (ZUserVo) selectByPk("ZUser.checkCode", zUserVo);
	}
	
	
}

/*
 * Location: /Volumes/Mac_Ext
 * 1/재단홈페이지/sdf.zsol.co.kr/WEB-INF/classes/!/com/z5/zcms/admsys/user/dao/
 * ZUserDAOImpl.class Java compiler version: 8 (52.0) JD-Core Version: 1.1.3
 */