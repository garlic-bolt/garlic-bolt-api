package com.chanjetpay.garlic.dto;

import com.chanjetpay.garlic.enums.*;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by libaoa on 2017/11/13.
 */
public class MemberDto implements Serializable{

	private static final long serialVersionUID = -422707402269127121L;

	private java.lang.String memberId;
	private java.lang.String nickName;
	private java.lang.String avatarUrl;
	private java.lang.String birthday;
	private java.lang.String password;
	private java.lang.String salt;
	private java.lang.Integer retryTimes;
	private AuthStateEnum authState;
	private java.lang.String regChannel;
	private MemberCategoryEnum memberCategory;
	private java.lang.String blockId;
	private java.lang.String merchantId;
	private java.lang.String operatorId;
	private java.lang.String mobile;
	private java.lang.String email;
	private java.lang.String name;
	private java.lang.String idCardNo;
	private java.lang.String accountNo;
	private java.lang.Integer points;
	private java.lang.Integer level;
	private UserSexEnum sex;
	private java.lang.String address;
	private java.lang.String career;
	private MemberStateEnum state;
	private Date registerTime;

	private CooperateTypeEnum cooperatorType;
	private CooperateUserDto user;

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
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

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
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

	public Integer getRetryTimes() {
		return retryTimes;
	}

	public void setRetryTimes(Integer retryTimes) {
		this.retryTimes = retryTimes;
	}

	public AuthStateEnum getAuthState() {
		return authState;
	}

	public void setAuthState(AuthStateEnum authState) {
		this.authState = authState;
	}

	public String getRegChannel() {
		return regChannel;
	}

	public void setRegChannel(String regChannel) {
		this.regChannel = regChannel;
	}

	public MemberCategoryEnum getMemberCategory() {
		return memberCategory;
	}

	public void setMemberCategory(MemberCategoryEnum memberCategory) {
		this.memberCategory = memberCategory;
	}

	public String getBlockId() {
		return blockId;
	}

	public void setBlockId(String blockId) {
		this.blockId = blockId;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdCardNo() {
		return idCardNo;
	}

	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public UserSexEnum getSex() {
		return sex;
	}

	public void setSex(UserSexEnum sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	public MemberStateEnum getState() {
		return state;
	}

	public void setState(MemberStateEnum state) {
		this.state = state;
	}

	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

}
