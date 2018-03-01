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
@Headers("Accept: application/json")
public interface MemberService {

	//用户注册会员
	@Headers("Content-Type: application/json")
	@RequestLine("POST /member/{merchantId}/register")
	BasicResult register(@Param("merchantId") String merchantId, MemberDto member);

	@RequestLine("GET /member/{blockCode}/query/{memberId}")
	GenericResult<String> queryMember(@Param("blockCode") String blockCode, @Param("memberId") String memberId);

	@Headers("Content-Type: application/json")
	@RequestLine("POST /member/{blockCode}/complete")
	BasicResult completeMember(@Param("blockCode") String blockCode, MemberDto member);

	@RequestLine("GET /member/{blockCode}/wx/{userId}")
	GenericResult<MemberDto> findByWxOfficialId(@Param("blockCode") String blockCode, @Param("userId") String userId);

	@RequestLine("GET /member/{blockCode}/alipay/{userId}")
	GenericResult<MemberDto> findByAlipayId(@Param("blockCode") String blockCode, @Param("userId") String userId);

}
