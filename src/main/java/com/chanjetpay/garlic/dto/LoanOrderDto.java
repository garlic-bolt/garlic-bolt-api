package com.chanjetpay.garlic.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class LoanOrderDto implements Serializable{
	private static final long serialVersionUID = 1689989041592520827L;


	private String merchantId;
	private Long amount;


	private Date endingDate;
	private Integer rate;

	private String purpose;
	private String operatorId;

	private List<ClaimDto> claimList;


}
