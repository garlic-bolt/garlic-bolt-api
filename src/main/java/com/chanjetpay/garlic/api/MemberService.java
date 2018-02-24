package com.chanjetpay.garlic.api;

import com.chanjetpay.garlic.dto.MemberDto;
import com.chanjetpay.result.BasicResult;
import com.chanjetpay.result.GenericResult;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

/**
 * Created by libaoa on 2017/10/25.
 */
@Headers({"Content-Type: application/json","Accept: application/json"})
public interface MemberService {

	//用户注册会员
	@RequestLine("POST /member/register")
	BasicResult register(MemberDto member);

	//获取用户的电话号
	@RequestLine("POST /member/wx/{blockCode}/user-phone-no")
	GenericResult<String> getUserPhoneNo(@Param("blockCode") String blockCode, @Param("openId") String openId);




}
