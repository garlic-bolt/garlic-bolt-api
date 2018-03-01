package com.chanjetpay.garlic.dto;

import com.chanjetpay.garlic.enums.MerchantStateEnum;
import com.chanjetpay.garlic.enums.MerchantTypeEnum;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;

/**
 * 商户信息
 * Created by libaoa on 2017/11/13.
 */
public class MerchantDto implements Serializable{

	private java.lang.String merchantId;
	private java.lang.String merchantName;
	private java.lang.String blockCode;
	private java.lang.String shortName;
	private MerchantTypeEnum merchantType;
	private java.lang.String contact;
	private java.lang.String telphone;
	private java.lang.String mobile;
	private java.lang.String address;
	private java.lang.String industry;
	private java.lang.String domain;
	private MerchantStateEnum state;

	//商户编号 商户名称  商户简称 商户行业类别 商户归属省  商户归属市  商户状态  起止日期

	//法人姓名
	private String legalName;
	//法人身份证号
	private String identityCard;
	//注册登记号
	private String registrationNo;
	//身份证复印件
	private String idUrl;
	//身份证反面复印件
	private String idBackUrl;
	//营业执照复印件
	private String licenseUrl;

	//管理员
	String adminName;
	//管理员密码
	String adminPassword;
	//管理员手机号
	String adminMobile;

	public void fillMerchantInfo(String merchantName, String shortName, String address){
		this.merchantName = merchantName;
		this.shortName = shortName;
		this.address = address;
	}

	public void fillAdminInfo(String adminName, String adminPassword, String adminMobile){
		this.adminName = adminName;
		this.adminPassword = adminPassword;
		this.adminMobile = adminMobile;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getBlockCode() {
		return blockCode;
	}

	public void setBlockCode(String blockCode) {
		this.blockCode = blockCode;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public MerchantTypeEnum getMerchantType() {
		return merchantType;
	}

	public void setMerchantType(MerchantTypeEnum merchantType) {
		this.merchantType = merchantType;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getTelphone() {
		return telphone;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public MerchantStateEnum getState() {
		return state;
	}

	public void setState(MerchantStateEnum state) {
		this.state = state;
	}

	public String getLegalName() {
		return legalName;
	}

	public void setLegalName(String legalName) {
		this.legalName = legalName;
	}

	public String getIdentityCard() {
		return identityCard;
	}

	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getIdUrl() {
		return idUrl;
	}

	public void setIdUrl(String idUrl) {
		this.idUrl = idUrl;
	}

	public String getIdBackUrl() {
		return idBackUrl;
	}

	public void setIdBackUrl(String idBackUrl) {
		this.idBackUrl = idBackUrl;
	}

	public String getLicenseUrl() {
		return licenseUrl;
	}

	public void setLicenseUrl(String licenseUrl) {
		this.licenseUrl = licenseUrl;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public String getAdminMobile() {
		return adminMobile;
	}

	public void setAdminMobile(String adminMobile) {
		this.adminMobile = adminMobile;
	}
}
