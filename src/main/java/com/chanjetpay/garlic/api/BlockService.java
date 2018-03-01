package com.chanjetpay.garlic.api;

import com.chanjetpay.garlic.dto.*;

import java.util.List;

import com.chanjetpay.result.BasicResult;
import com.chanjetpay.result.GenericResult;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

@Headers("Accept: application/json")
public interface BlockService {

	/**
	 * 注册社区
	 * @param block
	 * @return
	 */
	@Headers("Content-Type: application/json")
	@RequestLine("POST /block/enroll")
	GenericResult<BlockDto> enroll(BlockDto block);

	/**
	 * 查询社区
	 * @param blockCode
	 * @return
	 */
	@RequestLine("GET /block/{blockCode}/find")
	GenericResult<BlockDto> findByBlockCode(@Param("blockCode") String blockCode);

	/**
	 * 完善并激活社区信息
	 * @param inviteCode
	 * @param block
	 * @return
	 */
	@RequestLine("POST /block/{invite}/complete")
	GenericResult<BlockDto> complete(@Param("invite") String inviteCode, BlockDto block);


	/**
	 * 添加微信公众号参数
	 * @param blockCode
	 * @param wxOfficial
	 * @return
	 */
	@RequestLine("POST /block/{blockCode}/wx/add")
	BasicResult addWxOfficial(@Param("blockCode") String blockCode, WxOfficialDto wxOfficial);

	/**
	 * 添加支付宝服务号参数
	 * @param blockCode
	 * @param alipayPlatform
	 * @return
	 */
	@RequestLine("POST /block/{blockCode}/alipay/add")
	BasicResult addAlipayPlatform(@Param("blockCode") String blockCode, AlipayPlatformDto alipayPlatform);

}
