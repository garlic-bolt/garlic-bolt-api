package com.chanjetpay.garlic.api;

import com.chanjetpay.garlic.dto.OperatorDto;
import com.chanjetpay.result.BasicResult;
import com.chanjetpay.result.GenericResult;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

@Headers({"Content-Type: application/json","Accept: application/json"})
public interface OperatorService {
	@RequestLine("POST /operator/{operatorId}/find")
	GenericResult<OperatorDto> find(@Param("operatorId") String operatorId);

	@RequestLine("POST /operator/{merchantId}/create")
	BasicResult create(@Param("merchantId") String merchantId, OperatorDto operator);
}
