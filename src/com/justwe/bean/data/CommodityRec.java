package com.justwe.bean.data;

public class CommodityRec {
	private String MA_I;
	private String CO_I;
	private String CO_N;
	private String L_SET;
	private int STA;
	private String CT_S;
	private double SPREAD;
	private double SP_U;
	private double SP_D;
	private int MA_A;
	private double BMA;
	private double SMA;
	private double BAS;
	private double SAS;
	private double PR_C;
	private int FE_A;
	private double TE_T;
	private double STE_T;
	private double BCHFE;
	private double SCHFE;
	private double BCTFE;
	private double SCTFE;
	private double BCFFE;
	private double SCFFE;
	private int SFE_A;
	private double TM_SET;
	private double STM_SET;
	private String BRDID;
	private int B_T_M;

	@Override
	public String toString() {
		return "CommodityRec [市场代码=" + MA_I + ", 商品ID=" + CO_I + ", 商品名称="
				+ CO_N + ", 交收日期=" + L_SET + ", 商品状态="
				+ CommodityState.valuesOf(STA).getName() + ", 交易单位=" + CT_S
				+ ", 最小变动价位=" + SPREAD + ", 上限=" + SP_U + ", 下限=" + SP_D
				+ ", 保证金算法=" + FeeAlgorithm.valuesOf(MA_A).getName()
				+ ", 买方保证金=" + BMA + ", 卖方保证金=" + SMA + ", 买方担保金=" + BAS
				+ ", 卖方担保金=" + SAS + ", 昨结算=" + PR_C + ", 交易手续费算法="
				+ FeeAlgorithm.valuesOf(FE_A).getName() + ", 买订立交易手续费=" + TE_T
				+ ", 卖订立交易手续费=" + STE_T + ", 买转让历史订货交易手续费=" + BCHFE
				+ ", 卖转让历史订货交易手续费=" + SCHFE + ", 买转让今订货交易手续费=" + BCTFE
				+ ", 卖转让今订货交易手续费=" + SCTFE + ", 买强制转让交易手续费=" + BCFFE
				+ ", 卖强制转让交易手续费=" + SCFFE + ", 交收手续费算法="
				+ FeeAlgorithm.valuesOf(SFE_A).getName() + ", 交收买手续费=" + TM_SET
				+ ", 交收卖手续费=" + STM_SET + ", 所属品种ID=" + BRDID + ", 所属品种交易模式="
				+ TradePattern.valuesOf(B_T_M).getName() + "]";
	}

}
