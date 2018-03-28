package com.chanjetpay.garlic.enums;

public enum MerchantStateEnum {
	/**
	 * 注册
	 */
	ENROLL("注册"),
	/**
	 * 正常
	 */
	NORMAL("正常"),
	/**
	 * 挂起
	 */
	SUSPEND("挂起"),
	/**
	 * 关闭
	 */
	CLOSE("关闭");

	private String desc;
	MerchantStateEnum(String desc){
		this.desc = desc;
	}

	public String getDesc(){
		return desc;
	}
}