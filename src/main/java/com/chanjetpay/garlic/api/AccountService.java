package com.chanjetpay.garlic.api;

import com.chanjetpay.garlic.dto.*;
import com.chanjetpay.garlic.enums.AccountAuthTypeEnum;
import com.chanjetpay.result.BasicResult;
import com.chanjetpay.result.GenericResult;
import com.chanjetpay.result.ListResult;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

@Headers("Accept: application/json")
public interface AccountService {

	/**
	 * 根据户口号查询账户列表
	 * @param accountGroup
	 * @return
	 */
	@RequestLine("GET /account/{accountGroup}/query")
	ListResult<AccountDto> queryByAccountGroup(@Param("accountGroup") String accountGroup);

	/**
	 * 根据账户号查询账户详细
	 * @param accountNo
	 * @return
	 */
	@RequestLine("GET /account/{accountNo}/find")
	GenericResult<AccountDto> findByAccountNo(@Param("accountNo") String accountNo);

	/**
	 * 根据账户号查询帐户名明细
	 * @param accountNo
	 * @param queryRegion
	 * @return
	 */
	@Headers("Content-Type: application/json")
	@RequestLine("POST /account/{accountNo}/detail")
	ListResult<AccountDetailDto> queryAccountDetail(@Param("accountNo") String accountNo, QueryRegionDto queryRegion);

	/**
	 * 校验余额是否被篡改
	 * @param accountNo
	 * @return
	 */
	@Headers("Content-Type: application/json")
	@RequestLine("POST /account/{accountNo}/validate")
	GenericResult<Boolean> validateBalance(@Param("accountNo") String accountNo);

/*
	//会员开户
	@RequestLine("POST /account/member/open")
	GenericResult<AccountDto> createMemberAccount(MemberDto member, AccountDto account);

	//商户开户
	@RequestLine("POST /account/merchant/open")
	GenericResult<AccountDto> createMerchantAccount(MerchantDto merchant, AccountDto account);

	//开子账户
	@RequestLine("POST /account/merchant/{accountCode}/open")
	GenericResult<AccountDto> openSubAccount(@Param("accountCode") String accountCode, AccountDto account);

	//挂起外部账户
	@RequestLine("POST /account/{accountCode}/suspend")
	BasicResult suspendAccount(@Param("accountCode") String accountCode);

	//恢复外部账户
	@RequestLine("POST /account/{accountCode}/resume")
	BasicResult resumeAccount(@Param("accountCode") String accountCode);

	//注销账户
	@RequestLine("POST /account/{accountCode}/close")
	BasicResult closeAccount(@Param("accountCode") String accountCode);

	//冻结
	@RequestLine("POST /account/{accountCode}/frozen")
	BasicResult frozenAccount(@Param("accountCode") String accountCode);

	//解冻
	@RequestLine("POST /account/{accountCode}/thaw")
	BasicResult thawAccount(@Param("accountCode") String accountCode);

	//冻结余额
	@RequestLine("POST /account/{accountCode}/freeze")
	BasicResult freeze(@Param("accountCode") String accountNo, Long amount);

	//解冻余额
	@RequestLine("POST /account/{accountCode}/unfreeze")
	BasicResult unfreezeCapital(String accountNo, Long amount);

	////账户查询

	//根据账户号查询账户详细
	@RequestLine("GET /account/query?accountNo={accountNo}")
	GenericResult<AccountDto> queryByAccountNo(@Param("accountNo") String accountNo);

	//根据第三方平台的用户标识查询子账户详细
	@RequestLine("GET /account/query?group={group}&owner={owner}")
	GenericResult<AccountDto> queryByOwner(@Param("group") String group, @Param("owner") String owner);

	//查询账户操作历史
	@RequestLine("GET /account/manager/list?accountCode={accountCode}")
	ListResult<AccountManageDto> queryManagerHistory(String accountCode);

	//根据账户号查询帐户名明细
	@RequestLine("GET /account/detail/list?accountNo={accountNo}")
	ListResult<AccountDetailDto> queryAccountDetail(@Param("accountNo") String accountNo);

	////账户安全

	//设置账户密码
	@RequestLine("POST /account/{accountNo}/password/reset")
	BasicResult resetPassword(@Param("accountNo") String accountNo, String newPassword);

	//验证账户密码
	@RequestLine("POST /account/{accountNo}/password/verify")
	GenericResult<Boolean> verifyPassword(@Param("accountNo") String accountNo, String password);

	//账户授权-被授权账户，授权人户口号
	@RequestLine("POST /account/{accountNo}/authorize")
	BasicResult authorizeAgreement(@Param("accountNo") String awardAccountNo, String targetAccountCode, AccountAuthTypeEnum authType);

	//取消授权
	@RequestLine("POST /account/{accountNo}/revoke")
	BasicResult revokeAgreement(@Param("accountNo") String awardAccountNo, String targetAccountCode, AccountAuthTypeEnum authType);

	//验证授权
	@RequestLine("POST /account/{accountNo}/verify")
	GenericResult<Boolean> verifyAgreement(@Param("accountNo") String awardAccountNo, String targetAccountCode, AccountAuthTypeEnum authType);
*/

}
