package com.chanjetpay.garlic.dto;

import com.chanjetpay.garlic.enums.OperatorStateEnum;
import com.chanjetpay.garlic.enums.OperatorTypeEnum;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;

import java.io.Serializable;
import java.util.List;

public class OperatorDto implements Serializable {
	private static final long serialVersionUID = -8833060032937793196L;

	//operator_info
	private java.lang.String operatorId;
	private java.lang.String name;
	private java.lang.String mobile;
	private java.lang.String email;
	private java.lang.String salt;
	private java.lang.String password;
	private java.lang.String blockCode;
	private java.lang.String merchantId;
	private OperatorTypeEnum type;
	private java.lang.String role;
	private OperatorStateEnum state;

	//operator_role_ref
	private List<String> roles;
	//operator_authority_ref
	private List<String> permissions;

	//operator_authority_ref -> menu type
	private List<AuthorityDto> menus;

	private String avatar;

	private Integer attentionCount;
	private Integer messageCount;
	private Integer taskCount;

	public void fillOperatorInfo(String name, String mobile, String email, String password){
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.password = password;
	}

	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@ApiModelProperty(value = "加密盐", required = true)
	public String getSalt() {
		return salt;
	}

	@ApiParam(value = "加密盐不需要传", required = false)
	public void setSalt(String salt) {
		this.salt = salt;
	}

	@ApiModelProperty(value = "加密后的密码", required = true)
	public String getPassword() {
		return password;
	}

	@ApiParam(value = "明文密码", required = true)
	public void setPassword(String password) {
		this.password = password;
	}

	public String getBlockCode() {
		return blockCode;
	}

	public void setBlockCode(String blockCode) {
		this.blockCode = blockCode;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public OperatorStateEnum getState() {
		return state;
	}

	public void setState(OperatorStateEnum state) {
		this.state = state;
	}

	public OperatorTypeEnum getType() {
		return type;
	}

	public void setType(OperatorTypeEnum type) {
		this.type = type;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Integer getAttentionCount() {
		return attentionCount;
	}

	public void setAttentionCount(Integer attentionCount) {
		this.attentionCount = attentionCount;
	}

	public Integer getMessageCount() {
		return messageCount;
	}

	public void setMessageCount(Integer messageCount) {
		this.messageCount = messageCount;
	}

	public Integer getTaskCount() {
		return taskCount;
	}

	public void setTaskCount(Integer taskCount) {
		this.taskCount = taskCount;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public List<String> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<String> permissions) {
		this.permissions = permissions;
	}

	public List<AuthorityDto> getMenus() {
		return menus;
	}

	public void setMenus(List<AuthorityDto> menus) {
		this.menus = menus;
	}

	@Override
	public String toString() {
		return "OperatorDto{" +
				"operatorId='" + operatorId + '\'' +
				", name='" + name + '\'' +
				", mobile='" + mobile + '\'' +
				", email='" + email + '\'' +
				", salt='" + salt + '\'' +
				", password='" + password + '\'' +
				", blockCode='" + blockCode + '\'' +
				", merchantId='" + merchantId + '\'' +
				", type=" + type +
				", role='" + role + '\'' +
				", state=" + state +
				", roles=" + roles +
				", permissions=" + permissions +
				", menus=" + menus +
				", avatar='" + avatar + '\'' +
				", attentionCount=" + attentionCount +
				", messageCount=" + messageCount +
				", taskCount=" + taskCount +
				'}';
	}
}
