package com.justwe.bean.data;

public enum TradePattern {
	NORMAL("��׼"), BUY_SESSION("��ר��"), SELL_SESSION("��ר��");

	private String name;

	private TradePattern(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static TradePattern valuesOf(int code) {
		return values()[code];
	}
}
