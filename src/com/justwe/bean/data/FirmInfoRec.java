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

	public String getFI() {
		return FI;
	}

	public String getFN() {
		return FN;
	}

	public double getIF() {
		return IF;
	}

	public double getCM() {
		return CM;
	}

	public double getCF() {
		return CF;
	}

	public double getRM() {
		return RM;
	}

	public double getRF() {
		return RF;
	}

	public double getOR_F() {
		return OR_F;
	}

	public double getOT_F() {
		return OT_F;
	}

	public double getUF() {
		return UF;
	}

	public double getFEE() {
		return FEE;
	}

	public double getPL() {
		return PL;
	}

	public List<String> getCDLST() {
		return CDLST;
	}

	public double getEQT() {
		return EQT;
	}

	public double getIOF() {
		return IOF;
	}

	public double getHPF() {
		return HPF;
	}

	public double getOC() {
		return OC;
	}

	public double getPGF() {
		return PGF;
	}

	@Override
	public String toString() {
		return "FirmInfoRec [������ID=" + FI + ", ����������=" + FN + ", �ڳ����=" + IF
				+ ", ���ձ�֤��=" + CM + ", ���ո���=" + CF + ", ���ձ�֤��=" + RM
				+ ", ���ո���=" + RF + ", Զ��ί�ж����ʽ�=" + OR_F + ", ���������ʽ�=" + OT_F
				+ ", ��ǰ�����ʽ�=" + UF + ", ����������=" + FEE + ", ����ת��ӯ��=" + PL
				+ ", ���״���=" + CDLST + ", ��ǰȨ��=" + EQT + ", �����=" + IOF
				+ ", ����ӯ��=" + HPF + ", �����仯=" + OC + ", ��Ѻ�ʽ�=" + PGF + "]";
	}
}
