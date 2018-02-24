package com.chanjetpay.garlic.dto;

import com.chanjetpay.garlic.enums.VoucherStateEnum;

import java.io.Serializable;
import java.util.Date;

public class QueryRegionDto implements Serializable {
	private static final long serialVersionUID = -2226452298015681626L;

	private Date beginDate;
	private Date endDate;

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
}
