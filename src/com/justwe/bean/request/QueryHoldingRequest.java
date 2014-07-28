package com.justwe.bean.request;

@RequestName(value = "holding_query")
public class QueryHoldingRequest extends BaseRequest {
	protected String COMMODITY_ID;
	protected int STARTNUM;
	protected int RECCNT;
	protected String SORTFLD;
	protected int ISDESC;

	public QueryHoldingRequest(String cOMMODITY_ID, int sTARTNUM, int rECCNT,
			String sORTFLD, int iSDESC) throws Exception {
		super();
		COMMODITY_ID = cOMMODITY_ID;
		STARTNUM = sTARTNUM;
		RECCNT = rECCNT;
		SORTFLD = sORTFLD;
		ISDESC = iSDESC;
	}

	@Override
	public String toString() {
		return "QueryHoldingRequest [COMMODITY_ID=" + COMMODITY_ID
				+ ", STARTNUM=" + STARTNUM + ", RECCNT=" + RECCNT
				+ ", SORTFLD=" + SORTFLD + ", "
				+ (ISDESC == 0 ? "ÉýÐò" : "½µÐò") + "]";
	}

}
