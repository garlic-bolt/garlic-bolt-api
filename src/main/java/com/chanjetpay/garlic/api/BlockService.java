package com.chanjetpay.garlic.api;

import com.chanjetpay.garlic.dto.BlockDto;
import com.chanjetpay.garlic.dto.UserDto;

import java.util.List;

import com.chanjetpay.result.GenericResult;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

/**
 * Created by libaoa on 2017/11/13.
 */
@Headers({"Content-Type: application/json","Accept: application/json"})
public interface BlockService {

	/**
	 * 注册社区
	 * @param block
	 * @return
	 */
	@RequestLine("POST /block/enroll")
	GenericResult<BlockDto> enroll(BlockDto block);

	/**
	 * 查询社区
	 * @param blockId
	 * @return
	 */
	@RequestLine("GET /block?id={id}")
	GenericResult<BlockDto> findByBlockId(@Param("id") String blockId);

	/**
	 * 完善并激活社区信息
	 * @param block
	 * @param inviteCode
	 * @return
	 */
	@RequestLine("POST /block/complete/{invite}")
	GenericResult<BlockDto> complete(BlockDto block, @Param("invite") String inviteCode);
}
