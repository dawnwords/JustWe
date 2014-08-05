package com.justwe.bean.data;

public class CommodityDataRec {
	private String CO_I;
	private String CO_N;
	private String L_SET;
	private double PR_C;
	private double BID;
	private int BI_D;
	private double OFFER;
	private int OF_D;
	private double HIGH;
	private double LOW;
	private double LAST;
	private double AVG;
	private double CHA;
	private int VO_T;
	private int TT_O;

	@Override
	public String toString() {
		return "CommodityDataRec [商品统一代码=" + CO_I + ", 品名=" + CO_N + ", 交收日期="
				+ L_SET + ", 昨结算=" + PR_C + ", 最高买价=" + BID + ", 最高买价的买量="
				+ BI_D + ", 最低卖价=" + OFFER + ", 最低卖价的卖量=" + OF_D + ", 最高="
				+ HIGH + ", 最低=" + LOW + ", 最新=" + LAST + ", 平均=" + AVG
				+ ", 涨跌=" + CHA + ", 总成交量=" + VO_T + ", 订货量=" + TT_O + "]";
	}

}
