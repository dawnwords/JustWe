package com.justwe.bean.response;

public class LoginResponse extends Result {
	private int RETCODE;
	private String MESSAGE;
	private int MODULE_ID;
	private String LAST_TIME;
	private String LAST_IP;
	private int CHG_PWD;
	private String NAME;

	@Override
	public String toString() {
		return "LoginResponse [RETCODE=" + RETCODE + ", MESSAGE=" + MESSAGE
				+ ", MODULE_ID=" + MODULE_ID + ", LAST_TIME=" + LAST_TIME
				+ ", LAST_IP=" + LAST_IP + ", CHG_PWD=" + CHG_PWD + ", NAME="
				+ NAME + "]";
	}
}
