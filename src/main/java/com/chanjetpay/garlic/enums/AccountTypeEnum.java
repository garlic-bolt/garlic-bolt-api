package com.chanjetpay.garlic.enums;

public enum AccountTypeEnum {
	/**
	 * 借记类型
	 */
	DEBIT("20","借记类型"),
	/**
	 * 贷记类型
	 */
	CREDIT("21","贷记类型"),
	/**
	 * 冻结类型
	 */
	FROZEN("22","冻结类型"),
	/**
	 * 垫支类型
	 */
	ADVANCE("23","垫支类型"),
	/**
	 * 绑定银行账户类型
	 */
	BIND("29","绑定银行账户类型"),
	/**
	 * 存管备付金类型
	 */
	DEPOSITORY("30","存管备付金类型"),
	/**
	 * 收付备付金类型
	 */
	RECEIPTS("31","收付备付金类型"),
	/**
	 * 汇缴备付金类型
	 */
	REMITTED("31","汇缴备付金类型"),
	/**
	 * 虚拟账户
	 */
	VIRTUAL("32","虚拟账户");

	private String code,desc;

	AccountTypeEnum(String code, String desc){
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
