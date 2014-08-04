package com.justwe.bean.data;

public enum ClosePositionType {
	NO_SPECIFIED_POSITION("��ָ��ƽ��"), TAKE_POSITION_OF_TODAY("ƽ���"), TAKE_POSITION_OF_HISTORY(
			"ƽ��ʷ��");

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
