package com.chanjetpay.garlic.dto;

import com.chanjetpay.garlic.enums.ClaimerTypeEnum;
import com.chanjetpay.garlic.enums.LoanStateEnum;
import com.chanjetpay.garlic.enums.RepayMethodEnum;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class LoanOrderDto implements Serializable{
	private static final long serialVersionUID = 1689989041592520827L;

	private java.lang.String blockCode;
	private java.lang.String orderNo;
	private java.util.Date orderDate;
	private java.lang.String loanId;
	private java.lang.String lendingId;
	private ClaimerTypeEnum lendingType;
	private java.lang.String borrowId;
	private ClaimerTypeEnum borrowType;
	private java.lang.String guaranteeId;
	private java.lang.String operatorId;
	private java.lang.Long amount;
	private java.lang.Double interestRate;
	private java.util.Date startDate;
	private java.util.Date endDate;
	private RepayMethodEnum repayMethod;
	private java.lang.String agreementUrl;
	private LoanStateEnum state;

	private List<ClaimDto> claimList;

	public LoanOrderDto(){
		String[] idd = UUID.randomUUID().toString().split("-");
		this.orderNo = idd[0] + idd[1] + idd[2] + idd[3];
		this.orderDate = new Date();
	}

	public LoanOrderDto(String lendingId, ClaimerTypeEnum lendingType, String borrowId, ClaimerTypeEnum borrowType){

	}

	public void fillLoanOrder(String operatorId, Long amount, Double rate, Date startDate, Date endDate){

	}

	public String getBlockCode() {
		return blockCode;
	}

	public void setBlockCode(String blockCode) {
		this.blockCode = blockCode;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getLoanId() {
		return loanId;
	}

	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}

	public String getLendingId() {
		return lendingId;
	}

	public void setLendingId(String lendingId) {
		this.lendingId = lendingId;
	}

	public ClaimerTypeEnum getLendingType() {
		return lendingType;
	}

	public void setLendingType(ClaimerTypeEnum lendingType) {
		this.lendingType = lendingType;
	}

	public String getBorrowId() {
		return borrowId;
	}

	public void setBorrowId(String borrowId) {
		this.borrowId = borrowId;
	}

	public ClaimerTypeEnum getBorrowType() {
		return borrowType;
	}

	public void setBorrowType(ClaimerTypeEnum borrowType) {
		this.borrowType = borrowType;
	}

	public String getGuaranteeId() {
		return guaranteeId;
	}

	public void setGuaranteeId(String guaranteeId) {
		this.guaranteeId = guaranteeId;
	}

	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public RepayMethodEnum getRepayMethod() {
		return repayMethod;
	}

	public void setRepayMethod(RepayMethodEnum repayMethod) {
		this.repayMethod = repayMethod;
	}

	public String getAgreementUrl() {
		return agreementUrl;
	}

	public void setAgreementUrl(String agreementUrl) {
		this.agreementUrl = agreementUrl;
	}

	public LoanStateEnum getState() {
		return state;
	}

	public void setState(LoanStateEnum state) {
		this.state = state;
	}

	public List<ClaimDto> getClaimList() {
		return claimList;
	}

	public void setClaimList(List<ClaimDto> claimList) {
		this.claimList = claimList;
	}
}
