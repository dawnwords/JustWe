package com.justwe.bean.response;

import java.util.List;

import com.justwe.bean.data.HoldingRec;

public class QueryHoldingResponse extends ListResponse {

	private List<HoldingRec> RESULTLIST;

	@Override
	public List<HoldingRec> getResultList() {
		return RESULTLIST;
	}

}
