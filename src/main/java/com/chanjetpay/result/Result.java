package com.chanjetpay.result;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

public abstract class Result implements Serializable {
	private static final long serialVersionUID = 1L;

/*	0000：成功
	0010：成功（交易幂等）
	0020：成功（账户已存在）
	0030：成功（重复支付）
	1000~2000：请求信息不正确
	2100~2200：账户，认证类错误
	2200~2300：查询类服务业务错误
	2300~2400：移动支付业务错误
	2400~2500：web支付业务错误
	2500~2600：代收付业务错误
	2600~2700：p2p业务系统错误
	2900~3000：退款类业务错误
	3000~4000：上游渠道返回错误
	4000~4100：对账类错误
	9000~9999：系统异常*/
	
	/**
	 *成功
	 */
	public static final String SUCCESS = "0000";
	
	/**
	 * 未知异常
	 */
	public static final String EXCEPTION = "9999";
	
	/**
	 * @return 返回码
	 */
	private String code;
	
	/**
	 * @return 返回码描述
	 */
	private String desc;
	
	public String getCode() {
		return code;
	}
	public Result setCode(String code) {
		this.code = code;
		return this;
	}
	public String getDesc() {
		if(desc == null)
			return "";
		
		return desc;
	}
	public Result setDesc(String desc) {
		this.desc = desc;
		return this;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.DEFAULT_STYLE, true, true);
	}
}
