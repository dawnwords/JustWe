package com.justwe.util;

import java.lang.reflect.*;
import java.util.*;

import com.justwe.bean.request.Request;

public class XMLUtil {
	public static String getRequestXML(String name, Request request) {
		final String requestName = ":requestname:";
		final String reqeustContent = ":content:";
		final String requestTemplate = "<?xml version='1.0' encoding = 'GB2312'?><MEBS_MOBILE>"
				+ "<REQ name='"
				+ requestName
				+ "'>"
				+ reqeustContent
				+ "</REQ></MEBS_MOBILE>";

		String content = "";
		for (Field field : ReflectUtil.getAllFields(request.getClass())) {
			String fieldName = field.getName();
			content += "<" + fieldName + ">"
					+ ReflectUtil.forceGet(field, request) + "</" + fieldName
					+ ">";
		}

		return requestTemplate.replaceFirst(requestName, name).replaceFirst(
				reqeustContent, content);
	}

	public static Object parseXML(String xml, Type type) throws Exception {
		String content = removeTag(xml);
		if (int.class.equals(type)) {
			return Integer.parseInt(content);
		}
		if (long.class.equals(type)) {
			return Long.parseLong(content);
		}
		if (double.class.equals(type)) {
			return Double.parseDouble(content);
		}
		if (String.class.equals(type)) {
			return content;
		}
		if ("".equals(content)) {
			return null;
		}
		if (type instanceof ParameterizedType
				&& List.class.equals(((ParameterizedType) type).getRawType())) {
			Type c = ReflectUtil.getGenericClass(type);
			return parseXML2List(content, c);
		}

		Object result = ((Class<?>) type).newInstance();
		for (Field field : ReflectUtil.getAllFields(result.getClass())) {
			String name = field.getName();
			XMLMatcher m = new XMLMatcher(xml, name);
			if (m.find()) {
				Object value = parseXML(m.group(), field.getGenericType());
				ReflectUtil.forceSet(field, result, value);
			}
		}
		return result;
	}

	private static List<Object> parseXML2List(String xml, Type recType)
			throws Exception {
		List<Object> result = new LinkedList<Object>();
		XMLMatcher recMatcher = new XMLMatcher(xml, getTag(xml));
		while (recMatcher.find()) {
			Object obj = parseXML(recMatcher.group(), recType);
			result.add(obj);
		}
		return result;
	}

	private static String removeTag(String xml) {
		int start = xml.indexOf('>') + 1;
		int end = xml.lastIndexOf('<');
		return xml.substring(start, end);
	}

	private static String getTag(String xml) {
		int start = xml.lastIndexOf('/') + 1;
		int end = xml.lastIndexOf('>');
		return xml.substring(start, end);
	}
}
