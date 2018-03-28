package com.chanjetpay.garlic.dto;

import com.chanjetpay.garlic.enums.ClaimStateEnum;
import com.chanjetpay.garlic.enums.ClaimerTypeEnum;
import com.chanjetpay.garlic.enums.DueTypeEnum;

import java.util.Date;
import java.util.UUID;

public class ClaimDto {
	private java.lang.String blockCode;
	private java.lang.String agreementNo;
	private java.lang.String orderNo;
	private java.util.Date orderDate;
	private DueTypeEnum dueType;
	private java.util.Date startDay;
	private java.util.Date endDay;
	private java.lang.String tradeFlowNo;
	private java.lang.String transNo;
	private java.lang.String transType;
	private java.util.Date transTime;
	private java.lang.String bizType;
	private java.lang.String busiTypeId;
	private java.lang.String creditor;
	private ClaimerTypeEnum creditorType;
	private java.lang.String debtor;
	private ClaimerTypeEnum debtorType;
	private java.lang.Double rate;
	private java.lang.Long originalAmount;
	private java.lang.Long arrearAmount;
	private java.lang.Double fine;
	private java.lang.Long fineAmount;
	private java.lang.Integer repayTimes;
	private java.util.Date lastRepayDay;
	private ClaimStateEnum state;

	private String operatorId;

	public Boolean checkOrderFields(){
		return operatorId == null
				|| startDay == null
				|| endDay == null
				|| blockCode == null
				|| dueType == null
				|| originalAmount == null
				|| arrearAmount == null;
	}

	public ClaimDto(){
		String[] idd = UUID.randomUUID().toString().split("-");
		this.orderNo = idd[0] + idd[1] + idd[2] + idd[3];
		this.orderDate = new Date();
	}

	public ClaimDto(Date startDay, Date endDay, Long amount, DueTypeEnum dueType){
		this.startDay = startDay;
		this.endDay = endDay;
		this.originalAmount = amount;
		this.arrearAmount = amount;
		this.dueType = dueType;

		String[] idd = UUID.randomUUID().toString().split("-");
		this.orderNo = idd[0] + idd[1] + idd[2] + idd[3];
		this.orderDate = new Date();
	}

	public String getBlockCode() {
		return blockCode;
	}

	public void setBlockCode(String blockCode) {
		this.blockCode = blockCode;
	}

	public String getAgreementNo() {
		return agreementNo;
	}

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
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

	public DueTypeEnum getDueType() {
		return dueType;
	}

	public void setDueType(DueTypeEnum dueType) {
		this.dueType = dueType;
	}

	public Date getStartDay() {
		return startDay;
	}

	public void setStartDay(Date startDay) {
		this.startDay = startDay;
	}

	public Date getEndDay() {
		return endDay;
	}

	public void setEndDay(Date endDay) {
		this.endDay = endDay;
	}

	public String getTradeFlowNo() {
		return tradeFlowNo;
	}

	public void setTradeFlowNo(String tradeFlowNo) {
		this.tradeFlowNo = tradeFlowNo;
	}

	public String getTransNo() {
		return transNo;
	}

	public void setTransNo(String transNo) {
		this.transNo = transNo;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public Date getTransTime() {
		return transTime;
	}

	public void setTransTime(Date transTime) {
		this.transTime = transTime;
	}

	public String getBizType() {
		return bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getBusiTypeId() {
		return busiTypeId;
	}

	public void setBusiTypeId(String busiTypeId) {
		this.busiTypeId = busiTypeId;
	}

	public String getCreditor() {
		return creditor;
	}

	public void setCreditor(String creditor) {
		this.creditor = creditor;
	}

	public ClaimerTypeEnum getCreditorType() {
		return creditorType;
	}

	public void setCreditorType(ClaimerTypeEnum creditorType) {
		this.creditorType = creditorType;
	}

	public String getDebtor() {
		return debtor;
	}

	public void setDebtor(String debtor) {
		this.debtor = debtor;
	}

	public ClaimerTypeEnum getDebtorType() {
		return debtorType;
	}

	public void setDebtorType(ClaimerTypeEnum debtorType) {
		this.debtorType = debtorType;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public Long getOriginalAmount() {
		return originalAmount;
	}

	public void setOriginalAmount(Long originalAmount) {
		this.originalAmount = originalAmount;
	}

	public Long getArrearAmount() {
		return arrearAmount;
	}

	public void setArrearAmount(Long arrearAmount) {
		this.arrearAmount = arrearAmount;
	}

	public Double getFine() {
		return fine;
	}

	public void setFine(Double fine) {
		this.fine = fine;
	}

	public Long getFineAmount() {
		return fineAmount;
	}

	public void setFineAmount(Long fineAmount) {
		this.fineAmount = fineAmount;
	}

	public Integer getRepayTimes() {
		return repayTimes;
	}

	public void setRepayTimes(Integer repayTimes) {
		this.repayTimes = repayTimes;
	}

	public Date getLastRepayDay() {
		return lastRepayDay;
	}

	public void setLastRepayDay(Date lastRepayDay) {
		this.lastRepayDay = lastRepayDay;
	}

	public ClaimStateEnum getState() {
		return state;
	}

	public void setState(ClaimStateEnum state) {
		this.state = state;
	}

	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	@Override
	public String toString() {
		return "ClaimDto{" +
				"blockCode='" + blockCode + '\'' +
				", agreementNo='" + agreementNo + '\'' +
				", orderNo='" + orderNo + '\'' +
				", orderDate=" + orderDate +
				", dueType=" + dueType +
				", startDay=" + startDay +
				", endDay=" + endDay +
				", tradeFlowNo='" + tradeFlowNo + '\'' +
				", transNo='" + transNo + '\'' +
				", transType='" + transType + '\'' +
				", transTime=" + transTime +
				", bizType='" + bizType + '\'' +
				", busiTypeId='" + busiTypeId + '\'' +
				", creditor='" + creditor + '\'' +
				", creditorType=" + creditorType +
				", debtor='" + debtor + '\'' +
				", debtorType=" + debtorType +
				", rate=" + rate +
				", arrearAmount=" + arrearAmount +
				", fine=" + fine +
				", fineAmount=" + fineAmount +
				", repayTimes=" + repayTimes +
				", lastRepayDay=" + lastRepayDay +
				", state=" + state +
				", operatorId='" + operatorId + '\'' +
				'}';
	}
}
