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
		return "CommodityDataRec [��Ʒͳһ����=" + CO_I + ", Ʒ��=" + CO_N + ", ��������="
				+ L_SET + ", �����=" + PR_C + ", ������=" + BID + ", �����۵�����="
				+ BI_D + ", �������=" + OFFER + ", ������۵�����=" + OF_D + ", ���="
				+ HIGH + ", ���=" + LOW + ", ����=" + LAST + ", ƽ��=" + AVG
				+ ", �ǵ�=" + CHA + ", �ܳɽ���=" + VO_T + ", ������=" + TT_O + "]";
	}

}
