package com.chanjetpay.garlic.api;

import com.chanjetpay.garlic.dto.*;
import com.chanjetpay.result.BasicResult;
import com.chanjetpay.result.GenericResult;
import com.chanjetpay.result.ListResult;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

import java.awt.*;

@Headers("Accept: application/json")
public interface MerchantService {

	/**
	 * 添加商户
	 * @param blockCode
	 * @param merchant
	 * @return
	 */
	@Headers("Content-Type: application/json")
	@RequestLine("POST /merchant/{blockCode}/create")
	GenericResult<MerchantDto> create(@Param("blockCode") String blockCode, MerchantDto merchant);

	/**
	 * 查询社区下全部商户
	 * @param blockCode
	 * @return
	 */
	@RequestLine("GET /merchant/{blockCode}/query")
	ListResult<MerchantDto> queryALl(@Param("blockCode") String blockCode);

	/**
	 * 根据商户号查询商户
	 * @param merchantId
	 * @return
	 */
	@RequestLine("GET /merchant/{merchantId}/find")
	GenericResult<MerchantDto> findById(@Param("merchantId") String merchantId);
}
