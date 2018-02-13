package com.chanjetpay.garlic.enums;

public enum OfficialTypeEnum {
	SUBSCRIBE("订阅号"),
	SERVICE("服务号"),
	ENTERPRISE("企业号");

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
