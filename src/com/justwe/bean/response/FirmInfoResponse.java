package com.justwe.bean.response;

import java.util.List;

import com.justwe.bean.data.FirmInfoRec;

public class FirmInfoResponse extends ListResponse {

	private List<FirmInfoRec> RESULTLIST;

	public List<FirmInfoRec> getResultList() {
		return RESULTLIST;
	}

}
