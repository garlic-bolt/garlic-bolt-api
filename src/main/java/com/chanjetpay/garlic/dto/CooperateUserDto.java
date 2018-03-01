package com.chanjetpay.garlic.dto;

import com.chanjetpay.garlic.enums.CooperateStateEnum;
import com.chanjetpay.garlic.enums.CooperateTypeEnum;
import com.chanjetpay.garlic.enums.UserSexEnum;

import java.io.Serializable;
import java.util.Date;

/**
 * 外部用户
 */
public class CooperateUserDto implements Serializable {

	private static final long serialVersionUID = 1378201351652348977L;

	private java.lang.String blockCode;
	private CooperateTypeEnum cooperateType;
	private java.lang.String userId;
	private java.lang.String nickName;
	private UserSexEnum sex;
	private java.lang.String city;
	private java.lang.String country;
	private java.lang.String province;
	private java.lang.String headImgUrl;
	private Integer subscribeFlag;
	private java.util.Date subscribeTime;
	private java.util.Date signTime;
	private java.util.Date lastSignTime;
	private java.lang.String remark;
	private CooperateStateEnum state;

	public String getBlockCode() {
		return blockCode;
	}

	public void setBlockCode(String blockCode) {
		this.blockCode = blockCode;
	}

	public CooperateTypeEnum getCooperateType() {
		return cooperateType;
	}

	public void setCooperateType(CooperateTypeEnum cooperateType) {
		this.cooperateType = cooperateType;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public UserSexEnum getSex() {
		return sex;
	}

	public void setSex(UserSexEnum sex) {
		this.sex = sex;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getHeadImgUrl() {
		return headImgUrl;
	}

	public void setHeadImgUrl(String headImgUrl) {
		this.headImgUrl = headImgUrl;
	}

	public Integer getSubscribeFlag() {
		return subscribeFlag;
	}

	public void setSubscribeFlag(Integer subscribeFlag) {
		this.subscribeFlag = subscribeFlag;
	}

	public Date getSubscribeTime() {
		return subscribeTime;
	}

	public void setSubscribeTime(Date subscribeTime) {
		this.subscribeTime = subscribeTime;
	}

	public Date getSignTime() {
		return signTime;
	}

	public void setSignTime(Date signTime) {
		this.signTime = signTime;
	}

	public Date getLastSignTime() {
		return lastSignTime;
	}

	public void setLastSignTime(Date lastSignTime) {
		this.lastSignTime = lastSignTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public CooperateStateEnum getState() {
		return state;
	}

	public void setState(CooperateStateEnum state) {
		this.state = state;
	}
}
