package com.justwe.bean.request;

import com.justwe.bean.session.Session;

@RequestName(value = "userlogoff")
public class LogoutRequest implements Request {
	private String USER_ID;
	private long SESSION_ID;

	public LogoutRequest() throws Exception{
		USER_ID = Session.getInstance().getUserId();
		SESSION_ID = Session.getInstance().getSessionId();
	}

	@Override
	public String toString() {
		return "LogoutRequest [USER_ID=" + USER_ID + ", SESSION_ID="
				+ SESSION_ID + "]";
	}
}
