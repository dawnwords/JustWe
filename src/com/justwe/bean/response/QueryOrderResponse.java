package com.justwe.bean.response;

import java.util.List;

import com.justwe.bean.data.OrderRec;

public class QueryOrderResponse extends ListResponse {
	private long UT;
	private List<OrderRec> RESULTLIST;

	@Override
	public List<OrderRec> getResultList() {
		return RESULTLIST;
	}

	@Override
	public String toString() {
		return super.toString().replace("]", ", UT=" + UT + "]");
	}
}
