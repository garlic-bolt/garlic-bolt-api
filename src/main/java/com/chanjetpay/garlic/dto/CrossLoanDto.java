package com.chanjetpay.garlic.dto;

import com.chanjetpay.garlic.enums.DueTypeEnum;

public class CrossLoanDto {
	private String operatorId;
	private String merchantId;
	private DueTypeEnum dueType;
	private String agreementNo;

	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public DueTypeEnum getDueType() {
		return dueType;
	}

	public void setDueType(DueTypeEnum dueType) {
		this.dueType = dueType;
	}

	public String getAgreementNo() {
		return agreementNo;
	}

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}
}
