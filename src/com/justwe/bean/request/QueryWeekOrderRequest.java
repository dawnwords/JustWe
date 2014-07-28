package com.justwe.bean.request;

@RequestName(value = "my_weekorder_query")
public class QueryWeekOrderRequest extends QueryMyOrderRequest {

	public QueryWeekOrderRequest(String cOMMODITY_ID, int sTARTNUM, int rECCNT,
			String sORTFLD, int iSDESC, String bUY_SELL, String oRDER_NO,
			long uT) throws Exception {
		super(cOMMODITY_ID, sTARTNUM, rECCNT, sORTFLD, iSDESC, bUY_SELL, oRDER_NO, uT);
	}


}
