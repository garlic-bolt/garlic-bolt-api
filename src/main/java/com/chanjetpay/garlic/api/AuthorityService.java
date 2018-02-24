package com.chanjetpay.garlic.api;

import com.chanjetpay.garlic.dto.AuthorityDto;
import com.chanjetpay.garlic.dto.OperatorDto;
import com.chanjetpay.result.BasicResult;
import com.chanjetpay.result.ListResult;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

import java.util.List;

@Headers("Accept: application/json")
public interface AuthorityService {

	@RequestLine("GET /authority/query-all")
	ListResult<AuthorityDto> queryAll();

	@RequestLine("GET /authority/{operatorId}/query")
	ListResult<AuthorityDto> queryByOperator(@Param("operatorId") String operatorId);

	@Headers("Content-Type: application/json")
	@RequestLine("POST /authority/{operatorId}/assign")
	BasicResult assignAuthorities(@Param("operatorId") String operatorId , List<AuthorityDto> authorities);
}
