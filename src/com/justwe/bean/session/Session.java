package com.justwe.bean.session;

public class Session {
	private static Session instance = new Session();

	private long sessionId;
	private Session() {
	}

	public static Session getInstance() {
		return instance;
	}

	public long getSessionId() {
		return sessionId;
	}

	public void setSessionId(long sessionId) {
		this.sessionId = sessionId;
	}
	
}
