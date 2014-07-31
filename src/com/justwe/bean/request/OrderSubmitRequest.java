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

	private OrderSubmitRequest(String cUSTOMER_ID, String cOMMODITY_ID,
			int qTY, double pRICE, int bUY_SELL, int sETTLE_BASIS,
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

	private OrderSubmitRequest(String cUSTOMER_ID, String cOMMODITY_ID,
			int qTY, double pRICE, int bUY_SELL, int sETTLE_BASIS)
			throws Exception {
		this(cUSTOMER_ID, cOMMODITY_ID, qTY, pRICE, bUY_SELL, sETTLE_BASIS, 1,
				2);
	}

	public static OrderSubmitRequest buyOpenPosition(String cUSTOMER_ID,
			String cOMMODITY_ID, int qTY, double pRICE) throws Exception {
		return new OrderSubmitRequest(cUSTOMER_ID, cOMMODITY_ID, qTY, pRICE, 1,
				1);
	}

	public static OrderSubmitRequest sellOpenPosition(String cUSTOMER_ID,
			String cOMMODITY_ID, int qTY, double pRICE) throws Exception {
		return new OrderSubmitRequest(cUSTOMER_ID, cOMMODITY_ID, qTY, pRICE, 2,
				1);
	}

	public static OrderSubmitRequest buyClosePosition(String cUSTOMER_ID,
			String cOMMODITY_ID, int qTY, double pRICE) throws Exception {
		return new OrderSubmitRequest(cUSTOMER_ID, cOMMODITY_ID, qTY, pRICE, 1,
				2);
	}

	public static OrderSubmitRequest sellClosePosition(String cUSTOMER_ID,
			String cOMMODITY_ID, int qTY, double pRICE) throws Exception {
		return new OrderSubmitRequest(cUSTOMER_ID, cOMMODITY_ID, qTY, pRICE, 2,
				2);
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
