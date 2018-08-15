package com.chanjetpay.garlic.api;

import com.chanjetpay.garlic.dto.OperatorDto;
import com.chanjetpay.result.BasicResult;
import com.chanjetpay.result.GenericResult;
import com.chanjetpay.result.ListResult;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

@Headers("Accept: application/json")
public interface OperatorService {

	/**
	 * 查询商户下操作员
	 * @param merchantId
	 * @param operator
	 * @return
	 */
	@Headers("Content-Type: application/json")
	@RequestLine("POST /operator/{merchantId}/query")
	ListResult<OperatorDto> query(@Param("merchantId") String merchantId, OperatorDto operator);

	/**
	 * 根据id查找操作员
	 * @param operatorId
	 * @return
	 */
	@RequestLine("GET /operator/{operatorId}/find")
	GenericResult<OperatorDto> find(@Param("operatorId") String operatorId);

	/**
	 * 添加操作员
	 * @param merchantId
	 * @param operator
	 * @return
	 */
	@Headers("Content-Type: application/json")
	@RequestLine("POST /operator/{merchantId}/create")
	GenericResult<OperatorDto> create(@Param("merchantId") String merchantId, OperatorDto operator);

	/**
	 * 重置操作员密码
	 * @param merchantId
	 * @param operator
	 * @return
	 */
	@Headers("Content-Type: application/json")
	@RequestLine("POST /operator/{merchantId}/reset")
	BasicResult reset(@Param("merchantId") String merchantId, OperatorDto operator);

	/**
	 * 关闭操作员
	 * @param operatorId
	 * @return
	 */
	@Headers("Content-Type: application/json")
	@RequestLine("POST /operator/{operatorId}/close")
	BasicResult close(@Param("operatorId") String operatorId);
}
