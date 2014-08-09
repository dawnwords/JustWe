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

	public String getCO_I() {
		return CO_I;
	}

	public String getCO_N() {
		return CO_N;
	}

	public String getL_SET() {
		return L_SET;
	}

	public double getPR_C() {
		return PR_C;
	}

	public double getBID() {
		return BID;
	}

	public int getBI_D() {
		return BI_D;
	}

	public double getOFFER() {
		return OFFER;
	}

	public int getOF_D() {
		return OF_D;
	}

	public double getHIGH() {
		return HIGH;
	}

	public double getLOW() {
		return LOW;
	}

	public double getLAST() {
		return LAST;
	}

	public double getAVG() {
		return AVG;
	}

	public double getCHA() {
		return CHA;
	}

	public int getVO_T() {
		return VO_T;
	}

	public int getTT_O() {
		return TT_O;
	}

	@Override
	public String toString() {
		return "CommodityDataRec [商品统一代码=" + CO_I + ", 品名=" + CO_N + ", 交收日期="
				+ L_SET + ", 昨结算=" + PR_C + ", 最高买价=" + BID + ", 最高买价的买量="
				+ BI_D + ", 最低卖价=" + OFFER + ", 最低卖价的卖量=" + OF_D + ", 最高="
				+ HIGH + ", 最低=" + LOW + ", 最新=" + LAST + ", 平均=" + AVG
				+ ", 涨跌=" + CHA + ", 总成交量=" + VO_T + ", 订货量=" + TT_O + "]";
	}

}
