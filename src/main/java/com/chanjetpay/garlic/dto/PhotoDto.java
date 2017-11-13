package com.chanjetpay.garlic.dto;

import java.io.Serializable;

/**
 * Created by libaoa on 2017/11/13.
 */
public class PhotoDto implements Serializable {
	private static final long serialVersionUID = 5443644118517867665L;

	private String photoName;
	private String fileName;
	private String url;
	private String memo;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getPhotoName() {
		return photoName;
	}

	public void setPhotoName(String photoName) {
		this.photoName = photoName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Override
	public String toString() {
		return "PhotoDto{" +
				"photoName='" + photoName + '\'' +
				", fileName='" + fileName + '\'' +
				", url='" + url + '\'' +
				", memo='" + memo + '\'' +
				'}';
	}
}
