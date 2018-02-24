package com.chanjetpay.garlic.api;

import com.chanjetpay.garlic.dto.QueryRegionDto;
import com.chanjetpay.garlic.dto.SourceRequestDto;
import com.chanjetpay.garlic.dto.VoucherDto;
import com.chanjetpay.result.GenericResult;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

/**
 * 记账服务
 */
@Headers("Accept: application/json")
public interface AccountingService {




	/**
	 * 单笔记账
	 * @param voucher 会计凭证
	 * @return
	 */
	@Headers("Content-Type: application/json")
	@RequestLine("POST /accounting/single")
	GenericResult<String> singleAccounting(VoucherDto voucher);

	/**
	 * 批量记账
	 * @param sourceRequest 记账请求
	 * @return
	 */
	@Headers("Content-Type: application/json")
	@RequestLine("POST /accounting/batch")
	GenericResult<String> batchAccounting(SourceRequestDto sourceRequest);

	/**
	 * 账务冲正
	 * @param accountingNo 记账流水号
	 * @return
	 */
	@Headers("Content-Type: application/json")
	@RequestLine("POST /accounting/{accountingNo}/reverse")
	GenericResult<String> reverseAccounting(String accountingNo);

	/**
	 * 会计凭证查询
	 * @param accountingNo 记账流水号
	 * @return
	 */
	@RequestLine("GET /accounting/{accountingNo}/single")
	GenericResult<VoucherDto> querySingle(@Param("accountingNo") String accountingNo);

	/**
	 * 区间条件查询会计凭证
	 * @param queryRegion
	 * @return
	 */
	@Headers("Content-Type: application/json")
	@RequestLine("POST /accounting/region")
	GenericResult<VoucherDto> queryRegion(QueryRegionDto queryRegion);

	/**
	 * 查询记账请求
	 * @param requestNo
	 * @return
	 */
	@RequestLine("GET /accounting/{requestNo}/batch")
	GenericResult<SourceRequestDto> queryBatch(@Param("requestNo") String requestNo);
}
