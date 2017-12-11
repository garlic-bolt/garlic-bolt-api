package com.chanjetpay.garlic.api;

import com.chanjetpay.garlic.dto.AccountDto;
import com.chanjetpay.garlic.dto.DishDto;
import com.chanjetpay.garlic.dto.MerchantDto;
import com.chanjetpay.result.Result;
import feign.Param;
import feign.RequestLine;

import java.util.List;

public interface MerchantService {

	@RequestLine("GET /repos/{owner}/{repo}/contributors")
	List<MerchantDto> contributors(@Param("owner") String owner, @Param("repo") String repo);

	@RequestLine("GET /users/{username}/repos?sort={sort}")
	List<DishDto> repos(@Param("username") String owner, @Param("sort") String sort);

	@RequestLine("POST /account/{id}")
	AccountDto getAccountInfo(@Param("id") String id);

}
