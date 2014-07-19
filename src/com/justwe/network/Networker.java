package com.justwe.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.net.HttpURLConnection;
import java.net.URL;

import com.justwe.bean.request.*;
import com.justwe.bean.response.*;

import com.justwe.util.IOUtil;
import com.justwe.util.ReflectUtil;
import com.justwe.util.XMLUtil;

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
			processResponse(getResponseFromXML(response));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			IOUtil.close(reader);
			IOUtil.close(writer);
		}
	}

	private void processResponse(P response) {
		if (response.getReturnCode() < 0) {
			onError(response.getMessage());
		} else {
			onResponse(response);
		}
	}

	private String getURL() {
		return "http://60.28.133.148:16955/tradeweb/mobileServlet";
	}

	@SuppressWarnings("unchecked")
	private P getResponseFromXML(String responseString) throws Exception {
		System.out.println(responseString);
		ParameterizedType genericSuperclass = (ParameterizedType) getClass()
				.getGenericSuperclass();
		return XMLUtil.parseXML(responseString,
				(Class<P>) genericSuperclass.getActualTypeArguments()[1]);
	}

	private String getRequestName() {
		return request.getClass().getAnnotation(RequestName.class).value();
	}

	private String getRequestContent() throws Exception {
		String result = "";
		for (Field field : request.getClass().getDeclaredFields()) {
			String fieldName = field.getName();
			result += "<" + fieldName + ">"
					+ ReflectUtil.forceGet(field, request) + "</" + fieldName
					+ ">";
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
					"application/x-www-form-urlencoded");
			conn.connect();
		} catch (Exception e) {
			e.printStackTrace();
			onError("ÍøÂç´íÎó£¡");
		}
		return conn;
	}

	protected abstract void onResponse(P response);

	protected abstract void onError(String error);
}
