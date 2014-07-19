package com.justwe.util;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.regex.*;

public class XMLUtil {
	public static String getRequestXML(String name, String content) {
		final String requestName = ":requestname:";
		final String reqeustContent = ":content:";
		final String requestTemplate = "<?xml version='1.0' encoding = 'GB2312'?><MEBS_MOBILE>"
				+ "<REQ name='"
				+ requestName
				+ "'>"
				+ reqeustContent
				+ "</REQ></MEBS_MOBILE>";
		return requestTemplate.replaceFirst(requestName, name).replaceFirst(
				reqeustContent, content);
	}

	public static <T> T parseXML(String xml, Class<T> clazz) {
		T response = clazz.newInstance();
		for (Field field : response.getClass().getDeclaredFields()) {
			String name = field.getName();
			String pattern = "<name>([\\s\\S]*)</name>"
					.replaceAll("name", name);
			Matcher m = Pattern.compile(pattern).matcher(xml);
			if (m.find()) {
				Class fieldClass = field.getClass();
				String content = m.group();
				Object value;
				if (int.class.equals(fieldClass)) {
					value = Integer.parseInt(content);
				} else if (String.class.equals(fieldClass)) {
					value = content;
				} else {
					value = parseXML(content, fieldClass);
				}
				field.set(response, value);
			}
		}
		return response;
	}
}
