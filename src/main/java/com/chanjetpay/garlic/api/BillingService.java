package com.chanjetpay.garlic.api;

import com.chanjetpay.garlic.dto.QueryRegionDto;
import com.chanjetpay.result.BasicResult;
import com.chanjetpay.result.GenericResult;
import com.chanjetpay.result.ListResult;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

@Headers("Accept: application/json")
public interface BillingService {

	/**
	 * 查询对账文件
	 * @param merchantId
	 * @return
	 */
	@Headers("Content-Type: application/json")
	@RequestLine("POST /billing/{merchantId}/query")
	ListResult<String> query(@Param("merchantId") String merchantId, QueryRegionDto region);

	/**
	 * 下载对账文件
	 * @param merchantId
	 * @param fileName
	 * @return
	 */
	@RequestLine("GET /billing/{merchantId}/download/{fileName}/")
	GenericResult<String> download(@Param("merchantId") String merchantId , @Param("fileName")String fileName);
}