package com.justwe.bean.request;

@RequestName(value = "change_password")
public class ChangePassRequest extends BaseRequest {
	private String OLD_PASSWORD;
	private String NEW_PASSWORD;

	public ChangePassRequest(String oLD_PASSWORD, String nEW_PASSWORD)
			throws Exception {
		super();
		OLD_PASSWORD = oLD_PASSWORD;
		NEW_PASSWORD = nEW_PASSWORD;
	}

	@Override
	public String toString() {
		return "ChangePassRequest [USER_ID=" + USER_ID + ", OLD_PASSWORD="
				+ OLD_PASSWORD + ", NEW_PASSWORD=" + NEW_PASSWORD
				+ ", SESSION_ID=" + SESSION_ID + "]";
	}

}
