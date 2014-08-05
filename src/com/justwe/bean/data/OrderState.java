package com.justwe.bean.data;

public enum OrderState {
	DELEGATED("已委托"), PARTIAL_DEAL("部分成交"), ALL_DEAL("全部成交"), ALL_CANCEL("全部撤单"), DEAL_AFTER_CANCELING(
			"部分成交后撤单");

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
