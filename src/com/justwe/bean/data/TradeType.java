package com.justwe.bean.data;

public enum TradeType {
	NORMAL(1, "��������"), SYSTEM_CLOSE_POSITION(2, "����ϵͳǿƽ"), MARKET_CLOSE_POSITION(
			3, "�����г�ǿƽ"), DELEGATE(4, "ί�н���"), DEAL_WITHOUT_DELEGATE(5, "��ί�гɽ�"), PROTOCOL_CLOSE_POSITION(
			6, "Э��ƽ��");

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
