package com.z5.zcms.admsys.user.dao;

import java.util.List;

import com.z5.zcms.admsys.user.domain.SearchUser;
import com.z5.zcms.admsys.user.domain.ZUser;
import com.z5.zcms.admsys.user.domain.ZUser2Vo;
import com.z5.zcms.admsys.user.domain.ZUserOrgVo;
import com.z5.zcms.admsys.user.domain.ZUserVo;
import com.z5.zcms.frontsys.front.domain.MenuStaffVO;

public interface ZUserDAO {

    // 부조리 신고 센터
	void InsertCall(ZUserVo paramZUserVo);

	Integer listCountUser(ZUserVo paramZUserVo);

	List<ZUserVo> searchListUser(ZUserVo paramZUserVo);

	List<ZUserOrgVo> orgSearchListUser(ZUserVo paramZUserVo);

	List<ZUserVo> getListUser(ZUserVo paramZUserVo);

	List<ZUserVo> getUsers();

	Integer listCountAdmin(ZUserVo paramZUserVo);

	List<ZUserVo> getListAdmin(ZUserVo paramZUserVo);

	List<ZUserVo> getAllList(ZUserVo paramZUserVo);

	void delete(List<Integer> paramList);

	void deleteAuth(List<Integer> paramList);

	void deleteAlluserplus(List<Integer> paramList);

	void deleteAlluserlicens(List<Integer> paramList);

	void deleteAllusercareer(List<Integer> paramList);

	void deleteAlluseraward(List<Integer> paramList);

	void deleteAlluseracademic(List<Integer> paramList);

	void deleteAllusersociety(List<Integer> paramList);

	ZUserVo selectbypk(ZUserVo paramZUserVo);

	void updateByAdmsys(ZUserVo paramZUserVo);

	String insert(ZUserVo paramZUserVo);

	List<ZUserVo> getlistAll(ZUserVo paramZUserVo);

	Integer getSameUserIdCount(ZUserVo paramZUserVo);

	ZUserVo login(ZUserVo paramZUserVo);

	void insertAuth(ZUserVo paramZUserVo);

	ZUserVo getFindId(ZUserVo paramZUserVo);

	ZUserVo getFindPw(ZUserVo paramZUserVo);

	void updateTmpPasswd(ZUserVo paramZUserVo);

	ZUserVo getInfo(ZUserVo paramZUserVo);

	void update(ZUserVo paramZUserVo);

	Integer getSameUseremailCount(String paramString);

	List<ZUserVo> listAll(ZUserVo paramZUserVo);

	void setUserPasswdMD5(ZUserVo paramZUserVo);

	void updateAuthByAdmsys(ZUserVo paramZUserVo);

	String isUserInEpms(ZUserVo paramZUserVo);

	void updateEnabledToOne(String paramString);

	void updateIsTmpPasswdFlagY(String paramString);

	void updateIsTmpPasswdFlagN(String paramString);

	void updateUserPasswd(ZUserVo paramZUserVo);

	void deleteOneUser(ZUserVo paramZUserVo);

	void deleteOneAuth(ZUserVo paramZUserVo);

	void add_admin_from_kfuser(String paramString);

	String getuserno(String paramString);

	void insertuseraca(ZUser2Vo paramZUser2Vo);

	void insertusercareer(ZUser2Vo paramZUser2Vo);

	void insertuseraward(ZUser2Vo paramZUser2Vo);

	void insertuserlicens(ZUser2Vo paramZUser2Vo);

	void insertuserplus(ZUser2Vo paramZUser2Vo);

	void insertusersociety(ZUser2Vo paramZUser2Vo);

	int getusercount(ZUserVo paramZUserVo);

	ZUser2Vo getuserplus(ZUserVo paramZUserVo);

	List<ZUser2Vo> getuserlicens(ZUserVo paramZUserVo);

	List<ZUser2Vo> getusercareer(ZUserVo paramZUserVo);

	List<ZUser2Vo> getuseraward(ZUserVo paramZUserVo);

	List<ZUser2Vo> getuseracademic(ZUserVo paramZUserVo);

	List<ZUser2Vo> getusersociety(ZUserVo paramZUserVo);

	void updateuserplus(ZUser2Vo paramZUser2Vo);

	void deleteuserlicens(ZUser2Vo paramZUser2Vo);

	void deleteusercareer(ZUser2Vo paramZUser2Vo);

	void deleteuseraward(ZUser2Vo paramZUser2Vo);

	void deleteuseracademic(ZUser2Vo paramZUser2Vo);

	void deleteusersociety(ZUser2Vo paramZUser2Vo);

	void userCommitForStudent(String paramString);

	void updateuseroutrequestToZero(ZUserVo paramZUserVo);

	void updateEnabledToZero(String paramString);

	void updateRequestEnabledToNomal(String paramString);

	void updateUserStatus(ZUserVo paramZUserVo);

	int listCountSearch(SearchUser paramSearchUser);

	List<SearchUser> getListSearch(SearchUser paramSearchUser);

	List<SearchUser> getListSearchAll(SearchUser paramSearchUser);

	void insertOrgUser(ZUserOrgVo paramZUserOrgVo);

	Integer getOrgUserListCount(ZUserVo paramZUserVo);

	List<ZUserVo> getOrgUserList(ZUserVo paramZUserVo);

	ZUserOrgVo getOrgUserDataByNo(ZUserOrgVo paramZUserOrgVo);

	void updateOrgUser(ZUserVo paramZUserVo);

	void updateOrgUser(ZUserOrgVo paramZUserOrgVo);

	void deleteOrgUser(List<Integer> paramList);

	Integer selectVote(ZUserVo paramZUserVo);

	Integer listCountKF(MenuStaffVO paramMenuStaffVO);

	List<ZUserVo> getListKF(MenuStaffVO paramMenuStaffVO);

	MenuStaffVO getInfoKFUser(String paramString);

	void userUpdateInfo(ZUserVo paramZUserVo);
	
	public void userUpdateMailYn(ZUserVo vo);

	Integer regDupchk(ZUserVo paramZUserVo);

	Integer userUpdatePw(ZUserVo paramZUserVo);
	
	ZUserVo checkCode(ZUserVo paramZUserVo);

	Integer getSameEmailCount(ZUserVo paramZUserVo);

	void deleteNewsletter(ZUserVo paramZUserVo);

	void InsertNewsletter(ZUserVo paramZUserVo);

	List<ZUserVo> getscrapSearch1(ZUserVo paramZUserVo);

	int leave(String userid);
	String leave2(ZUser zUser);

	int userStatusCheck(String userid);
}