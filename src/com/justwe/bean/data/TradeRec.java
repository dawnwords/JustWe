package com.justwe.bean.data;

public class TradeRec {
	private String TR_N;
	private String OR_N;
	private String TI;
	private int TY;
	private int SE_F;
	private String TR_I;
	private String FI_I;
	private String CU_I;
	private String CO_I;
	private double PR;
	private int QTY;
	private double O_PR;
	private double LIQPL;
	private double COMM;
	private String S_TR_N;
	private String A_TR_N;
	private int TR_T;
	private int TIMEFLAG;

	@Override
	public String toString() {
		return "TradeRec [成交号=" + TR_N + ", 委托单号=" + OR_N + ", 成交时间=" + TI
				+ ", " + (TY == 1 ? "买" : "卖") + ", "
				+ (SE_F == 1 ? "开仓" : "平仓") + ", 交易员ID=" + TR_I + ", 交易商ID="
				+ FI_I + ", 二级客户代码=" + CU_I + ", 商品统一代码=" + CO_I + ", 成交价格="
				+ PR + ", 成交数量=" + QTY + ", 转让价=" + O_PR + ", 平仓盈亏=" + LIQPL
				+ ", 交易手续费=" + COMM + ", 被平仓成交单号=" + S_TR_N + ", 交易市场或撮合成交号="
				+ A_TR_N + ", 成交类型=" + TradeType.valueOf(TR_T).getName()
				+ ", 平仓类型=" + (TIMEFLAG == 1 ? "平今仓" : "平历史仓") + "]";
	}
}
