package com.chanjetpay.garlic.dto;

import java.io.Serializable;

/**
 * 抵消债务
 */
public class CrossLoanDto implements Serializable {

	private String merchantId;
	private Long amount;
	private String operatorId;

}
