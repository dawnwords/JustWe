package com.justwe.bean.request;

@RequestName(value = "ordersubmit")
public class OrderSubmitRequest extends BaseRequest {

	private String CUSTOMER_ID;
	private int BUY_SELL;
	private String COMMODITY_ID;
	private double PRICE;
	private int QTY;
	private int SETTLE_BASIS;
	private int CLOSEMODE;
	private int TIMEFLAG;

	public OrderSubmitRequest(String cUSTOMER_ID, int bUY_SELL,
			String cOMMODITY_ID, double pRICE, int qTY, int sETTLE_BASIS,
			int cLOSEMODE, int tIMEFLAG) throws Exception {
		super();
		CUSTOMER_ID = cUSTOMER_ID;
		BUY_SELL = bUY_SELL;
		COMMODITY_ID = cOMMODITY_ID;
		PRICE = pRICE;
		QTY = qTY;
		SETTLE_BASIS = sETTLE_BASIS;
		CLOSEMODE = cLOSEMODE;
		TIMEFLAG = tIMEFLAG;
	}

	@Override
	public String toString() {
		return "OrderSubmitRequest [CUSTOMER_ID=" + CUSTOMER_ID + ", "
				+ (BUY_SELL == 1 ? "买" : "卖") + ", COMMODITY_ID="
				+ COMMODITY_ID + ", PRICE=" + PRICE + ", QTY=" + QTY
				+ ", SETTLE_BASIS=" + (SETTLE_BASIS == 1 ? "开仓" : "平仓")
				+ ", CLOSEMODE=" + (CLOSEMODE == 1 ? "不指定平仓" : "指定时间平仓")
				+ ", TIMEFLAG=" + (TIMEFLAG == 1 ? "平今仓" : "平历史仓")
				+ ", USER_ID=" + USER_ID + ", SESSION_ID=" + SESSION_ID + "]";
	}

}
