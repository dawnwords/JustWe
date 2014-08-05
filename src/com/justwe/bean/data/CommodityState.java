package com.justwe.bean.data;

public enum CommodityState {
	CURRENTLY_VALID("��ǰ��Ч��¼"), HISTORICAL_RECORD("�Ѿ���������ʷ��Ʒ"), PAUSE("��ͣ����");

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
