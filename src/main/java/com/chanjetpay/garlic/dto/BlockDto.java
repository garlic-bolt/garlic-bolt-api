package com.chanjetpay.garlic.dto;

import com.chanjetpay.garlic.enums.BlockStateEnum;

import java.io.Serializable;
import java.util.List;

/**
 * Created by libaoa on 2017/11/13.
 */
public class BlockDto implements Serializable{
	private static final long serialVersionUID = -3605719014997445916L;

	//社区id
	private String blockId;
	//社区名称
	private String blockName;
	//社区长邮箱
	private String wardenEmail;
	//社区长电话
	private String wardenPhone;
	//社区长姓名
	private String wardenName;
	//社区长身份证号
	private String wardenIdNo;
	//邀请码
	private String inviteCode;
	//省
	private String province;
	//市
	private String city;
	//区
	private String district;
	//地址
	private String address;
	//精度
	private Long longitude;
	//纬度
	private Long latitude ;
	//备注
	private String memo;
	//状态
	private BlockStateEnum state;
	//图片
	private List<PhotoDto> photos;
	//系统管理员
	private String master;
	//业务管理员
	private List<AdminDto> admins;

	public String getBlockId() {
		return blockId;
	}

	public void setBlockId(String blockId) {
		this.blockId = blockId;
	}

	public String getBlockName() {
		return blockName;
	}

	public void setBlockName(String blockName) {
		this.blockName = blockName;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public Long getLongitude() {
		return longitude;
	}

	public void setLongitude(Long longitude) {
		this.longitude = longitude;
	}

	public Long getLatitude() {
		return latitude;
	}

	public void setLatitude(Long latitude) {
		this.latitude = latitude;
	}

	public List<PhotoDto> getPhotos() {
		return photos;
	}

	public void setPhotos(List<PhotoDto> photos) {
		this.photos = photos;
	}

	public String getMaster() {
		return master;
	}

	public void setMaster(String master) {
		this.master = master;
	}

	public List<AdminDto> getAdmins() {
		return admins;
	}

	public void setAdmins(List<AdminDto> admins) {
		this.admins = admins;
	}

	@Override
	public String toString() {
		return "BlockDto{" +
				"blockId='" + blockId + '\'' +
				", blockName='" + blockName + '\'' +
				", wardenEmail='" + wardenEmail + '\'' +
				", wardenPhone='" + wardenPhone + '\'' +
				", wardenName='" + wardenName + '\'' +
				", wardenIdNo='" + wardenIdNo + '\'' +
				", inviteCode='" + inviteCode + '\'' +
				", province='" + province + '\'' +
				", city='" + city + '\'' +
				", district='" + district + '\'' +
				", address='" + address + '\'' +
				", longitude=" + longitude +
				", latitude=" + latitude +
				", memo='" + memo + '\'' +
				", state=" + state +
				", photos=" + photos +
				", master='" + master + '\'' +
				", admins=" + admins +
				'}';
	}
}
