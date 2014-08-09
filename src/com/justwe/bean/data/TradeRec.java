package com.justwe.bean.data;

public class TradeRec {
	private String TR_N;
	private String OR_N;
	private String TI;
	private int TY;
	private int SE_F;
	private String TR_I;
	private String FI_I;
	private String CU_I;
	private String CO_I;
	private double PR;
	private int QTY;
	private double O_PR;
	private double LIQPL;
	private double COMM;
	private String S_TR_N;
	private String A_TR_N;
	private int TR_T;
	private int TIMEFLAG;

	public String getTR_N() {
		return TR_N;
	}

	public String getOR_N() {
		return OR_N;
	}

	public String getTI() {
		return TI;
	}

	public int getTY() {
		return TY;
	}

	public int getSE_F() {
		return SE_F;
	}

	public String getTR_I() {
		return TR_I;
	}

	public String getFI_I() {
		return FI_I;
	}

	public String getCU_I() {
		return CU_I;
	}

	public String getCO_I() {
		return CO_I;
	}

	public double getPR() {
		return PR;
	}

	public int getQTY() {
		return QTY;
	}

	public double getO_PR() {
		return O_PR;
	}

	public double getLIQPL() {
		return LIQPL;
	}

	public double getCOMM() {
		return COMM;
	}

	public String getS_TR_N() {
		return S_TR_N;
	}

	public String getA_TR_N() {
		return A_TR_N;
	}

	public int getTR_T() {
		return TR_T;
	}

	public int getTIMEFLAG() {
		return TIMEFLAG;
	}

	@Override
	public String toString() {
		return "TradeRec [�ɽ���=" + TR_N + ", ί�е���=" + OR_N + ", �ɽ�ʱ��=" + TI
				+ ", " + (TY == 1 ? "��" : "��") + ", "
				+ (SE_F == 1 ? "����" : "ƽ��") + ", ����ԱID=" + TR_I + ", ������ID="
				+ FI_I + ", �����ͻ�����=" + CU_I + ", ��Ʒͳһ����=" + CO_I + ", �ɽ��۸�="
				+ PR + ", �ɽ�����=" + QTY + ", ת�ü�=" + O_PR + ", ƽ��ӯ��=" + LIQPL
				+ ", ����������=" + COMM + ", ��ƽ�ֳɽ�����=" + S_TR_N + ", �����г����ϳɽ���="
				+ A_TR_N + ", �ɽ�����=" + TradeType.valueOf(TR_T).getName()
				+ ", ƽ������=" + (TIMEFLAG == 1 ? "ƽ���" : "ƽ��ʷ��") + "]";
	}
}
