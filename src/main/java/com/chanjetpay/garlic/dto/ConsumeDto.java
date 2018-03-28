package com.chanjetpay.garlic.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

public class ConsumeDto implements Serializable {
	private static final long serialVersionUID = -3249998377387514055L;

	private String orderNo;
	private Date orderTime;

	private String merchantId;
	private String memberId;
	private Long amount;
	private String memo;

	private String validateCode;
	private String payPassword;

	public ConsumeDto(){
		String[] idd = UUID.randomUUID().toString().split("-");
		this.orderNo = idd[0] + idd[1] + idd[2] + idd[3];
		this.orderTime = new Date();
	}

	public ConsumeDto(String memberId, String payPassword, Long amount, String merchantId){
		this.memberId = memberId;
		this.payPassword = payPassword;
		this.amount = amount;
		this.merchantId = merchantId;

		String[] idd = UUID.randomUUID().toString().split("-");
		this.orderNo = idd[0] + idd[1] + idd[2] + idd[3];
		this.orderTime = new Date();
	}

	public Boolean checkOrderFields(){
		return orderNo == null
				|| orderTime == null
				|| merchantId == null
				|| memberId == null
				|| amount == null
				|| payPassword == null;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getValidateCode() {
		return validateCode;
	}

	public void setValidateCode(String validateCode) {
		this.validateCode = validateCode;
	}

	public String getPayPassword() {
		return payPassword;
	}

	public void setPayPassword(String payPassword) {
		this.payPassword = payPassword;
	}
}
