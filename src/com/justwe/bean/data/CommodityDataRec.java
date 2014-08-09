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
		return "CommodityDataRec [��Ʒͳһ����=" + CO_I + ", Ʒ��=" + CO_N + ", ��������="
				+ L_SET + ", �����=" + PR_C + ", ������=" + BID + ", �����۵�����="
				+ BI_D + ", �������=" + OFFER + ", ������۵�����=" + OF_D + ", ���="
				+ HIGH + ", ���=" + LOW + ", ����=" + LAST + ", ƽ��=" + AVG
				+ ", �ǵ�=" + CHA + ", �ܳɽ���=" + VO_T + ", ������=" + TT_O + "]";
	}

}
