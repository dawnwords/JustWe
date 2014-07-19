package com.justwe.bean.request;

@RequestName(value = "userlogin")
public class LoginRequest implements Request {
	private String USER_ID;
	private String PASSWORD;
	private String VERSIONINFO;

	public LoginRequest(String uSER_ID, String pASSWORD, String vERSIONINFO) {
		USER_ID = uSER_ID;
		PASSWORD = pASSWORD;
		VERSIONINFO = vERSIONINFO;
	}

	@Override
	public String toString() {
		return "LoginRequest [USER_ID=" + USER_ID + ", PASSWORD=" + PASSWORD
				+ ", VERSIONINFO=" + VERSIONINFO + "]";
	}
}
