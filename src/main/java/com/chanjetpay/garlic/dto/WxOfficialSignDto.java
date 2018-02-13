package com.chanjetpay.garlic.dto;

import java.io.Serializable;

public class WxOfficialSignDto implements Serializable {

	private String blockCode;
	private String timestamp;
	private String nonce;
	private String echo;
	private String signature;

	public WxOfficialSignDto(){

	}

	public WxOfficialSignDto(String timestamp, String nonce){
		this.timestamp = timestamp;
		this.nonce = nonce;
	}

	public String getBlockCode() {
		return blockCode;
	}

	public void setBlockCode(String blockCode) {
		this.blockCode = blockCode;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getNonce() {
		return nonce;
	}

	public void setNonce(String nonce) {
		this.nonce = nonce;
	}

	public String getEcho() {
		return echo;
	}

	public void setEcho(String echo) {
		this.echo = echo;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	@Override
	public String toString() {
		return "WxOfficialSignDto{" +
				"blockCode='" + blockCode + '\'' +
				", timestamp='" + timestamp + '\'' +
				", nonce='" + nonce + '\'' +
				", echo='" + echo + '\'' +
				", signature='" + signature + '\'' +
				'}';
	}
}
