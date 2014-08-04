package com.justwe.bean.data;

public enum ClosePositionFlag {
	NORMAL("����ƽ��"), TRANSFER_ON_BEHALF("��Ϊת��"), FORCE_TRANSFER("ǿ��ת��");

	private String name;

	private ClosePositionFlag(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static ClosePositionFlag valuesOf(int code) {
		return ClosePositionFlag.values()[code];
	}
}
