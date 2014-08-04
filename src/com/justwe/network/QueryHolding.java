package com.justwe.network;

import java.util.List;

import com.justwe.bean.data.HoldingRec;
import com.justwe.bean.request.QueryHoldingRequest;
import com.justwe.bean.response.QueryHoldingResponse;

public class QueryHolding extends Networker<QueryHoldingResponse> {
	public List<HoldingRec> queryHoldingDesc(String commodityId, int startNo,
			int resultCount, String sortField) throws Exception {
		return getResult(
				new QueryHoldingRequest(commodityId, startNo, resultCount,
						sortField, 1)).getResultList();
	}

	public List<HoldingRec> queryHoldingAsc(String commodityId, int startNo,
			int resultCount, String sortField) throws Exception {
		return getResult(
				new QueryHoldingRequest(commodityId, startNo, resultCount,
						sortField, 0)).getResultList();
	}
}
