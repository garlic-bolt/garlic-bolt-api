package com.chanjetpay.garlic.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by libaoa on 2017/11/13.
 */
public class BlockDto implements Serializable{
	private static final long serialVersionUID = -3605719014997445916L;

	private String blockName;
	private String province;
	private String city;
	private String district;

	private Long longitude;
	private Long latitude ;

	private List<PhotoDto> photos;


	private String master;
	private List<AdminDto> admins;



}
