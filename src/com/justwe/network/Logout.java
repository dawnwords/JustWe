package com.justwe.network;

import com.justwe.bean.request.LogoutRequest;
import com.justwe.bean.response.Result;
import com.justwe.bean.session.Session;

public class Logout extends Networker<Result> {
	public void logout() throws Exception {
		getResult(new LogoutRequest());
		Session.getInstance().clearSessionId();
	}

	public static void main(String[] args) {
		try {
			new Login().login();
			new Logout().logout();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
