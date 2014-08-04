package com.justwe.bean.data;

public class OrderRec {
	private String OR_N;
	private String TIME;
	private int STA;
	private int TYPE;
	private int SE_F;
	private String TR_I;
	private String FI_I;
	private String CU_I;
	private String CO_I;
	private double PRI;
	private int QTY;
	private int BAL;
	private double L_P;
	private String WD_T;
	private int C_F;
	private int B_T_T;
	private int TIMEFLAG;

	@Override
	public String toString() {
		return "OrderRec [委托单号=" + OR_N + ", 下单时间=" + TIME + ", 状态:"
				+ OrderState.valueOf(STA).getName() + ", "
				+ (TYPE == 1 ? "买" : "卖") + ", " + (SE_F == 1 ? "开仓" : "平仓")
				+ ", 交易员ID=" + TR_I + ", 交易商ID=" + FI_I + ", 二级客户代码=" + CU_I
				+ ", 商品统一代码=" + CO_I + ", 委托价格=" + PRI + ", 委托数量=" + QTY
				+ ", 剩余量=" + BAL + ", 指定平仓价=" + L_P + ", 撤单时间=" + WD_T
				+ ", 平仓标志=" + ClosePositionFlag.valuesOf(C_F).getName()
				+ ", 仓单交易类型=" + OrderType.valuesOf(B_T_T).getName() + ", 平仓类型="
				+ ClosePositionType.valuesOf(TIMEFLAG).getName() + "]";
	}

}
