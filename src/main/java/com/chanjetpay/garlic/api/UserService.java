package com.chanjetpay.garlic.api;

import com.chanjetpay.garlic.dto.UserInfoDto;
import com.chanjetpay.result.BasicResult;
import com.chanjetpay.result.GenericResult;
import com.chanjetpay.result.PageListResult;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

@Headers({"Content-Type: application/json","Accept: application/json"})
public interface UserService {

	@RequestLine("POST /user/register")
	BasicResult registerUser(UserInfoDto userInfo);

	@RequestLine("POST /user/{userid}/active")
	BasicResult activeUser(@Param("userid") String userId, String activeCode);

	@RequestLine("POST /user/{userid}/destroy")
	BasicResult destroyUser(@Param("userid") String userId, String authCode);

	@RequestLine("GET /user/query?uid={userid}")
	GenericResult<UserInfoDto> findByUserId(@Param("userid") String userId);

	@RequestLine("GET /user/query?loginname={loginname}")
	GenericResult<UserInfoDto> findByLoginName(@Param("loginname") String loginName);

	@RequestLine("GET /user/query?mid={merchantid}")
	PageListResult<UserInfoDto> queryUsersByMerchant(@Param("merchantid") String merchantId);
}
