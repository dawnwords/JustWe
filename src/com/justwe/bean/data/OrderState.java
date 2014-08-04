package com.justwe.bean.data;

public enum OrderState {
	DELEGATED(1, "已委托"), PARTIAL_DEAL(2, "部分成交"), ALL_DEAL(3, "全部成交"), ALL_CANCEL(
			5, "全部撤单"), DEAL_AFTER_CANCELING(6, "部分成交后撤单");

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
