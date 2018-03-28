package com.chanjetpay.garlic.api;

import com.chanjetpay.garlic.dto.MemberDto;
import com.chanjetpay.result.BasicResult;
import com.chanjetpay.result.GenericResult;
import com.chanjetpay.result.ListResult;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

/**
 * 会员服务
 */
@Headers("Accept: application/json")
public interface MemberService {

	/**
	 * 用户注册会员
	 * @param blockCode
	 * @param member
	 * @return
	 */
	@Headers("Content-Type: application/json")
	@RequestLine("POST /member/{blockCode}/register")
	GenericResult<MemberDto> register(@Param("blockCode") String blockCode, MemberDto member);

	/**
	 * 查找会员
	 * @param blockCode
	 * @param memberId
	 * @return
	 */
	@RequestLine("GET /member/{blockCode}/find/{memberId}")
	GenericResult<MemberDto> findMemberById(@Param("blockCode") String blockCode, @Param("memberId") String memberId);

	/**
	 * 根据手机尾号查询会员
	 * @param blockCode
	 * @param mobile
	 * @return
	 */
	@RequestLine("GET /member/{blockCode}/query/{mobile}")
	ListResult<MemberDto> queryMemberByMobile(@Param("blockCode") String blockCode, @Param("mobile") String mobile);

	/**
	 * 商户操作员提交会员信息
	 * @param merchantId
	 * @param operatorId
	 * @param member
	 * @return
	 */
	@Headers("Content-Type: application/json")
	@RequestLine("POST /member/{blockCode}/submit/{operatorId}")
	GenericResult<MemberDto> submitMember(@Param("blockCode") String merchantId, @Param("operatorId") String operatorId, MemberDto member);

	/**
	 * 更具微信id查找会员
	 * @param blockCode
	 * @param userId
	 * @return
	 */
	@RequestLine("GET /member/{blockCode}/wx/{userId}")
	GenericResult<MemberDto> findByWxOfficialId(@Param("blockCode") String blockCode, @Param("userId") String userId);

	/**
	 * 根据支付宝id查找会员
	 * @param blockCode
	 * @param userId
	 * @return
	 */
	@RequestLine("GET /member/{blockCode}/alipay/{userId}")
	GenericResult<MemberDto> findByAlipayId(@Param("blockCode") String blockCode, @Param("userId") String userId);

}
