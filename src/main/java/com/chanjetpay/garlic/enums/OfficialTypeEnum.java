package com.chanjetpay.garlic.enums;

public enum OfficialTypeEnum {
	SUBSCRIBE("test"),
	SERVICE("test1"),
	ENTERPRISE("test2");

	private String desc;
	OfficialTypeEnum(String desc){
		this.desc=desc;
	}

	public String getDesc(){
		return desc;
	}

	public static OfficialTypeEnum toEnum(String desc) {
		for (OfficialTypeEnum item : OfficialTypeEnum.values()) {
			if (desc.equals(item.getDesc())) {
				return item;
			}
		}
		return null;
	}
}
