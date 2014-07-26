package com.justwe.bean.request;

import com.justwe.bean.session.Session;

@RequestName(value = "userlogin")
public class LoginRequest implements Request {
	private String USER_ID;
	private String PASSWORD;
	private String VERSIONINFO;

	public LoginRequest() {
		USER_ID = Session.getInstance().getUserId();
		PASSWORD = Session.getInstance().getPassword();
		VERSIONINFO = "";
	}

	@Override
	public String toString() {
		return "LoginRequest [USER_ID=" + USER_ID + ", PASSWORD=" + PASSWORD
				+ ", VERSIONINFO=" + VERSIONINFO + "]";
	}
}
