package com.chanjetpay.garlic.dto;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;

/**
 * 商户信息
 * Created by libaoa on 2017/11/13.
 */
public class MerchantDto implements Serializable{

	//商户编号 商户名称  商户简称 商户行业类别 商户归属省  商户归属市  商户状态  起止日期

	//商户种类--企业，个体，事业单位，国家机关，其他
	private String merchantCategory;

	//商户类型--普通，代理，集团，机构，加盟，连锁
	private String merchantType;

	//上级商户号
	private String parentMerCode;

	//经营行业
	private String bizType;
	//业务子类
	private String busiTypeId;
	//经营子行业
	private String subCategory;
	//商户编号
	private String merchantCode;
	//商户名称
	private String merchantName;

	//商户简称
	String shortName;
	//拼音名
	String pyName;
	//省
	String province;
	//市
	String city;
	//状态
	String state;
	//开始生效日期
	Date startDate;
	//结束生效日期
	Date endDate;
	//注册日期
	Date regDate;

	//法人姓名
	private String legalName;
	//法人身份证号
	private String identityCard;
	//注册登记号
	private String registrationNo;

	//管理员
	String adminName;
	//管理员手机号
	String adminMobile;

	//身份证复印件
	private String idUrl;
	//身份证反面复印件
	private String idBackUrl;

	//营业执照复印件
	private String licenseUrl;

	public String getMerchantCategory() {
		return merchantCategory;
	}

	public void setMerchantCategory(String merchantCategory) {
		this.merchantCategory = merchantCategory;
	}

	public String getMerchantType() {
		return merchantType;
	}

	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}

	public String getParentMerCode() {
		return parentMerCode;
	}

	public void setParentMerCode(String parentMerCode) {
		this.parentMerCode = parentMerCode;
	}

	public String getBizType() {
		return bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getBusiTypeId() {
		return busiTypeId;
	}

	public void setBusiTypeId(String busiTypeId) {
		this.busiTypeId = busiTypeId;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public String getMerchantCode() {
		return merchantCode;
	}

	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getPyName() {
		return pyName;
	}

	public void setPyName(String pyName) {
		this.pyName = pyName;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
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

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminMobile() {
		return adminMobile;
	}

	public void setAdminMobile(String adminMobile) {
		this.adminMobile = adminMobile;
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

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE, true, true);
	}
}
