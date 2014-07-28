package com.justwe.bean.request;

@RequestName(value = "querycommodity")
public class QueryCommodityRequest extends BaseRequest {
	private String COMMODITY_ID;

	public QueryCommodityRequest(String cOMMODITY_ID) throws Exception {
		super();
		COMMODITY_ID = cOMMODITY_ID;
	}

	public QueryCommodityRequest() throws Exception {
		this("");
	}

	@Override
	public String toString() {
		return "QueryCommodityRequest [COMMODITY_ID=" + COMMODITY_ID
				+ ", USER_ID=" + USER_ID + ", SESSION_ID=" + SESSION_ID + "]";
	}

}
