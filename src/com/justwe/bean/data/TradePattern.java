package com.justwe.bean.data;

public enum TradePattern {
	NORMAL("标准"), BUY_SESSION("买专场"), SELL_SESSION("卖专场");

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
