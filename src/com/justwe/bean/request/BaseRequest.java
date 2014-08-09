package com.justwe.bean.request;

import com.justwe.bean.session.Session;

public class BaseRequest implements Request {
	protected String USER_ID;
	protected long SESSION_ID;

	public BaseRequest() throws Exception {
		USER_ID = Session.getInstance().getUserId();
		SESSION_ID = Session.getInstance().getSessionId();
	}

	@Override
	public String toString() {
		return "BaseRequest [USER_ID=" + USER_ID + ", SESSION_ID="
				+ SESSION_ID + "]";
	}
}
