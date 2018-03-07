package com.chanjetpay.garlic.dto;

import java.util.UUID;

public class NoticeDto {

	/**
	 * 通知类型
	 */
	public static final Integer TYPE_CODE_NOTICE = 0;
	/**
	 * 预警类型
	 */
	public static final Integer TYPE_CODE_ALERT = 1;

	/**
	 * 未读状态
	 */
	public static final Integer STATE_CODE_UNREAD = 0;

	/**
	 * 已读状态
	 */
	public static final Integer STATE_CODE_READ = 1;

	private String id;
	private String merchantId;
	private String memberId;
	private String blockCode;
	private String title;
	private String message;
	private String sender;
	private String linkUri;
	private Integer type;
	private Integer state;

	public NoticeDto(){
		this.id = UUID.randomUUID().toString().replaceAll("-", "");
		this.state = STATE_CODE_UNREAD;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private String iconUrl;

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getBlockCode() {
		return blockCode;
	}

	public void setBlockCode(String blockCode) {
		this.blockCode = blockCode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getLinkUri() {
		return linkUri;
	}

	public void setLinkUri(String linkUri) {
		this.linkUri = linkUri;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
		if(type == TYPE_CODE_NOTICE){
			this.iconUrl = "/img/avatar/people/Hershell.png";
			this.linkUri = "/vender/notice";
		}else if(type == TYPE_CODE_ALERT){
			this.iconUrl = "/img/avatar/people/Meggie.png";
			this.linkUri = "/vender/alert";
		}
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getIconUrl() {
		return iconUrl;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	@Override
	public String toString() {
		return "NoticeDto{" +
				"id='" + id + '\'' +
				", merchantId='" + merchantId + '\'' +
				", memberId='" + memberId + '\'' +
				", blockCode='" + blockCode + '\'' +
				", title='" + title + '\'' +
				", message='" + message + '\'' +
				", sender='" + sender + '\'' +
				", linkUri='" + linkUri + '\'' +
				", type=" + type +
				", state=" + state +
				", iconUrl='" + iconUrl + '\'' +
				'}';
	}
}
