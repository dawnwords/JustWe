package com.justwe.bean.session;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.justwe.util.IOUtil;

public class Session {
	private static Session instance = new Session();
	private static final String CONFIG_FILE_NAME = "config.property";

	private long sessionId;
	private Properties properties;

	private Session() {
		FileInputStream in = null;
		properties = new Properties();
		try {
			in = new FileInputStream(CONFIG_FILE_NAME);
			properties.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			IOUtil.close(in);
		}
	}

	public static Session getInstance() {
		return instance;
	}

	public long getSessionId() throws Exception {
		if (sessionId == 0) {
			throw new Exception("ÉÐÎ´µÇÂ¼");
		}
		return sessionId;
	}

	public void setSessionId(long sessionId) {
		this.sessionId = sessionId;
	}

	public void clearSessionId() {
		this.sessionId = 0;
	}

	public String getURL() {
		return properties.getProperty("url");
	}

	public String getUserId() {
		return properties.getProperty("id");
	}

	public String getPassword() {
		return properties.getProperty("password");
	}
	
	public String getCustomerId(){
		return properties.getProperty("customerId");
	}

}
