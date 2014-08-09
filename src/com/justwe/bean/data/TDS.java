package com.justwe.bean.data;

public class TDS {
	private String OR_N;
	private String CO_I;
	private int TDQTY;

	public String getOR_N() {
		return OR_N;
	}

	public String getCO_I() {
		return CO_I;
	}

	public int getTDQTY() {
		return TDQTY;
	}

	@Override
	public String toString() {
		return "TDS [委托单号=" + OR_N + ", 商品统一代码=" + CO_I + ", 当前成交数量=" + TDQTY
				+ "]";
	}

}
