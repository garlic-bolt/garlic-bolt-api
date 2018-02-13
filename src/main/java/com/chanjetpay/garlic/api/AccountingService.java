package com.chanjetpay.garlic.api;

import com.chanjetpay.garlic.dto.SourceRequestDto;
import com.chanjetpay.garlic.dto.VoucherDto;
import com.chanjetpay.result.GenericResult;
import feign.Headers;
import feign.RequestLine;

import java.util.List;

@Headers({"Content-Type: application/json","Accept: application/json"})
public interface AccountingService {

	//通用记账-单笔
	@RequestLine("POST /accounting/record/single")
	GenericResult<String> generalAccounting(VoucherDto voucher);

	//通用记账-批量
	@RequestLine("POST /accounting/record/batch")
	GenericResult<String> generalAccounting(List<VoucherDto> voucherList, SourceRequestDto sourceRequest);

	//冲正
	@RequestLine("POST /accounting/record/reverse")
	GenericResult<String> reverseAccounting(String accountingNo);
}
