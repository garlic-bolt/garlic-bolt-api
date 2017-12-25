package com.chanjetpay.garlic.api;

import com.chanjetpay.garlic.dto.SourceRequestDto;
import com.chanjetpay.garlic.dto.VoucherDto;
import com.chanjetpay.result.GenericResult;

import java.util.List;

public interface AccountingService {
	//通用记账
	GenericResult<String> generalAccounting(List<VoucherDto> accountingList);

	//通用记账-同时记录会计账
	GenericResult<String> generalAccounting(List<VoucherDto> accountingList, SourceRequestDto sourceRequest);

	//冲正
	GenericResult<String> reverseAccounting(String accountingNo);
}
