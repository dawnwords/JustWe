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
		return "HoldingRec [��Ʒͳһ����=" + CO_I + ", �����û�ID=" + CU_I + ", ���������="
				+ BU_H + ", ����������=" + SE_H + ", �ɽ�������=" + B_V_H + ", �ɽ�������="
				+ S_V_H + ", ��ƽ����=" + BU_A + ", ��ƽ����=" + SE_A + ", �ֶ�����="
				+ GO_Q + ", ����Ӯ��=" + FL_P + ", ��֤��=" + MAR + ", ���¼�Ӯ��=" + NP_PF
				+ "]";
	}

}
