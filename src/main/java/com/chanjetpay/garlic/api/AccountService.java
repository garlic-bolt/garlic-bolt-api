package com.chanjetpay.garlic.api;

import com.chanjetpay.garlic.dto.*;
import com.chanjetpay.result.BasicResult;
import com.chanjetpay.result.GenericResult;
import com.chanjetpay.result.ListResult;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

/**
 * 外部账户服务
 *
 * account code：一个实名客户只有一个唯一的户口号
 * account owner & group：一个实名客户可以在多个平台注册并在支付系统单独开子账户
 *
 * 主账户（1）-（n）子账户
 * 主账户（1）-（n）第三方平台
 * 第三方平台（1）-（n）子账户
 */
@Headers("Accept: application/json")
public interface AccountService {

	//根据户口号查询账户详细
	@RequestLine("GET /account/{accountCode}/query")
	ListResult<AccountDto> queryByAccountCode(@Param("accountCode") String accountCode);

	//根据账户号查询账户详细
	@RequestLine("GET /account/{accountNo}/find")
	GenericResult<AccountDto> findByAccountNo(@Param("accountNo") String accountNo);

	//根据账户号查询帐户名明细
	@Headers("Content-Type: application/json")
	@RequestLine("POST /account/{accountNo}/detail")
	ListResult<AccountDetailDto> queryAccountDetail(@Param("accountNo") String accountNo, QueryRegionDto queryRegion);

	//校验余额是否被篡改
	@Headers("Content-Type: application/json")
	@RequestLine("POST /account/{accountNo}/validate")
	GenericResult<Boolean> validateBalance(@Param("accountNo") String accountNo);
}
