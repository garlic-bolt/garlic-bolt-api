package com.chanjetpay.garlic.api;

import com.chanjetpay.garlic.dto.*;
import com.chanjetpay.result.BasicResult;
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
	@RequestLine("POST /loan/{merchantId}/deposit")
	BasicResult deposit(@Param("merchantId") String merchantId, DepositDto deposit);

	/**
	 * 消费
	 * @param merchantId
	 * @param consume
	 * @return
	 */
	@Headers("Content-Type: application/json")
	@RequestLine("POST /loan/{merchantId}/consume")
	BasicResult consume(@Param("merchantId") String merchantId, ConsumeDto consume);

	/**
	 * 出借
	 * @param merchantId
	 * @param loanOrder
	 * @return
	 */
	@Headers("Content-Type: application/json")
	@RequestLine("POST /loan/{merchantId}/loan")
	BasicResult loan(@Param("merchantId") String merchantId, LoanOrderDto loanOrder);

	/**
	 * 抵消债务
	 * @param merchantId
	 * @param crossLoan
	 * @return
	 */
	@Headers("Content-Type: application/json")
	@RequestLine("POST /loan/{merchantId}/cross")
	BasicResult crossLoan(@Param("merchantId") String merchantId, CrossLoanDto crossLoan);

	/**
	 * 债权核销
	 * @param merchantId
	 * @param cancelLoan
	 * @return
	 */
	@Headers("Content-Type: application/json")
	@RequestLine("POST /loan/{merchantId}/cancel")
	BasicResult cancelLoan(@Param("merchantId") String merchantId, CancelLoanDto cancelLoan);


	/**
	 * 查询出借记录
	 * @param merchantId
	 * @param region
	 * @return
	 */
	@Headers("Content-Type: application/json")
	@RequestLine("POST /loan/{merchantId}/query-lend")
	ListResult<LoanOrderDto> queryLendOrders(@Param("merchantId") String merchantId, QueryRegionDto region);

	/**
	 * 查询借款记录
	 * @param merchantId
	 * @param region
	 * @return
	 */
	@Headers("Content-Type: application/json")
	@RequestLine("POST /loan/{merchantId}/query-borrow")
	ListResult<LoanOrderDto> queryBorrowOrders(@Param("merchantId") String merchantId, QueryRegionDto region);


	/**
	 * 查询充值记录
	 * @param memberId
	 * @param region
	 * @return
	 */
	@Headers("Content-Type: application/json")
	@RequestLine("POST /loan/{merchantId}/query-deposit")
	ListResult<DepositDto> queryDepositOrders(@Param("memberId") String memberId, QueryRegionDto region);

	/**
	 * 查询消费记录
	 * @param memberId
	 * @param region
	 * @return
	 */
	@Headers("Content-Type: application/json")
	@RequestLine("POST /loan/{merchantId}/query-consume")
	ListResult<ConsumeDto> queryConsumeOrders(@Param("memberId") String memberId, QueryRegionDto region);
}
