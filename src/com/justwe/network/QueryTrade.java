package com.justwe.network;

import java.util.List;

import com.justwe.bean.data.TradeRec;
import com.justwe.bean.request.QueryTradeRequest;
import com.justwe.bean.response.QueryTradeResponse;
import com.justwe.util.Log;

public class QueryTrade extends Networker<QueryTradeResponse> {
	public List<TradeRec> query() throws Exception{
		return getResult(new QueryTradeRequest()).getResultList();
	}
	
	public static void main(String[] args) throws Exception{
		new Login().login();
		Log.i(new QueryTrade().query());
		new Logout().logout();
	}
}
