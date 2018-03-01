package com.chanjetpay.garlic.dto;

import java.io.Serializable;
import java.util.List;

public class DepositDto implements Serializable {

	private String merchantId;
	private Long amount;
	private String memberId;
	private String operatorId;

	private String memo;

	private List<ClaimDto> claimList;

}
