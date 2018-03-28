package com.chanjetpay.garlic.dto;

import com.chanjetpay.garlic.enums.AccountTypeEnum;
import com.chanjetpay.garlic.enums.DirectionEnum;
import com.chanjetpay.garlic.enums.JournalTypeEnum;
import com.chanjetpay.garlic.enums.RecordingMethodEnum;

import java.util.Date;

public class AccountDetailDto {

	private java.lang.String orgCode;
	private java.lang.String accountNo;
	private AccountTypeEnum accountType;
	private java.lang.String accountCategory;
	private java.lang.String owner;
	private java.lang.String subCode;
	private java.lang.String accountingNo;
	private java.util.Date accountingTime;
	private java.lang.String funcCode;
	private java.lang.String tradeCode;
	private java.lang.String clearingCode;
	private java.lang.Integer actionSeq;
	private JournalTypeEnum journalType;
	private java.lang.Integer journalSeq;
	private java.lang.String requestNo;
	private java.lang.String requestType;
	private RecordingMethodEnum recordingMethod;
	private java.lang.String transType;
	private java.util.Date transTime;
	private java.lang.String tradeFlowNo;
	private java.lang.String currency;
	private java.lang.Long amount;
	private java.lang.Integer count;
	private DirectionEnum direction;
	private java.lang.Long lastBalance;
	private java.lang.String tamper;
	private java.lang.String summary;
	private java.lang.String pairSubCode;
	private java.lang.String pairAccountNo;
	private java.lang.String antiAccountingNo;
	private java.util.Date antiAccountingTime;

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public AccountTypeEnum getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountTypeEnum accountType) {
		this.accountType = accountType;
	}

	public String getAccountCategory() {
		return accountCategory;
	}

	public void setAccountCategory(String accountCategory) {
		this.accountCategory = accountCategory;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getSubCode() {
		return subCode;
	}

	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}

	public String getAccountingNo() {
		return accountingNo;
	}

	public void setAccountingNo(String accountingNo) {
		this.accountingNo = accountingNo;
	}

	public Date getAccountingTime() {
		return accountingTime;
	}

	public void setAccountingTime(Date accountingTime) {
		this.accountingTime = accountingTime;
	}

	public String getFuncCode() {
		return funcCode;
	}

	public void setFuncCode(String funcCode) {
		this.funcCode = funcCode;
	}

	public String getTradeCode() {
		return tradeCode;
	}

	public void setTradeCode(String tradeCode) {
		this.tradeCode = tradeCode;
	}

	public String getClearingCode() {
		return clearingCode;
	}

	public void setClearingCode(String clearingCode) {
		this.clearingCode = clearingCode;
	}

	public Integer getActionSeq() {
		return actionSeq;
	}

	public void setActionSeq(Integer actionSeq) {
		this.actionSeq = actionSeq;
	}

	public JournalTypeEnum getJournalType() {
		return journalType;
	}

	public void setJournalType(JournalTypeEnum journalType) {
		this.journalType = journalType;
	}

	public Integer getJournalSeq() {
		return journalSeq;
	}

	public void setJournalSeq(Integer journalSeq) {
		this.journalSeq = journalSeq;
	}

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public RecordingMethodEnum getRecordingMethod() {
		return recordingMethod;
	}

	public void setRecordingMethod(RecordingMethodEnum recordingMethod) {
		this.recordingMethod = recordingMethod;
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

	public String getTradeFlowNo() {
		return tradeFlowNo;
	}

	public void setTradeFlowNo(String tradeFlowNo) {
		this.tradeFlowNo = tradeFlowNo;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public DirectionEnum getDirection() {
		return direction;
	}

	public void setDirection(DirectionEnum direction) {
		this.direction = direction;
	}

	public Long getLastBalance() {
		return lastBalance;
	}

	public void setLastBalance(Long lastBalance) {
		this.lastBalance = lastBalance;
	}

	public String getTamper() {
		return tamper;
	}

	public void setTamper(String tamper) {
		this.tamper = tamper;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getPairSubCode() {
		return pairSubCode;
	}

	public void setPairSubCode(String pairSubCode) {
		this.pairSubCode = pairSubCode;
	}

	public String getPairAccountNo() {
		return pairAccountNo;
	}

	public void setPairAccountNo(String pairAccountNo) {
		this.pairAccountNo = pairAccountNo;
	}

	public String getAntiAccountingNo() {
		return antiAccountingNo;
	}

	public void setAntiAccountingNo(String antiAccountingNo) {
		this.antiAccountingNo = antiAccountingNo;
	}

	public Date getAntiAccountingTime() {
		return antiAccountingTime;
	}

	public void setAntiAccountingTime(Date antiAccountingTime) {
		this.antiAccountingTime = antiAccountingTime;
	}
}
