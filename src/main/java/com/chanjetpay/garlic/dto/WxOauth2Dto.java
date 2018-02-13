package com.chanjetpay.garlic.dto;

import java.io.Serializable;

public class WxOauth2Dto implements Serializable {

	private static final long serialVersionUID = -3798067683284315542L;

	private String appId;
	private String redirectUri;
	private String responseType;
	private String scope;
	private String state;

	public WxOauth2Dto(){

	}

	public WxOauth2Dto(String redirectUri, String State){
		this.redirectUri = redirectUri;
		this.state = State;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getRedirectUri() {
		return redirectUri;
	}

	public void setRedirectUri(String redirectUri) {
		this.redirectUri = redirectUri;
	}

	public String getResponseType() {
		return responseType;
	}

	public void setResponseType(String responseType) {
		this.responseType = responseType;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "WxOauth2Dto{" +
				"appId='" + appId + '\'' +
				", redirectUri='" + redirectUri + '\'' +
				", responseType='" + responseType + '\'' +
				", scope='" + scope + '\'' +
				", state='" + state + '\'' +
				'}';
	}
}
