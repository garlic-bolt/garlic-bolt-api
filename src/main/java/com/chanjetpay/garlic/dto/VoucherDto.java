package com.chanjetpay.garlic.dto;

import com.chanjetpay.garlic.enums.AccountingStateEnum;
import com.chanjetpay.garlic.enums.BookingStateEnum;
import com.chanjetpay.garlic.enums.JournalStateEnum;
import com.chanjetpay.garlic.enums.VoucherTypeEnum;

import java.util.Date;

public class VoucherDto extends AccountDto {

	private java.lang.String orgCode;
	private java.lang.String accountingNo;
	private java.util.Date accountingTime;
	private java.lang.String requestNo;
	private java.lang.String requestType;
	private java.util.Date requestTime;
	private VoucherTypeEnum voucherType;
	private java.lang.String booker;
	private java.lang.String funcCode;
	private java.lang.String tradeCode;
	private java.lang.String clearingCode;
	private java.lang.String transNo;
	private java.lang.String transType;
	private java.lang.String tradeFlowNo;
	private java.util.Date transTime;
	private java.lang.String currency;
	private java.lang.String accountNo1;
	private java.lang.String accountNo2;
	private java.lang.String accountNo3;
	private java.lang.String subCode1;
	private java.lang.String subCode2;
	private java.lang.String subCode3;
	private java.lang.Long amount1;
	private java.lang.Long amount2;
	private java.lang.Long amount3;
	private java.lang.Long fee1;
	private java.lang.Long fee2;
	private JournalStateEnum journalState;
	private AccountingStateEnum accountingState;
	private BookingStateEnum bookingState;
	private java.lang.String antiAccountingNo;
	private java.util.Date antiAccountingTime;
	private java.lang.String summary;

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
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

	public Date getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(Date requestTime) {
		this.requestTime = requestTime;
	}

	public VoucherTypeEnum getVoucherType() {
		return voucherType;
	}

	public void setVoucherType(VoucherTypeEnum voucherType) {
		this.voucherType = voucherType;
	}

	public String getBooker() {
		return booker;
	}

	public void setBooker(String booker) {
		this.booker = booker;
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

	public String getTradeFlowNo() {
		return tradeFlowNo;
	}

	public void setTradeFlowNo(String tradeFlowNo) {
		this.tradeFlowNo = tradeFlowNo;
	}

	public Date getTransTime() {
		return transTime;
	}

	public void setTransTime(Date transTime) {
		this.transTime = transTime;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getAccountNo1() {
		return accountNo1;
	}

	public void setAccountNo1(String accountNo1) {
		this.accountNo1 = accountNo1;
	}

	public String getAccountNo2() {
		return accountNo2;
	}

	public void setAccountNo2(String accountNo2) {
		this.accountNo2 = accountNo2;
	}

	public String getAccountNo3() {
		return accountNo3;
	}

	public void setAccountNo3(String accountNo3) {
		this.accountNo3 = accountNo3;
	}

	public String getSubCode1() {
		return subCode1;
	}

	public void setSubCode1(String subCode1) {
		this.subCode1 = subCode1;
	}

	public String getSubCode2() {
		return subCode2;
	}

	public void setSubCode2(String subCode2) {
		this.subCode2 = subCode2;
	}

	public String getSubCode3() {
		return subCode3;
	}

	public void setSubCode3(String subCode3) {
		this.subCode3 = subCode3;
	}

	public Long getAmount1() {
		return amount1;
	}

	public void setAmount1(Long amount1) {
		this.amount1 = amount1;
	}

	public Long getAmount2() {
		return amount2;
	}

	public void setAmount2(Long amount2) {
		this.amount2 = amount2;
	}

	public Long getAmount3() {
		return amount3;
	}

	public void setAmount3(Long amount3) {
		this.amount3 = amount3;
	}

	public Long getFee1() {
		return fee1;
	}

	public void setFee1(Long fee1) {
		this.fee1 = fee1;
	}

	public Long getFee2() {
		return fee2;
	}

	public void setFee2(Long fee2) {
		this.fee2 = fee2;
	}

	public JournalStateEnum getJournalState() {
		return journalState;
	}

	public void setJournalState(JournalStateEnum journalState) {
		this.journalState = journalState;
	}

	public AccountingStateEnum getAccountingState() {
		return accountingState;
	}

	public void setAccountingState(AccountingStateEnum accountingState) {
		this.accountingState = accountingState;
	}

	public BookingStateEnum getBookingState() {
		return bookingState;
	}

	public void setBookingState(BookingStateEnum bookingState) {
		this.bookingState = bookingState;
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

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}
}
