package com.justwe.bean.data;

public enum FeeAlgorithm {
	PERCENTAGE("���ٷֱ�"), VOLUME("����������");

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
