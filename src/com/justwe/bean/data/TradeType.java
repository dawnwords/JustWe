package com.justwe.bean.data;

public enum TradeType {
	NORMAL("正常交易"), SYSTEM_CLOSE_POSITION("代理系统强平"), MARKET_CLOSE_POSITION(
			"交易市场强平"), DELEGATE("委托交易"), DEAL_WITHOUT_DELEGATE("无委托成交"), PROTOCOL_CLOSE_POSITION(
			"协议平仓");

	private String name;

	private TradeType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static TradeType valueOf(int code) {
		return TradeType.values()[code - 1];
	}
}
