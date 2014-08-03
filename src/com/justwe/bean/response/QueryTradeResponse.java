package com.justwe.bean.response;

import java.util.List;

import com.justwe.bean.data.TradeRec;

public class QueryTradeResponse extends ListResponse {

	private List<TradeRec> RESULTLIST;

	public List<TradeRec> getResultList() {
		return RESULTLIST;
	}

}