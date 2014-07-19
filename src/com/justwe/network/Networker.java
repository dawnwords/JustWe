package com.justwe.network;

import java.io.*;
import java.lang.reflect.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;

import com.justwe.bean.request.LoginRequest;
import com.justwe.bean.request.Request;
import com.justwe.bean.request.RequestName;
import com.justwe.bean.response.LoginResponse;
import com.justwe.bean.response.Result;
import com.justwe.bean.response.Response;
import com.justwe.util.XMLUtil;
import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

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
			writer.write(XMLUtil.getRequestXML(getRequestName(),
					getRequestContent()));
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

	private P getResponseFromXML(String responseString) {
		System.out.println(responseString);
		ParameterizedType genericSuperclass = (ParameterizedType) getClass()
				.getGenericSuperclass();
		Class<P> clazz = (Class<P>) genericSuperclass.getActualTypeArguments()[1];
		return XMLUtil.parseXML(responseString, clazz);
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
		new Networker<LoginRequest, Result>() {
			@Override
			protected void onResponse(Result response) {

			}

			@Override
			protected void onError(String error) {

			}
		}.execute(new LoginRequest("042957382", "111111", ""));
	}

	private String getURL() {
		return "http://60.28.133.148:16955/tradeweb/mobileServlet";
	}
}
