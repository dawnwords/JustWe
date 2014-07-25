package com.justwe.network;

import com.justwe.bean.request.LoginRequest;
import com.justwe.bean.response.LoginResponse;
import com.justwe.util.Log;

public class Login extends Networker<LoginResponse> {

	public long login(String USER_ID, String PASSWORD) throws Exception {
		LoginRequest login = new LoginRequest(USER_ID, PASSWORD, "");
		LoginResponse response = getResult(login);
		return response.getReturnCode();
	}

	public static void main(String[] args) {
		final String USER_ID = "042957382";
		final String PASSWORD = "111111";
		try {
			Log.i("sessionID = " + new Login().login(USER_ID, PASSWORD));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
