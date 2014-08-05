package com.justwe.bean.data;

public enum CommodityState {
	CURRENTLY_VALID("当前有效记录"), HISTORICAL_RECORD("已经结束的历史商品"), PAUSE("暂停交易");

	private String name;

	private CommodityState(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public static CommodityState valuesOf(int code) {
		return CommodityState.values()[code];
	}
}
