package com.chanjetpay.garlic.dto;

import com.chanjetpay.garlic.enums.AuthorityTypeEnum;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AuthorityDto implements Serializable {
	private static final long serialVersionUID = -6762995596109534381L;

	private java.lang.String authCode;
	private java.lang.String authName;
	private java.lang.String parentCode;
	private java.lang.Integer level;
	private java.lang.String title;
	private java.lang.String uri;
	private java.lang.String icon;
	private java.lang.String mask;
	private java.lang.String anot;
	private AuthorityTypeEnum type;

	private List<AuthorityDto> subAuthorityList = new ArrayList<>();

	public List<AuthorityDto> getSubAuthorityList() {
		return subAuthorityList;
	}

	public void setSubAuthorityList(List<AuthorityDto> subAuthorityList) {
		this.subAuthorityList = subAuthorityList;
	}

	public String getAuthCode() {
		return authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getAuthName() {
		return authName;
	}

	public void setAuthName(String authName) {
		this.authName = authName;
	}

	public String getParentCode() {
		return parentCode;
	}

	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getMask() {
		return mask;
	}

	public void setMask(String mask) {
		this.mask = mask;
	}

	public String getAnot() {
		return anot;
	}

	public void setAnot(String anot) {
		this.anot = anot;
	}

	public AuthorityTypeEnum getType() {
		return type;
	}

	public void setType(AuthorityTypeEnum type) {
		this.type = type;
	}
}
