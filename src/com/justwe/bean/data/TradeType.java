package com.justwe.bean.data;

public enum TradeType {
	NORMAL("��������"), SYSTEM_CLOSE_POSITION("����ϵͳǿƽ"), MARKET_CLOSE_POSITION(
			"�����г�ǿƽ"), DELEGATE("ί�н���"), DEAL_WITHOUT_DELEGATE("��ί�гɽ�"), PROTOCOL_CLOSE_POSITION(
			"Э��ƽ��");

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
