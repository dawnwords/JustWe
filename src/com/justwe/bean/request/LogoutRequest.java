package com.justwe.bean.request;

@RequestName(value="userlogoff")
public class LogoutRequest implements Request{
	private String USER_ID;
	private long SESSION_ID;
	
	public LogoutRequest(String uSER_ID, long sESSION_ID) {
		USER_ID = uSER_ID;
		SESSION_ID = sESSION_ID;
	}

	@Override
	public String toString() {
		return "LogoutRequest [USER_ID=" + USER_ID + ", SESSION_ID="
				+ SESSION_ID + "]";
	}
}
