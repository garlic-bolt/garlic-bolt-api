package com.chanjetpay.garlic.enums;

public enum VoucherStateEnum {
	/**
	 * 有效(未处理)
	 */
	ACTIVE,
	/**
	 * 冲正参加平衡
	 */
	ANTI_BALANCE,
	/**
	 * 冲正不参加平衡
	 */
	ANTI_UNBALANCE,
	/**
	 * 分录流水抹帐
	 */
	WIPE,
	/**
	 * 已处理
	 */
	PROCESSED,
	/**
	 * 无效
	 */
	INVALID;
}
