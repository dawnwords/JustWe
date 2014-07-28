package com.justwe.bean.request;

@RequestName(value = "querytrade")
public class QueryTradeRequest extends BaseRequest {

	private String LAST_TRADE_ID;

	public QueryTradeRequest(String lAST_TRADE_ID) throws Exception {
		super();
		LAST_TRADE_ID = lAST_TRADE_ID;
	}

	public QueryTradeRequest() throws Exception {
		this("");
	}

	@Override
	public String toString() {
		return "QueryTradeRequest [LAST_TRADE_ID=" + LAST_TRADE_ID
				+ ", USER_ID=" + USER_ID + ", SESSION_ID=" + SESSION_ID + "]";
	}
	
}
