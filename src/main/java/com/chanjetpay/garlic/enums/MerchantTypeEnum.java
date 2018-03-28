package com.chanjetpay.garlic.enums;

public enum MerchantTypeEnum {
	/**
	 * 小微
	 */
	MICRO("小微"),
	/**
	 * 个体户
	 */
	INDIVIDUAL("个体户"),
	/**
	 * 企业
	 */
	ENTERPRISE("企业");

	private String desc;
	MerchantTypeEnum(String desc){
		this.desc = desc;
	}

	private String getDesc(){
		return desc;
	}
}
