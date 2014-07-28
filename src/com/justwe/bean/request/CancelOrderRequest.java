package com.justwe.bean.request;

@RequestName(value="ordercancel")
public class CancelOrderRequest extends BaseRequest {

	private String ORDER_NO;
	
	public CancelOrderRequest(String oRDER_NO) throws Exception {
		super();
		ORDER_NO = oRDER_NO;
	}

	@Override
	public String toString() {
		return "CancelOrderRequest [ORDER_NO=" + ORDER_NO + ", USER_ID="
				+ USER_ID + ", SESSION_ID=" + SESSION_ID + "]";
	}
	
}
