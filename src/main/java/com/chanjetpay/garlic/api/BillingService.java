package com.chanjetpay.garlic.api;

import com.chanjetpay.result.BasicResult;
import com.chanjetpay.result.GenericResult;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

@Headers("Accept: application/json")
public interface BillingService {

	@RequestLine("GET /billing/{name}/find")
	GenericResult<String> findName(@Param("name") String name);

	@Headers("Content-Type: application/json")
	@RequestLine("POST /billing/{name}/update/{newName}")
	BasicResult updateName(@Param("name") String name , @Param("newName")String newName);
}
