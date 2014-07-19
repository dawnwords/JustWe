package com.justwe.util;

import java.lang.reflect.*;
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

	public static <T> T parseXML(String xml, Class<T> clazz) throws Exception {
		T result = clazz.newInstance();
		for (Field field : ReflectUtil.getAllFields(result.getClass())) {
			String name = field.getName();
			String pattern = "<name>([\\s\\S]*)</name>"
					.replaceAll("name", name);
			Matcher m = Pattern.compile(pattern).matcher(xml);
			if (m.find()) {
				Class<?> fieldClass = field.getType();
				String content = m.group().replaceAll("<[^>]*>", "");
				Object value;
				if (int.class.equals(fieldClass)) {
					value = Integer.parseInt(content);
				} else if (long.class.equals(fieldClass)) {
					value = Long.parseLong(content);
				} else if (String.class.equals(fieldClass)) {
					value = content;
				} else {
					value = parseXML(content, fieldClass);
				}
				ReflectUtil.forceSet(field, result, value);
			}
		}
		return result;
	}
}
