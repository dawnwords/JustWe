package com.justwe.bean.response;

import java.util.List;

import com.justwe.bean.data.BCS;
import com.justwe.bean.data.TDS;

public class QuerySystemTimeResponse extends Result {
    private String CU_T;
    private String CU_D;
    private long TV_U;
    private String L_ID;
    private String CON;
    private List<BCS> BCRS; 
    private String NEW_T;
    private String TD_TTL;
    private List<TDS> TDRP;
    private String DAY;
    
	@Override
	public String toString() {
		return "QuerySystemTimeResponse [CU_T=" + CU_T + ", CU_D=" + CU_D
				+ ", TV_U=" + TV_U + ", L_ID=" + L_ID + ", CON=" + CON
				+ ", BCRS=" + BCRS + ", NEW_T=" + NEW_T + ", TD_TTL=" + TD_TTL
				+ ", TDRP=" + TDRP + ", DAY=" + DAY + ", RETCODE=" + RETCODE
				+ ", MESSAGE=" + MESSAGE + "]";
	}
    
}
