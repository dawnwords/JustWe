package com.justwe.bean.data;

public enum ClosePositionFlag {
	NORMAL("正常平仓"), TRANSFER_ON_BEHALF("代为转让"), FORCE_TRANSFER("强制转让");

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
