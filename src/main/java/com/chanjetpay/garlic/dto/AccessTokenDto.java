package com.chanjetpay.garlic.dto;

import java.io.Serializable;

public class AccessTokenDto implements Serializable {
	private String blockCode;
	private String accessToken;
	private Integer expiresIn;
	private String grantType;

	public String getBlockCode() {
		return blockCode;
	}

	public void setBlockCode(String blockCode) {
		this.blockCode = blockCode;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public Integer getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(Integer expiresIn) {
		this.expiresIn = expiresIn;
	}

	public String getGrantType() {
		return grantType;
	}

	public void setGrantType(String grantType) {
		this.grantType = grantType;
	}

	@Override
	public String toString() {
		return "AccessTokenDto{" +
				"blockCode='" + blockCode + '\'' +
				", accessToken='" + accessToken + '\'' +
				", expiresIn=" + expiresIn +
				", grantType='" + grantType + '\'' +
				'}';
	}
}
