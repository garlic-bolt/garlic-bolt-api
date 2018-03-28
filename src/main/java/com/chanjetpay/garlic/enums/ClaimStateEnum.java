package com.chanjetpay.garlic.enums;

public enum ClaimStateEnum {
	/**
	 * 创建中
	 */
	PENDING,
	/**
	 * 计息
	 */
	INTEREST,
	/**
	 * 罚息
	 */
	FINE,
	/**
	 * 结束
	 */
	FINISH,
	/**
	 * 抵消
	 */
	CROSS,
	/**
	 * 核销
	 */
	CANCEL;
}
