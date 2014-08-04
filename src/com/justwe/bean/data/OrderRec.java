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
		return "OrderRec [ί�е���=" + OR_N + ", �µ�ʱ��=" + TIME + ", ״̬:"
				+ OrderState.valueOf(STA).getName() + ", "
				+ (TYPE == 1 ? "��" : "��") + ", " + (SE_F == 1 ? "����" : "ƽ��")
				+ ", ����ԱID=" + TR_I + ", ������ID=" + FI_I + ", �����ͻ�����=" + CU_I
				+ ", ��Ʒͳһ����=" + CO_I + ", ί�м۸�=" + PRI + ", ί������=" + QTY
				+ ", ʣ����=" + BAL + ", ָ��ƽ�ּ�=" + L_P + ", ����ʱ��=" + WD_T
				+ ", ƽ�ֱ�־=" + ClosePositionFlag.valuesOf(C_F).getName()
				+ ", �ֵ���������=" + OrderType.valuesOf(B_T_T).getName() + ", ƽ������="
				+ ClosePositionType.valuesOf(TIMEFLAG).getName() + "]";
	}

}
