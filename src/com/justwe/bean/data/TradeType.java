package com.justwe.bean.data;

public enum TradeType {
	NORMAL(1, "正常交易"), SYSTEM_CLOSE_POSITION(2, "代理系统强平"), MARKET_CLOSE_POSITION(
			3, "交易市场强平"), DELEGATE(4, "委托交易"), DEAL_WITHOUT_DELEGATE(5, "无委托成交"), PROTOCOL_CLOSE_POSITION(
			6, "协议平仓");

	private int code;
	private String name;

	private TradeType(int code, String name) {
		this.name = name;
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public static TradeType valueOf(int code) {
		return TradeType.values()[code - 1];
	}
}
