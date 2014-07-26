package com.justwe.bean.request;

import com.justwe.bean.session.Session;

@RequestName(value = "change_password")
public class ChangePassRequest implements Request {
	private String USER_ID;
	private String OLD_PASSWORD;
	private String NEW_PASSWORD;
	private long SESSION_ID;

	public ChangePassRequest(String oLD_PASSWORD, String nEW_PASSWORD)
			throws Exception {
		USER_ID = Session.getInstance().getUserId();
		OLD_PASSWORD = oLD_PASSWORD;
		NEW_PASSWORD = nEW_PASSWORD;
		SESSION_ID = Session.getInstance().getSessionId();
	}

	@Override
	public String toString() {
		return "ChangePassRequest [USER_ID=" + USER_ID + ", OLD_PASSWORD="
				+ OLD_PASSWORD + ", NEW_PASSWORD=" + NEW_PASSWORD
				+ ", SESSION_ID=" + SESSION_ID + "]";
	}

}
