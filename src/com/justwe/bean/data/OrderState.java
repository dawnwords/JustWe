package com.justwe.bean.data;

public enum OrderState {
	DELEGATED(1, "��ί��"), PARTIAL_DEAL(2, "���ֳɽ�"), ALL_DEAL(3, "ȫ���ɽ�"), ALL_CANCEL(
			5, "ȫ������"), DEAL_AFTER_CANCELING(6, "���ֳɽ��󳷵�");

	private int code;
	private String name;

	private OrderState(int code, String name) {
		this.code = code;
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public static OrderState valueOf(int code) {
		return OrderState.values()[code - (code < 4 ? 1 : 2)];
	}
}
