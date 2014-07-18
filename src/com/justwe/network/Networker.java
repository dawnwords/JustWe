package com.justwe.network;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;

import com.justwe.bean.request.LoginRequest;
import com.justwe.bean.request.Request;
import com.justwe.bean.request.RequestName;
import com.justwe.bean.response.LoginResponse;
import com.justwe.bean.response.Response;

public abstract class Networker<Q extends Request, P extends Response> extends
		Thread {
	private Q request;

	public void execute(Q request) {
		this.request = request;
		start();
	}

	@Override
	public void run() {
		HttpURLConnection conn = getHTTPConnection();
		if (conn == null) {
			return;
		}

		PrintWriter writer = null;
		BufferedReader reader = null;
		try {
			writer = new PrintWriter(conn.getOutputStream());
			writer.write(getRequestXML());
			writer.flush();
			reader = new BufferedReader(new InputStreamReader(
					conn.getInputStream()));
			String response = "";
			String line;
			while ((line = reader.readLine()) != null) {
				response += line;
			}
			onResponse(getResponseFromXML(response));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(reader);
			close(writer);
		}
	}

	private P getResponseFromXML(String response) {
		System.out.println(response);
		return null;
	}

	private void close(Closeable closeable) {
		if (closeable != null) {
			try {
				closeable.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private String getRequestXML() throws Exception {
		final String requestName = ":requestname:";
		final String reqeustContent = ":content:";
		final String requestTemplate = "<?xml version='1.0' encoding = 'GB2312'?><MEBS_MOBILE>"
				+ "<REQ name='"
				+ requestName
				+ "'>"
				+ reqeustContent
				+ "</REQ></MEBS_MOBILE>";
		return requestTemplate.replaceFirst(requestName, getRequestName())
				.replaceFirst(reqeustContent, getRequestContent());
	}

	private String getRequestName() {
		return request.getClass().getAnnotation(RequestName.class).value();
	}

	private String getRequestContent() throws Exception {
		String result = "";
		for (Field field : request.getClass().getDeclaredFields()) {
			String fieldName = field.getName();
			field.setAccessible(true);
			result += "<" + fieldName + ">" + field.get(request) + "</"
					+ fieldName + ">";
		}
		return result;
	}

	private HttpURLConnection getHTTPConnection() {
		HttpURLConnection conn = null;
		try {
			URL url = new URL(getURL());
			conn = (HttpURLConnection) url.openConnection();
			conn.setDoInput(true);
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setUseCaches(false);
			conn.setInstanceFollowRedirects(true);
			conn.setRequestProperty(" Content-Type ",
					" application/x-www-form-urlencoded ");
			conn.connect();
		} catch (Exception e) {
			e.printStackTrace();
			onError("network Error");
		}
		return conn;
	}

	protected abstract void onResponse(P response);

	protected abstract void onError(String error);

	public static void main(String[] args) {
		new Networker<LoginRequest, LoginResponse>() {
			@Override
			protected void onResponse(LoginResponse response) {

			}

			@Override
			protected void onError(String error) {

			}
		}.execute(new LoginRequest("", "", ""));
	}

	private String getURL() {
		return "http://60.28.133.148:16955/tradeweb/mobileServlet";
	}
}
