package com.justwe.bean.data;

public enum OrderState {
	DELEGATED("��ί��"), PARTIAL_DEAL("���ֳɽ�"), ALL_DEAL("ȫ���ɽ�"), ALL_CANCEL("ȫ������"), DEAL_AFTER_CANCELING(
			"���ֳɽ��󳷵�");

	private String name;

	private OrderState(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static OrderState valueOf(int code) {
		return OrderState.values()[code - (code < 4 ? 1 : 2)];
	}
}
