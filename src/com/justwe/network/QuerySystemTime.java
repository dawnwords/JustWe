package com.justwe.network;

import com.justwe.bean.request.QuerySystemTimeRequest;
import com.justwe.bean.response.QuerySystemTimeResponse;

public class QuerySystemTime extends Networker<QuerySystemTimeResponse> {
	public QuerySystemTimeResponse query(int tradeCount) throws Exception {
		return getResult(new QuerySystemTimeRequest(tradeCount));
	}
	
	public static void main(String[] args) throws Exception {
		new Login().login();
		new QuerySystemTime().query(5);
		new Logout().logout();
	}
}
