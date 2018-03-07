package com.chanjetpay.garlic.api;

import com.chanjetpay.garlic.dto.NoticeDto;
import com.chanjetpay.result.BasicResult;
import com.chanjetpay.result.ListResult;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

/**
 * 消息通知服务
 */
@Headers("Accept: application/json")
public interface NoticeService {

	/**
	 * 查询商户通知
	 * @param merchantId
	 * @return
	 */
	@RequestLine("GET /notice/{merchantId}/merchant-query")
	ListResult<NoticeDto> queryMerchantNotice(@Param("merchantId") String merchantId);

	/**
	 * 查询用户通知
	 * @param memberId
	 * @return
	 */
	@RequestLine("GET /notice/{memberId}/member-query")
	ListResult<NoticeDto> queryMemberNotice(@Param("memberId") String memberId);

	@Headers("Content-Type: application/json")
	@RequestLine("POST /notice/${noticeId}/read")
	BasicResult readNotice(@Param("noticeId") String noticeId);
}
