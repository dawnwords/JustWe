package com.justwe.bean.response;

import java.util.List;

import com.justwe.bean.data.CommodityRec;

public class QueryCommodityResponse extends ListResponse {

	private List<CommodityRec> RESULTLIST;

	@Override
	public List<CommodityRec> getResultList() {
		return RESULTLIST;
	}

}
