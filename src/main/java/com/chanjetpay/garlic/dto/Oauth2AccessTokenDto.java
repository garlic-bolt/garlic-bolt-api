package com.chanjetpay.garlic.dto;

import java.io.Serializable;

public class Oauth2AccessTokenDto implements Serializable {
	private String blockCode;
	private String accessToken;
	private Integer expiresIn;
	private String refreshToken;
	private String openId;
	private String scope;

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

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	@Override
	public String toString() {
		return "Oauth2AccessTokenDto{" +
				"blockCode='" + blockCode + '\'' +
				", accessToken='" + accessToken + '\'' +
				", expiresIn=" + expiresIn +
				", refreshToken='" + refreshToken + '\'' +
				", openId='" + openId + '\'' +
				", scope='" + scope + '\'' +
				'}';
	}
}
