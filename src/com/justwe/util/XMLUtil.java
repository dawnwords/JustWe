package com.justwe.util;

import java.lang.reflect.*;
import java.util.*;
import java.util.regex.*;

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
		} else if (long.class.equals(type)) {
			return Long.parseLong(content);
		} else if (double.class.equals(type)) {
			return Double.parseDouble(content);
		} else if (String.class.equals(type)) {
			return content;
		} else if (type instanceof ParameterizedType
				&& List.class.equals(((ParameterizedType) type).getRawType())) {
			Type c = ReflectUtil.getGenericClass(type);
			return parseXML2List(content, c);
		} else {
			Object result = ((Class<?>) type).newInstance();
			for (Field field : ReflectUtil.getAllFields(result.getClass())) {
				String name = field.getName();
				Matcher m = getXMLNodePattern(name).matcher(xml);
				if (m.find()) {
					Object value = parseXML(m.group(), field.getGenericType());
					ReflectUtil.forceSet(field, result, value);
				}
			}
			return result;
		}
		// T result = clazz.newInstance();
		// for (Field field : ReflectUtil.getAllFields(result.getClass())) {
		// String name = field.getName();
		// Matcher m = getXMLNodePattern(name).matcher(xml);
		// if (m.find()) {
		// Class<?> fieldClass = field.getType();
		// String content = removeTag(m.group());
		// Object value;
		// if (int.class.equals(fieldClass)) {
		// value = Integer.parseInt(content);
		// } else if (long.class.equals(fieldClass)) {
		// value = Long.parseLong(content);
		// } else if (double.class.equals(fieldClass)) {
		// value = Double.parseDouble(content);
		// } else if (String.class.equals(fieldClass)) {
		// value = content;
		// } else if (List.class.equals(fieldClass)) {
		// Class<?> c = ReflectUtil.getFieldGenericClass(field);
		// value = parseXML2List(content, c);
		// } else {
		// value = parseXML(content, fieldClass);
		// }
		// ReflectUtil.forceSet(field, result, value);
		// }
		// }
		// return result;
	}

	private static List<Object> parseXML2List(String xml, Type recType)
			throws Exception {
		List<Object> result = new LinkedList<Object>();
		Matcher recMatcher = getXMLNodePattern(getTag(xml)).matcher(xml);
		while (recMatcher.find()) {
			Object obj = parseXML(recMatcher.group(), recType);
			result.add(obj);
		}
		return result;
	}

	private static Pattern getXMLNodePattern(String tag) {
		String recTag = "<name[^>]*(/>|>(\\S|\\s)*?</name>)";
		recTag = recTag.replaceAll("name", tag);
		return Pattern.compile(recTag);
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
