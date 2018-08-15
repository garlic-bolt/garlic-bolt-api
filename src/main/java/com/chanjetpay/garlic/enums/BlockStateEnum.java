package com.chanjetpay.garlic.enums;

import org.omg.PortableInterceptor.ACTIVE;

public enum BlockStateEnum {
	/**
	 * 注册中
	 */
	ENROLL("注册中"),
	/**
	 * 已激活
	 */
	ACTIVE("已激活"),
	/**
	 * 已挂起
	 */
	SUSPEND("已挂起"),
	/**
	 * 已注销
	 */
	DESTROY("已注销");

	private String desc;

	public String getDesc() {
		return desc;
	}

	BlockStateEnum(String desc){
		this.desc = desc;
	}
}
