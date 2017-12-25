package com.chanjetpay.garlic.dto;

public class VoucherDto extends AccountDto {

	//记账流水号
	private String accountingNo;

	//资金方向
	private Integer capitalDirect;

	//发生额
	private Long amount;

	//是否检查透支
	private Boolean checkOverdraw;

	public String getAccountingNo() {
		return accountingNo;
	}

	public void setAccountingNo(String accountingNo) {
		this.accountingNo = accountingNo;
	}

	public Integer getCapitalDirect() {
		return capitalDirect;
	}

	public void setCapitalDirect(Integer capitalDirect) {
		this.capitalDirect = capitalDirect;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Boolean getCheckOverdraw() {
		return checkOverdraw;
	}

	public void setCheckOverdraw(Boolean checkOverdraw) {
		this.checkOverdraw = checkOverdraw;
	}
}
