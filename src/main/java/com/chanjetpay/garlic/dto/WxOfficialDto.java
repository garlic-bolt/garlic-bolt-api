package com.chanjetpay.garlic.dto;

import com.chanjetpay.garlic.enums.CooperateStateEnum;
import com.chanjetpay.garlic.enums.OfficialTypeEnum;

import java.io.Serializable;

public class WxOfficialDto implements Serializable {
	private static final long serialVersionUID = 4393231038823406L;

	private java.lang.String blockCode;
	private java.lang.String officialId;
	private OfficialTypeEnum officialType;
	private java.lang.String appId;
	private java.lang.String appSecret;
	private java.lang.String url;
	private java.lang.String token;
	private java.lang.String domain;
	private java.lang.String grantType;
	private java.lang.String accessToken;
	private java.lang.Integer expiresIn;
	private CooperateStateEnum state;

	public WxOfficialDto(){

	}

	public WxOfficialDto(String officialId, String appId, String appSecret) {
		this.officialId = officialId;
		this.appId = appId;
		this.appSecret = appSecret;
	}

	public String getBlockCode() {
		return blockCode;
	}

	public void setBlockCode(String blockCode) {
		this.blockCode = blockCode;
	}

	public String getOfficialId() {
		return officialId;
	}

	public void setOfficialId(String officialId) {
		this.officialId = officialId;
	}

	public OfficialTypeEnum getOfficialType() {
		return officialType;
	}

	public void setOfficialType(OfficialTypeEnum officialType) {
		this.officialType = officialType;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getAppSecret() {
		return appSecret;
	}

	public void setAppSecret(String appSecret) {
		this.appSecret = appSecret;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getGrantType() {
		return grantType;
	}

	public void setGrantType(String grantType) {
		this.grantType = grantType;
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

	public CooperateStateEnum getState() {
		return state;
	}

	public void setState(CooperateStateEnum state) {
		this.state = state;
	}
}
