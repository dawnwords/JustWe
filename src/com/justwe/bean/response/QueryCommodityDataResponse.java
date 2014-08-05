package com.justwe.bean.response;

import java.util.List;

import com.justwe.bean.data.CommodityDataRec;

public class QueryCommodityDataResponse extends ListResponse {

	private List<CommodityDataRec> RESULTLIST;

	@Override
	public List<CommodityDataRec> getResultList() {
		return RESULTLIST;
	}

}
