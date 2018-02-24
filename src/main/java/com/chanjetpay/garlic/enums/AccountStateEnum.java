package com.chanjetpay.garlic.enums;

public enum AccountStateEnum {
	/**
	 * 正常
	 * */
	NORMAL,
	/**
	 * 挂起
	 * */
	SUSPEND,
	/**
	 * 冻结止付
	 * */
	FREEZE_OUT,
	/**
	 * 冻结止收
	 * */
	FREEZE_IN,
	/**
	 * 全部冻结
	 * */
	FREEZE_ALL,
	/**
	 * 销户
	 * */
	CLOSE;
}
