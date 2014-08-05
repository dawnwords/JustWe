package com.justwe.network;

import java.util.List;

import com.justwe.bean.data.CommodityDataRec;
import com.justwe.bean.request.QueryCommodityDataRequest;
import com.justwe.bean.response.QueryCommodityDataResponse;
import com.justwe.util.Log;

public class QueryCommodityData extends Networker<QueryCommodityDataResponse> {
	public List<CommodityDataRec> query(String commodityId) throws Exception {
		return getResult(new QueryCommodityDataRequest(commodityId))
				.getResultList();
	}

	public List<CommodityDataRec> queryAll() throws Exception {
		return getResult(new QueryCommodityDataRequest()).getResultList();
	}
	
	public static void main(String[] args) throws Exception{
		new Login().login();
		Log.i(new QueryCommodityData().queryAll().size());
		new QueryCommodityData().query("99BTI");
		new Logout().logout();
	}
}
