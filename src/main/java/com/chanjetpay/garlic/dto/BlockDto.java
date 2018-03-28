package com.chanjetpay.garlic.dto;

import com.chanjetpay.garlic.enums.BlockStateEnum;

import java.io.Serializable;
import java.util.List;

/**
 * Created by libaoa on 2017/11/13.
 */
public class BlockDto implements Serializable{
	private static final long serialVersionUID = -3605719014997445916L;

	private java.lang.String blockCode;
	private java.lang.String blockName;
	private java.lang.String province;
	private java.lang.String city;
	private java.lang.String district;
	private java.lang.Long latitude;
	private java.lang.Long longitude;
	private java.lang.String wardenEmail;
	private java.lang.String wardenPhone;
	private java.lang.String password;
	private java.lang.String wardenName;
	private java.lang.String wardenIdNo;
	private java.lang.String inviteCode;
	private java.lang.String memo;
	private BlockStateEnum state;

	private WxOfficialDto wxOfficial;

	//系统管理员
	private OperatorDto master;

	public BlockDto(){

	}

	public BlockDto(String blockName, String wardenEmail, String wardenPhone){
		this.blockName = blockName;
		this.wardenEmail = wardenEmail;
		this.wardenPhone = wardenPhone;
	}

	public void fillBlockData(String wardenName, String password, String province, String city, String district){
		this.setWardenName(wardenName);
		this.setPassword(password);
		this.setProvince(province);
		this.setCity(city);
		this.setDistrict(district);
	}

	public WxOfficialDto getWxOfficial() {
		return wxOfficial;
	}

	public void setWxOfficial(WxOfficialDto wxOfficial) {
		this.wxOfficial = wxOfficial;
	}

	public OperatorDto getMaster() {
		return master;
	}

	public void setMaster(OperatorDto master) {
		this.master = master;
	}



	public String getBlockCode() {
		return blockCode;
	}

	public void setBlockCode(String blockCode) {
		this.blockCode = blockCode;
	}

	public String getBlockName() {
		return blockName;
	}

	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public Long getLatitude() {
		return latitude;
	}

	public void setLatitude(Long latitude) {
		this.latitude = latitude;
	}

	public Long getLongitude() {
		return longitude;
	}

	public void setLongitude(Long longitude) {
		this.longitude = longitude;
	}

	public String getWardenEmail() {
		return wardenEmail;
	}

	public void setWardenEmail(String wardenEmail) {
		this.wardenEmail = wardenEmail;
	}

	public String getWardenPhone() {
		return wardenPhone;
	}

	public void setWardenPhone(String wardenPhone) {
		this.wardenPhone = wardenPhone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getWardenName() {
		return wardenName;
	}

	public void setWardenName(String wardenName) {
		this.wardenName = wardenName;
	}

	public String getWardenIdNo() {
		return wardenIdNo;
	}

	public void setWardenIdNo(String wardenIdNo) {
		this.wardenIdNo = wardenIdNo;
	}

	public String getInviteCode() {
		return inviteCode;
	}

	public void setInviteCode(String inviteCode) {
		this.inviteCode = inviteCode;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public BlockStateEnum getState() {
		return state;
	}

	public void setState(BlockStateEnum state) {
		this.state = state;
	}



	@Override
	public String toString() {
		return "BlockDto{" +
				"blockCode='" + blockCode + '\'' +
				", blockName='" + blockName + '\'' +
				", province='" + province + '\'' +
				", city='" + city + '\'' +
				", district='" + district + '\'' +
				", latitude=" + latitude +
				", longitude=" + longitude +
				", wardenEmail='" + wardenEmail + '\'' +
				", wardenPhone='" + wardenPhone + '\'' +
				", password='" + password + '\'' +
				", wardenName='" + wardenName + '\'' +
				", wardenIdNo='" + wardenIdNo + '\'' +
				", inviteCode='" + inviteCode + '\'' +
				", memo='" + memo + '\'' +
				", state=" + state +
				", master='" + master + '\'' +
				'}';
	}
}
