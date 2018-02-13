package com.chanjetpay.garlic.dto;

import com.chanjetpay.garlic.enums.OfficialStateEnum;

import java.io.Serializable;
import java.util.Date;

/**
 * 微信用户
 */
public class WxUserDto implements Serializable {

	private static final long serialVersionUID = 1378201351652348977L;

	private java.lang.String blockCode;
	private java.lang.String openId;
	private java.lang.String nickName;
	private Integer sex;
	private java.lang.String city;
	private java.lang.String country;
	private java.lang.String province;
	private java.lang.String headImgUrl;
	private Integer subscribeFlag;
	private java.util.Date subscribeTime;
	private java.util.Date signTime;
	private java.lang.String remark;
	private OfficialStateEnum state;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getBlockCode() {
		return blockCode;
	}

	public void setBlockCode(String blockCode) {
		this.blockCode = blockCode;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public OfficialStateEnum getState() {
		return state;
	}

	public void setState(OfficialStateEnum state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "WxUserDto{" +
				"blockCode='" + blockCode + '\'' +
				", openId='" + openId + '\'' +
				", nickName='" + nickName + '\'' +
				", sex=" + sex +
				", city='" + city + '\'' +
				", country='" + country + '\'' +
				", province='" + province + '\'' +
				", headImgUrl='" + headImgUrl + '\'' +
				", subscribeFlag=" + subscribeFlag +
				", subscribeTime=" + subscribeTime +
				", signTime=" + signTime +
				", remark='" + remark + '\'' +
				", state=" + state +
				'}';
	}
}
