package com.chanjetpay.garlic.api;

import com.chanjetpay.garlic.dto.*;
import com.chanjetpay.result.BasicResult;
import com.chanjetpay.result.GenericResult;
import com.chanjetpay.result.ListResult;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

@Headers("Accept: application/json")
public interface TradeService {

	/**
	 * 充值
	 * @param merchantId
	 * @param deposit
	 * @return
	 */
	@Headers("Content-Type: application/json")
	@RequestLine("POST /trade/{merchantId}/deposit")
	BasicResult deposit(@Param("merchantId") String merchantId, DepositDto deposit);

	/**
	 * 消费
	 * @param merchantId
	 * @param consume
	 * @return
	 */
	@Headers("Content-Type: application/json")
	@RequestLine("POST /trade/{merchantId}/consume")
	BasicResult consume(@Param("merchantId") String merchantId, ConsumeDto consume);

	/**
	 * 预付
	 * @param merchantId
	 * @param claim
	 * @return
	 */
	@Headers("Content-Type: application/json")
	@RequestLine("POST /trade/{merchantId}/loan")
	BasicResult advanceLoan(@Param("merchantId") String merchantId, ClaimDto claim);

	/**
	 * 预付确认
	 * @param blockCode
	 * @param agreementNo
	 * @return
	 */
	@Headers("Content-Type: application/json")
	@RequestLine("POST /trade/{blockCode}/confirm/{agreementNo}")
	BasicResult confirmLoan(@Param("blockCode") String blockCode, @Param("agreementNo") String agreementNo);

	/**
	 * 赊销
	 * @param merchantId
	 * @param claim
	 * @return
	 */
	@Headers("Content-Type: application/json")
	@RequestLine("POST /trade/{merchantId}/sale")
	BasicResult saleLoan(@Param("merchantId") String merchantId, ClaimDto claim);

	/**
	 * 抵消债务
	 * @param merchantId
	 * @param crossLoan
	 * @return
	 */
	@Headers("Content-Type: application/json")
	@RequestLine("POST /trade/{merchantId}/cross")
	BasicResult crossLoan(@Param("merchantId") String merchantId, CrossLoanDto crossLoan);

	/**
	 * 债权核销
	 * @param merchantId
	 * @param cancelLoan
	 * @return
	 */
	@Headers("Content-Type: application/json")
	@RequestLine("POST /trade/{merchantId}/cancel")
	BasicResult cancelLoan(@Param("merchantId") String merchantId, CancelLoanDto cancelLoan);

	/**
	 * 查找债权债务
	 * @param blockCode
	 * @param agreementNo
	 * @return
	 */
	@RequestLine("GET /trade/{blockCode}/find")
	GenericResult<ClaimDto> findClaimByNo(@Param("blockCode") String blockCode, @Param("agreementNo") String agreementNo);

	/**
	 * 查询债权债务记录
	 * @param merchantId
	 * @param region
	 * @return
	 */
	@RequestLine("GET /trade/{merchantId}/query")
	ListResult<ClaimDto> queryClaims(@Param("merchantId") String merchantId, QueryRegionDto region);

}
