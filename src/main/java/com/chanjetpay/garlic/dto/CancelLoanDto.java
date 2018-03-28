package com.chanjetpay.garlic.dto;

public class CancelLoanDto {

	private String merchantId;
	private String operatorId;
	private String agreementNo;

	public CancelLoanDto(String merchantId, String operatorId, String agreementNo){
		this.merchantId = merchantId;
		this.operatorId = operatorId;
		this.agreementNo = agreementNo;
	}

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

	public String getAgreementNo() {
		return agreementNo;
	}

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}
}
