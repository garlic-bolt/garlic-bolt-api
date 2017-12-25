package com.chanjetpay.garlic.dto;

import com.chanjetpay.garlic.enums.UserStateEnum;

import java.io.Serializable;
import java.util.List;

public class UserInfoDto implements Serializable {

	/**
	 * 用户id
	 */
	private String userId;
	private String loginName;
	private String email;
	private String mobile;
	private String password;
	private String salt;
	private UserStateEnum state;

	private String nickName;
	private String avatarUrl;

	private List<UserRoleDto> userRoleList;
	private List<UserPermDto> userPermList;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public UserStateEnum getState() {
		return state;
	}

	public void setState(UserStateEnum state) {
		this.state = state;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public List<UserRoleDto> getUserRoleList() {
		return userRoleList;
	}

	public void setUserRoleList(List<UserRoleDto> userRoleList) {
		this.userRoleList = userRoleList;
	}

	public List<UserPermDto> getUserPermList() {
		return userPermList;
	}

	public void setUserPermList(List<UserPermDto> userPermList) {
		this.userPermList = userPermList;
	}
}
