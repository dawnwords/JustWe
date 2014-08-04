package com.justwe.bean.data;

public class HoldingRec {
	private String CO_I;
	private String CU_I;
	private int BU_H;
	private int SE_H;
	private int B_V_H;
	private int S_V_H;
	private double BU_A;
	private double SE_A;
	private int GO_Q;
	private double FL_P;
	private double MAR;
	private double NP_PF;

	@Override
	public String toString() {
		return "HoldingRec [商品统一代码=" + CO_I + ", 交易用户ID=" + CU_I + ", 买进订货量="
				+ BU_H + ", 卖出订货量=" + SE_H + ", 可交收买量=" + B_V_H + ", 可交收卖量="
				+ S_V_H + ", 买平均价=" + BU_A + ", 卖平均价=" + SE_A + ", 抵顶数量="
				+ GO_Q + ", 浮动赢亏=" + FL_P + ", 保证金=" + MAR + ", 最新价赢亏=" + NP_PF
				+ "]";
	}

}
