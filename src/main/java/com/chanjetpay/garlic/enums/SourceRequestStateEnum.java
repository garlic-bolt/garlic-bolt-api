package com.chanjetpay.garlic.enums;

public enum SourceRequestStateEnum {
	/**
	 * 处理中
	 */
	PROCESSING,
	/**
	 * 成功
	 */
	SUCCESS,
	/**
	 * 失败
	 */
	FAILURE,
	/**
	 * 撤销
	 */
	CANCEL,
	/**
	 * 退款
	 */
	REFUND,
	/**
	 * 关闭
	 */
	CLOSE;
}
