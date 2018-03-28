package com.chanjetpay.garlic.enums;

public enum AccountTypeEnum {

	BALANCE("100", "余额账户"),
	SETTLE("101", "待结算账户"),
	FEE("102", "手续费账户");

	private String code, desc;

	AccountTypeEnum(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public String getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

	public static AccountTypeEnum toEnum(String code) {
		for (AccountTypeEnum item : AccountTypeEnum.values()) {
			if (code.equals(item.getCode())) {
				return item;
			}
		}
		return null;
	}
}
