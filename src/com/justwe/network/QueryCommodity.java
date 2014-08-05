package com.justwe.network;

import java.util.List;

import com.justwe.bean.data.CommodityRec;
import com.justwe.bean.request.QueryCommodityRequest;
import com.justwe.bean.response.QueryCommodityResponse;
import com.justwe.util.Log;

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
		Log.i(new QueryCommodity().queryAll().size());
		Log.i(new QueryCommodity().query("B40017"));
		new Logout().logout();
	}
}
