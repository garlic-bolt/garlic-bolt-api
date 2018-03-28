package com.chanjetpay.garlic.dto;

import java.util.Date;
import java.util.List;

public class RecordingRequestDto {
	private String requestNo;
	private Date requestTime;

	List<VoucherDto> voucherList;


	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public Date getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(Date requestTime) {
		this.requestTime = requestTime;
	}

	public List<VoucherDto> getVoucherList() {
		return voucherList;
	}

	public void setVoucherList(List<VoucherDto> voucherList) {
		this.voucherList = voucherList;
	}
}
