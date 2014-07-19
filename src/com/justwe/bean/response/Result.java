package com.justwe.bean.response;

public class Result implements Response {
	protected long RETCODE;
	protected String MESSAGE;
	
	@Override
	public String toString() {
		return "Result [RETCODE=" + RETCODE + ", MESSAGE=" + MESSAGE + "]";
	}
	@Override
	public long getReturnCode() {
		return RETCODE;
	}
	@Override
	public String getMessage() {
		return MESSAGE;
	}
}
