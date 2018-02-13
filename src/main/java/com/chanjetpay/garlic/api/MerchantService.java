package com.chanjetpay.garlic.api;

import com.chanjetpay.garlic.dto.*;
import com.chanjetpay.result.BasicResult;
import com.chanjetpay.result.GenericResult;
import com.chanjetpay.result.ListResult;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

import java.awt.*;

@Headers({"Content-Type: application/json","Accept: application/json"})
public interface MerchantService {

	//@RequestLine("GET /repos/{owner}/{repo}/contributors")
	//ListResult<MerchantDto> contributors(@Param("owner") String owner, @Param("repo") String repo);
	//
	//@RequestLine("GET /users/{username}/repos?sort={sort}")
	//ListResult<DishDto> repos(@Param("username") String owner, @Param("sort") String sort);
	//
	//@RequestLine("POST /account/{id}")
	//GenericResult<AccountDto> getAccountInfo(@Param("id") String id);

	@RequestLine("POST /merchant/add")
	GenericResult<MerchantDto> createMerchant(MerchantDto merchant);

	@RequestLine("POST /merchant/wx/{merchantId}/add")
	BasicResult addWxOfficial(@Param("merchantId") String merchantId, WxOfficialDto wxOfficial);

	@RequestLine("POST /merchant/alipay/{merchantId}/add")
	BasicResult addAlipayPlatform(@Param("merchantId") String merchantId, AlipayPlatformDto alipayPlatform);

}
