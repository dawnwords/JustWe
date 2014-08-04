package com.justwe.bean.data;

public enum ClosePositionType {
	NO_SPECIFIED_POSITION("不指定平仓"), TAKE_POSITION_OF_TODAY("平今仓"), TAKE_POSITION_OF_HISTORY(
			"平历史仓");

	private String name;

	private ClosePositionType(String name) {
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public static ClosePositionType valuesOf(int code) {
		return ClosePositionType.values()[code];
	}
}
