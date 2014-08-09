package com.justwe.network;

import java.util.List;

import com.justwe.bean.data.CommodityRec;
import com.justwe.bean.request.QueryCommodityRequest;
import com.justwe.bean.response.QueryCommodityResponse;

public class QueryCommodity extends Networker<QueryCommodityResponse> {
	public List<CommodityRec> query(String commodityId) throws Exception {
		return getResult(new QueryCommodityRequest(commodityId))
				.getResultList();
	}

	public List<CommodityRec> queryAll() throws Exception {
		return getResult(new QueryCommodityRequest()).getResultList();
	}
	
	public static void main(String[] args) throws Exception{
		new Login().login();
		new QueryCommodity().queryAll();
		new Logout().logout();
	}
}
