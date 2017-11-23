package com.chanjetpay.garlic.api;

import com.chanjetpay.garlic.dto.UserDto;

import java.util.List;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

/**
 * Created by libaoa on 2017/11/13.
 */

public interface BlockService {

	@RequestLine("GET /block/list-user?scope={scope}")
	List<UserDto> queryUsers(@Param(value = "scope") String scope);

	@Headers({"Content-Type: application/json","Accept: application/json"})
	@RequestLine("POST /block/save-user")
	UserDto saveUser(UserDto user);
}
