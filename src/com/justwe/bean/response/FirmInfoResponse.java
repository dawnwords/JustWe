package com.justwe.bean.response;

import java.util.List;

import com.justwe.bean.data.FirmInfoRec;

public class FirmInfoResponse implements Response {

	private Result RESULT;
	private List<FirmInfoRec> RESULTLIST;

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
		return "FirmInfoResponse [RESULT=" + RESULT + ", RESULTLIST="
				+ RESULTLIST + "]";
	}

	public List<FirmInfoRec> getResultList() {
		return RESULTLIST;
	}

}
