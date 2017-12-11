package com.chanjetpay.garlic.dto;

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


}
