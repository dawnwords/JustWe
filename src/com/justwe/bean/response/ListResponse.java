package com.justwe.bean.response;

import java.util.List;

public abstract class ListResponse implements Response {
	private Result RESULT;

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
				+ getResultList() + "]";
	}

	protected abstract List<?> getResultList();
}
