package com.justwe.network;

import com.justwe.bean.request.LogoutRequest;
import com.justwe.bean.response.Result;
import com.justwe.util.Log;

public class Logout extends Networker<Result> {
	public void logout(String USER_ID, long SESSION_ID) throws Exception {
		LogoutRequest logout = new LogoutRequest(USER_ID, SESSION_ID);
		getResult(logout);
	}

	public static void main(String[] args) {
		final String USER_ID = "042957382";
		final String PASSWORD = "111111";
		try {
			long sessionId = new Login().login(USER_ID, PASSWORD);
			Log.i("sessionID = " + sessionId);
			new Logout().logout(USER_ID, sessionId);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
