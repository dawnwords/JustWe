package com.justwe.network;

import com.justwe.bean.request.ChangePassRequest;
import com.justwe.bean.response.Result;
import com.justwe.bean.session.Session;

public class ChangePassword extends Networker<Result> {
	public void change(String newPass) throws Exception {
		String oldPass = Session.getInstance().getPassword();
		ChangePassRequest request = new ChangePassRequest(oldPass, newPass);
		getResult(request);
	}

	public static void main(String[] args) {
		try {
			String password = Session.getInstance().getPassword();

			new Login().login();
			new ChangePassword().change(password);
			new Logout().logout();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
