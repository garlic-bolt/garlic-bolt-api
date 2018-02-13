package com.chanjetpay.garlic.api;

import com.chanjetpay.garlic.dto.*;
import com.chanjetpay.result.BasicResult;
import com.chanjetpay.result.GenericResult;
import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.springframework.web.bind.annotation.RequestParam;

@Headers({"Content-Type: application/json","Accept: application/json"})
public interface OfficialService {

	@RequestLine("POST /official/{blockCode}/wx-sign")
	GenericResult<String> wxOfficialSign(@Param("blockCode") String blockCode, WxOfficialSignDto wxOfficialSign);

	@RequestLine("POST /official/{blockCode}/wx-code")
	GenericResult<WxOauth2Dto> wxOfficialCode(@Param("blockCode") String blockCode, WxOauth2Dto wxOauth2);

	@RequestLine("POST /official/{blockCode}/wx-oauth2-token/{code}")
	GenericResult<Oauth2AccessTokenDto> wxOauth2AccessToken(@Param("blockCode") String blockCode, @Param("code") String oauth2Code);
}