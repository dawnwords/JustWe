package com.justwe.bean.response;

import java.util.List;

public class ListResponse<T> implements Response {
	protected Result RESULT;
	protected List<T> RESULTLIST;

	@Override
	public long getReturnCode() {
		return RESULT.getReturnCode();
	}

	@Override
	public String getMessage() {
		return RESULT.getMessage();
	}

	@Override
	public String toString() {
		return "ListResponse [RESULT=" + RESULT + ", RESULTLIST="
				+ RESULTLIST + "]";
	}

	public List<T> getResultList() {
		return RESULTLIST;
	}
}
