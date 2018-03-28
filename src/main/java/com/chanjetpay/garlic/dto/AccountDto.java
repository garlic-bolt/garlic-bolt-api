package com.chanjetpay.garlic.dto;

import com.chanjetpay.garlic.enums.AccountStateEnum;
import com.chanjetpay.garlic.enums.AccountTypeEnum;
import com.chanjetpay.garlic.enums.DebitAttrEnum;
import com.chanjetpay.garlic.enums.OffBalanceIndEnum;

import java.util.Date;
import java.util.List;

public class AccountDto {
	private java.lang.String orgCode;
	private java.lang.String accountNo;
	private java.lang.String accountName;
	private AccountTypeEnum accountType;
	private java.lang.String accountCategory;
	private java.lang.String owner;
	private java.lang.String accountCode;
	private java.lang.String accountGroup;
	private java.lang.String subjectCode;
	private DebitAttrEnum debitAttr;
	private java.lang.String currency;
	private java.lang.Long balance;
	private java.lang.Long settleBalance;
	private java.lang.Long frozenBalance;
	private java.lang.Long lastDayBalance;
	private java.lang.String overdrawFlag;
	private java.lang.Long overdrawAmount;
	private java.lang.String interestFlag;
	private java.lang.String interestCode;
	private OffBalanceIndEnum offBalanceInd;
	private java.lang.String authFlag;
	private java.lang.String authCode;
	private java.util.Date expired;
	private java.lang.Long version;
	private java.lang.String tamper;
	private java.lang.String remark;
	private AccountStateEnum state;

	private List<AccountDetailDto> accountDetails;

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

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
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

	public String getAccountCode() {
		return accountCode;
	}

	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}

	public String getAccountGroup() {
		return accountGroup;
	}

	public void setAccountGroup(String accountGroup) {
		this.accountGroup = accountGroup;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public DebitAttrEnum getDebitAttr() {
		return debitAttr;
	}

	public void setDebitAttr(DebitAttrEnum debitAttr) {
		this.debitAttr = debitAttr;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Long getBalance() {
		return balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}

	public Long getSettleBalance() {
		return settleBalance;
	}

	public void setSettleBalance(Long settleBalance) {
		this.settleBalance = settleBalance;
	}

	public Long getFrozenBalance() {
		return frozenBalance;
	}

	public void setFrozenBalance(Long frozenBalance) {
		this.frozenBalance = frozenBalance;
	}

	public Long getLastDayBalance() {
		return lastDayBalance;
	}

	public void setLastDayBalance(Long lastDayBalance) {
		this.lastDayBalance = lastDayBalance;
	}

	public String getOverdrawFlag() {
		return overdrawFlag;
	}

	public void setOverdrawFlag(String overdrawFlag) {
		this.overdrawFlag = overdrawFlag;
	}

	public Long getOverdrawAmount() {
		return overdrawAmount;
	}

	public void setOverdrawAmount(Long overdrawAmount) {
		this.overdrawAmount = overdrawAmount;
	}

	public String getInterestFlag() {
		return interestFlag;
	}

	public void setInterestFlag(String interestFlag) {
		this.interestFlag = interestFlag;
	}

	public String getInterestCode() {
		return interestCode;
	}

	public void setInterestCode(String interestCode) {
		this.interestCode = interestCode;
	}

	public OffBalanceIndEnum getOffBalanceInd() {
		return offBalanceInd;
	}

	public void setOffBalanceInd(OffBalanceIndEnum offBalanceInd) {
		this.offBalanceInd = offBalanceInd;
	}

	public String getAuthFlag() {
		return authFlag;
	}

	public void setAuthFlag(String authFlag) {
		this.authFlag = authFlag;
	}

	public String getAuthCode() {
		return authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public Date getExpired() {
		return expired;
	}

	public void setExpired(Date expired) {
		this.expired = expired;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public String getTamper() {
		return tamper;
	}

	public void setTamper(String tamper) {
		this.tamper = tamper;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public AccountStateEnum getState() {
		return state;
	}

	public void setState(AccountStateEnum state) {
		this.state = state;
	}

	public List<AccountDetailDto> getAccountDetails() {
		return accountDetails;
	}

	public void setAccountDetails(List<AccountDetailDto> accountDetails) {
		this.accountDetails = accountDetails;
	}

	@Override
	public String toString() {
		return "AccountDto{" +
				"orgCode='" + orgCode + '\'' +
				", accountNo='" + accountNo + '\'' +
				", accountName='" + accountName + '\'' +
				", accountType=" + accountType +
				", accountCategory='" + accountCategory + '\'' +
				", owner='" + owner + '\'' +
				", accountCode='" + accountCode + '\'' +
				", accountGroup='" + accountGroup + '\'' +
				", subjectCode='" + subjectCode + '\'' +
				", debitAttr=" + debitAttr +
				", currency='" + currency + '\'' +
				", balance=" + balance +
				", settleBalance=" + settleBalance +
				", frozenBalance=" + frozenBalance +
				", lastDayBalance=" + lastDayBalance +
				", overdrawFlag='" + overdrawFlag + '\'' +
				", overdrawAmount=" + overdrawAmount +
				", interestFlag='" + interestFlag + '\'' +
				", interestCode='" + interestCode + '\'' +
				", offBalanceInd=" + offBalanceInd +
				", authFlag='" + authFlag + '\'' +
				", authCode='" + authCode + '\'' +
				", expired=" + expired +
				", version=" + version +
				", tamper='" + tamper + '\'' +
				", remark='" + remark + '\'' +
				", state=" + state +
				", accountDetails=" + accountDetails +
				'}';
	}
}
