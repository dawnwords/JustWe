package com.justwe.bean.data;

public enum OrderType {
	NORMAL("����ƽ��"), SELL_WARHOUSE("���ֵ�"), EXCESS_TRANSFER("�ֶ�ת��");

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
