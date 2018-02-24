package com.chanjetpay.garlic.enums;

public enum AccountingTypeEnum {
	/**
	 * 更新余额不记录明细
	 */
	BALANCE_WITHOUT_DETAIL("10"),
	/**
	 * 更新余额与可提现余额，不记账户明细
	 */
	BALANCE_SETTLE_WITHOUT_DETAIL("11"),
	/**
	 * 更新余额，记账户明细
	 */
	BALANCE_WITH_DETAIL("20"),
	/**
	 * 更新余额与可提现余额，记账户明细
	 */
	BALANCE_SETTLE_WITH_DETAIL("21");

	public String getCode() {
		return code;
	}

	private String code;
	AccountingTypeEnum(String code){
		this.code=code;
	}

	public static AccountingTypeEnum toEnum(String code) {
		for (AccountingTypeEnum item : AccountingTypeEnum.values()) {
			if (code.equals(item.getCode())) {
				return item;
			}
		}
		return null;
	}
}
