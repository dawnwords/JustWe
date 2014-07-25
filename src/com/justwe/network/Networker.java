package com.justwe.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.ParameterizedType;
import java.net.HttpURLConnection;
import java.net.URL;

import com.justwe.bean.request.Request;
import com.justwe.bean.request.RequestName;
import com.justwe.bean.response.Response;
import com.justwe.util.IOUtil;
import com.justwe.util.Log;
import com.justwe.util.XMLUtil;

public abstract class Networker<P extends Response> {
	private Request request;
	private P response;
	private Exception exception;
	private Thread worker = new Thread(){
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
				writer.write(XMLUtil.getRequestXML(getRequestName(), request));
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

	};
	
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
				(Class<P>) genericSuperclass.getActualTypeArguments()[0]);
	}

	private String getRequestName() {
		return request.getClass().getAnnotation(RequestName.class).value();
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

	private void onResponse(P response) {
		Log.i(response);
		synchronized (this) {
			Networker.this.response = response;
			notify();
		}
	}

	private void onError(String error) {
		Log.i(error);
		synchronized (this) {
			Networker.this.exception = new Exception(error);
			notify();
		}
	}
	
	public P getResult(Request request) throws Exception {
		this.request = request;
		worker.start();
		synchronized (this) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		if (response == null) {
			throw exception;
		}
		return response;
	}
}
