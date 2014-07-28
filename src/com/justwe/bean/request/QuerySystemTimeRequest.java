package com.justwe.bean.request;

@RequestName(value = "sys_time_query")
public class QuerySystemTimeRequest extends BaseRequest {
	private String LAST_ID;
	private int TD_CNT;
	private int CU_LG;

	public QuerySystemTimeRequest(String lAST_ID, int tD_CNT, int cU_LG)
			throws Exception {
		super();
		LAST_ID = lAST_ID;
		TD_CNT = tD_CNT;
		CU_LG = cU_LG;
	}

	public QuerySystemTimeRequest(int tD_CNT, int cU_LG) throws Exception {
		this("", tD_CNT, cU_LG);
	}

	@Override
	public String toString() {
		return "QuerySystemTimeRequest [LAST_ID=" + LAST_ID + ", TD_CNT="
				+ TD_CNT + ", CU_LG=" + CU_LG + ", USER_ID=" + USER_ID
				+ ", SESSION_ID=" + SESSION_ID + "]";
	}

}
