package com.justwe.bean.data;

public enum OrderType {
	NORMAL("正常平仓"), SELL_WARHOUSE("卖仓单"), EXCESS_TRANSFER("抵顶转让");

	private String name;

	private OrderType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static OrderType valuesOf(int code) {
		return OrderType.values()[code];
	}
}
