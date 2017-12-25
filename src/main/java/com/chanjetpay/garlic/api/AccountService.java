package com.chanjetpay.garlic.api;

import com.chanjetpay.garlic.dto.*;
import com.chanjetpay.garlic.enums.AccountAuthTypeEnum;
import com.chanjetpay.result.BasicResult;
import com.chanjetpay.result.GenericResult;
import com.chanjetpay.result.ListResult;
import com.sun.org.apache.xpath.internal.operations.Bool;

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
public interface AccountService {

	////账户管理

	//会员开户
	GenericResult<AccountDto> createMemberAccount(MemberDto member, AccountDto account);

	//商户开户
	GenericResult<AccountDto> createMerchantAccount(MerchantDto merchant, AccountDto account);

	//开子账户
	GenericResult<AccountDto> openSubAccount(String accountCode, AccountDto account);

	//挂起外部账户
	BasicResult suspendAccount(String accountCode);

	//恢复外部账户
	BasicResult resumeAccount(String accountCode);

	//注销账户
	BasicResult closeAccount(String accountCode);

	//冻结
	BasicResult frozenAccount(String accountCode);

	//解冻
	BasicResult thawAccount(String accountCode);

	//冻结余额
	BasicResult freeze(String accountNo, Long amount);

	//解冻余额
	BasicResult unfreezeCapital(String accountNo, Long amount);

	////账户查询

	//根据户口号查询账户详细
	ListResult<AccountDto> queryByAccountCode(String accountCode);

	//根据账户号查询账户详细
	GenericResult<AccountDto> queryByAccountNo(String accountNo);

	//根据第三方平台的用户标识查询子账户详细
	GenericResult<AccountDto> queryByOwner(String group, String owner);

	//查询账户操作历史
	ListResult<AccountManageDto> queryManagerHistory(String accountCode);

	//根据账户号查询帐户名明细
	ListResult<AccountDetailDto> queryAccountDetail(String accountNo);

	////账户安全

	//设置账户密码
	BasicResult resetPassword(String accountNo);

	//验证账户密码
	GenericResult<Boolean> verifyPassword(String accountNo);

	//校验余额是否被篡改
	GenericResult<Boolean> validateBalance(String accountNo);

	//账户授权-被授权账户，授权人户口号
	BasicResult authorizeAgreement(String awardAccountNo, String targetAccountCode, AccountAuthTypeEnum authType);

	//取消授权
	BasicResult revokeAgreement(String awardAccountNo, String targetAccountCode, AccountAuthTypeEnum authType);

	//验证授权
	GenericResult<Boolean> validateAgreement(String awardAccountNo, String targetAccountCode, AccountAuthTypeEnum authType);

}
