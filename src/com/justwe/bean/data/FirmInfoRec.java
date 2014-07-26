package com.justwe.bean.data;

import java.util.List;

public class FirmInfoRec {
	private String FI;
	private String FN;
	private double IF;
	private double CM;
	private double CF;
	private double RM;
	private double RF;
	private double OR_F;
	private double OT_F;
	private double UF;
	private double FEE;
	private double PL;
	private List<String> CDLST;
	private double EQT;
	private double IOF;
	private double HPF;
	private double OC;
	private double PGF;

	@Override
	public String toString() {
		return "FirmInfoRec [交易商ID=" + FI + ", 交易商名称=" + FN + ", 期初余额=" + IF
				+ ", 上日保证金=" + CM + ", 上日浮亏=" + CF + ", 当日保证金=" + RM
				+ ", 当日浮亏=" + RF + ", 远期委托冻结资金=" + OR_F + ", 其它冻结资金=" + OT_F
				+ ", 当前可用资金=" + UF + ", 当日手续费=" + FEE + ", 当日转让盈亏=" + PL
				+ ", 交易代码=" + CDLST + ", 当前权益=" + EQT + ", 出入金=" + IOF
				+ ", 订货盈亏=" + HPF + ", 其它变化=" + OC + ", 质押资金=" + PGF + "]";
	}
}
