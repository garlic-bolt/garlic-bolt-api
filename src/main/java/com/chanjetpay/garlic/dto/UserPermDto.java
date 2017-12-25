package com.chanjetpay.garlic.dto;

import com.chanjetpay.garlic.enums.PermStateEnum;

import java.util.List;

public class UserPermDto {
	private String permId;//主键.
	private String permName;//名称.

	private String resourceType;//资源类型，[menu|button]
	private String url;//资源路径.
	private String permission; //权限字符串,menu例子：role:*，button例子：role:create,role:update,role:delete,role:view
	private String parentId; //父编号

	private PermStateEnum state;

	//角色权限多对多关系
	private List<UserRoleDto> userRoleList;

	public String getPermId() {
		return permId;
	}

	public void setPermId(String permId) {
		this.permId = permId;
	}

	public String getPermName() {
		return permName;
	}

	public void setPermName(String permName) {
		this.permName = permName;
	}

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public PermStateEnum getState() {
		return state;
	}

	public void setState(PermStateEnum state) {
		this.state = state;
	}

	public List<UserRoleDto> getUserRoleList() {
		return userRoleList;
	}

	public void setUserRoleList(List<UserRoleDto> userRoleList) {
		this.userRoleList = userRoleList;
	}
}
