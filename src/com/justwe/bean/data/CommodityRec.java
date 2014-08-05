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
		return "CommodityRec [�г�����=" + MA_I + ", ��ƷID=" + CO_I + ", ��Ʒ����="
				+ CO_N + ", ��������=" + L_SET + ", ��Ʒ״̬="
				+ CommodityState.valuesOf(STA).getName() + ", ���׵�λ=" + CT_S
				+ ", ��С�䶯��λ=" + SPREAD + ", ����=" + SP_U + ", ����=" + SP_D
				+ ", ��֤���㷨=" + FeeAlgorithm.valuesOf(MA_A).getName()
				+ ", �򷽱�֤��=" + BMA + ", ������֤��=" + SMA + ", �򷽵�����=" + BAS
				+ ", ����������=" + SAS + ", �����=" + PR_C + ", �����������㷨="
				+ FeeAlgorithm.valuesOf(FE_A).getName() + ", ��������������=" + TE_T
				+ ", ����������������=" + STE_T + ", ��ת����ʷ��������������=" + BCHFE
				+ ", ��ת����ʷ��������������=" + SCHFE + ", ��ת�ý񶩻�����������=" + BCTFE
				+ ", ��ת�ý񶩻�����������=" + SCTFE + ", ��ǿ��ת�ý���������=" + BCFFE
				+ ", ��ǿ��ת�ý���������=" + SCFFE + ", �����������㷨="
				+ FeeAlgorithm.valuesOf(SFE_A).getName() + ", ������������=" + TM_SET
				+ ", ������������=" + STM_SET + ", ����Ʒ��ID=" + BRDID + ", ����Ʒ�ֽ���ģʽ="
				+ TradePattern.valuesOf(B_T_M).getName() + "]";
	}

}
