package com.chanjetpay.garlic.api;

import com.chanjetpay.garlic.dto.Oauth2AccessTokenDto;
import com.chanjetpay.garlic.dto.WxOauth2Dto;
import com.chanjetpay.garlic.dto.WxOfficialSignDto;
import com.chanjetpay.result.GenericResult;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

@Headers("Accept: application/json")
public interface OfficialService {

	@Headers("Content-Type: application/json")
	@RequestLine("POST /official/{blockCode}/wx-sign")
	GenericResult<String> wxOfficialSign(@Param("blockCode") String blockCode, WxOfficialSignDto wxOfficialSign);

	@Headers("Content-Type: application/json")
	@RequestLine("POST /official/{blockCode}/wx-code")
	GenericResult<WxOauth2Dto> wxOfficialCode(@Param("blockCode") String blockCode, WxOauth2Dto wxOauth2);

	@RequestLine("GET /official/{blockCode}/wx-oauth2-token/{code}")
	GenericResult<Oauth2AccessTokenDto> wxOauth2AccessToken(@Param("blockCode") String blockCode, @Param("code") String oauth2Code);
}