package com.justwe.network;

import com.justwe.bean.request.LoginRequest;
import com.justwe.bean.response.LoginResponse;
import com.justwe.bean.session.Session;
import com.justwe.util.Log;

public class Login extends Networker<LoginResponse> {

	public void login() throws Exception {
		LoginResponse response = getResult(new LoginRequest());
		Session.getInstance().setSessionId(response.getReturnCode());
	}

	public static void main(String[] args) {
		try {
			new Login().login();
			Log.i("sessionID = " + Session.getInstance().getSessionId());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
