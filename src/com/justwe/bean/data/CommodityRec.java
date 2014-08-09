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

	public String getMA_I() {
		return MA_I;
	}

	public String getCO_I() {
		return CO_I;
	}

	public String getCO_N() {
		return CO_N;
	}

	public String getL_SET() {
		return L_SET;
	}

	public int getSTA() {
		return STA;
	}

	public String getCT_S() {
		return CT_S;
	}

	public double getSPREAD() {
		return SPREAD;
	}

	public double getSP_U() {
		return SP_U;
	}

	public double getSP_D() {
		return SP_D;
	}

	public int getMA_A() {
		return MA_A;
	}

	public double getBMA() {
		return BMA;
	}

	public double getSMA() {
		return SMA;
	}

	public double getBAS() {
		return BAS;
	}

	public double getSAS() {
		return SAS;
	}

	public double getPR_C() {
		return PR_C;
	}

	public int getFE_A() {
		return FE_A;
	}

	public double getTE_T() {
		return TE_T;
	}

	public double getSTE_T() {
		return STE_T;
	}

	public double getBCHFE() {
		return BCHFE;
	}

	public double getSCHFE() {
		return SCHFE;
	}

	public double getBCTFE() {
		return BCTFE;
	}

	public double getSCTFE() {
		return SCTFE;
	}

	public double getBCFFE() {
		return BCFFE;
	}

	public double getSCFFE() {
		return SCFFE;
	}

	public int getSFE_A() {
		return SFE_A;
	}

	public double getTM_SET() {
		return TM_SET;
	}

	public double getSTM_SET() {
		return STM_SET;
	}

	public String getBRDID() {
		return BRDID;
	}

	public int getB_T_M() {
		return B_T_M;
	}

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
