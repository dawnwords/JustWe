package com.justwe.network;

import com.justwe.bean.request.LoginRequest;
import com.justwe.bean.response.LoginResponse;

public class Login extends Networker<LoginRequest, LoginResponse> {

	@Override
	public void onResponse(LoginResponse response) {
		System.out.println(response);
	}

	@Override
	public void onError(String error) {
		System.out.println(error);
	}

	public static void main(String[] args) {
		new Login().execute(new LoginRequest("042957382", "111111", ""));
	}
}
