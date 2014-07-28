package com.justwe.bean.request;

@RequestName(value = "commodity_data_query")
public class QueryCommodityDataRequest extends QueryCommodityRequest {

	public QueryCommodityDataRequest(String cOMMODITY_ID) throws Exception {
		super(cOMMODITY_ID);
	}

	public QueryCommodityDataRequest() throws Exception {
		super();
	}

}
