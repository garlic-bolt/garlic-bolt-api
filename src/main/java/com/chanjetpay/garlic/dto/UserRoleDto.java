package com.chanjetpay.garlic.dto;

import com.chanjetpay.garlic.enums.RoleStateEnum;

import java.io.Serializable;
import java.util.List;

public class UserRoleDto implements Serializable{
	private String roleId; // 编号
	private String roleName; // 角色标识程序中判断使用,如"admin",这个是唯一的:
	private String description; // 角色描述,UI界面显示使用

	private RoleStateEnum state;

	private List<UserInfoDto> userInfoList;
	private List<UserPermDto> userPermList;

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public RoleStateEnum getState() {
		return state;
	}

	public void setState(RoleStateEnum state) {
		this.state = state;
	}

	public List<UserInfoDto> getUserInfoList() {
		return userInfoList;
	}

	public void setUserInfoList(List<UserInfoDto> userInfoList) {
		this.userInfoList = userInfoList;
	}

	public List<UserPermDto> getUserPermList() {
		return userPermList;
	}

	public void setUserPermList(List<UserPermDto> userPermList) {
		this.userPermList = userPermList;
	}
}
