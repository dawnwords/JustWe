package com.justwe.bean.request;

@RequestName(value = "my_order_query")
public class QueryMyOrderRequest extends QueryHoldingRequest {
	private String BUY_SELL;
	private String ORDER_NO;
	private long UT;
	
	public QueryMyOrderRequest(String cOMMODITY_ID, int sTARTNUM, int rECCNT,
			String sORTFLD, int iSDESC, String bUY_SELL, String oRDER_NO,
			long uT) throws Exception {
		super(cOMMODITY_ID, sTARTNUM, rECCNT, sORTFLD, iSDESC);
		BUY_SELL = bUY_SELL;
		ORDER_NO = oRDER_NO;
		UT = uT;
	}

	@Override
	public String toString() {
		return "QueryMyOrderRequest [" + (BUY_SELL.equals("1") ? "Âò" : "Âô")
				+ ", ORDER_NO=" + ORDER_NO + ", COMMODITY_ID=" + COMMODITY_ID
				+ ", STARTNUM=" + STARTNUM + ", RECCNT=" + RECCNT
				+ ", SORTFLD=" + SORTFLD + ", " + (ISDESC == 0 ? "ÉýÐò" : "½µÐò")
				+ ", UT=" + UT + ", USER_ID=" + USER_ID + ", SESSION_ID="
				+ SESSION_ID + "]";
	}

}
