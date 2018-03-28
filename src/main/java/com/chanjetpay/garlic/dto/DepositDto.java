package com.chanjetpay.garlic.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class DepositDto implements Serializable {

	private String orderNo;
	private Date orderTime;

	private String memberId;
	private String merchantId;
	private String operatorId;
	private Long amount;

	private String memo;

	private List<ClaimDto> claimList;

	public Boolean checkOrderFields(){
		return orderNo == null
				|| orderTime == null
				|| memberId == null
				|| amount == null
				|| merchantId == null
				|| operatorId == null;
	}

	public DepositDto(){
		String[] idd = UUID.randomUUID().toString().split("-");
		this.orderNo = idd[0] + idd[1] + idd[2] + idd[3];
		this.orderTime = new Date();
	}

	public DepositDto(String memberId, Long amount, String merchantId, String operatorId){
		this.memberId = memberId;
		this.amount = amount;
		this.merchantId = merchantId;
		this.operatorId = operatorId;

		String[] idd = UUID.randomUUID().toString().split("-");
		this.orderNo = idd[0] + idd[1] + idd[2] + idd[3];
		this.orderTime = new Date();
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

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public List<ClaimDto> getClaimList() {
		return claimList;
	}

	public void setClaimList(List<ClaimDto> claimList) {
		this.claimList = claimList;
	}
}
