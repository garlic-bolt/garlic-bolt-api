package com.chanjetpay.garlic.api;

import com.chanjetpay.garlic.dto.*;
import com.chanjetpay.result.BasicResult;

public interface TradeService {

	//充值
	BasicResult deposit(String merchantId, DepositDto deposit);

	//消费
	BasicResult consume(String merchantId, ConsumeDto consume);

	//出借
	BasicResult loan(String merchantId, LoanOrderDto loanOrder);

	//抵消债务
	BasicResult crossLoan(String merchantId, ClaimDto claim);

	//债权核销
	BasicResult cancelLoan(String merchantId, ClaimDto claim);


}
