package com.chanjetpay.garlic.dto;

import java.io.Serializable;

/**
 * Created by libaoa on 2017/11/13.
 */
public class UserDto implements Serializable {
	private static final long serialVersionUID = -225057335725878943L;

	private String nickName;
	private PhotoDto photo;
	private String loginName;
	private String password;
	private String email;
	private String phone;

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public PhotoDto getPhoto() {
		return photo;
	}

	public void setPhoto(PhotoDto photo) {
		this.photo = photo;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "UserDto{" +
				"nickName='" + nickName + '\'' +
				", photo=" + photo +
				", loginName='" + loginName + '\'' +
				", password='" + password + '\'' +
				", email='" + email + '\'' +
				", phone='" + phone + '\'' +
				'}';
	}
}
