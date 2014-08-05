package com.justwe.bean.data;

public enum FeeAlgorithm {
	PERCENTAGE("按百分比"), VOLUME("按交易数量");

	private String name;

	private FeeAlgorithm(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static FeeAlgorithm valuesOf(int code) {
		return values()[code - 1];
	}
}
