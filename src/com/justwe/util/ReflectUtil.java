package com.justwe.util;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

public class ReflectUtil {
	public static void forceSet(Field f, Object o, Object value) {
		f.setAccessible(true);
		try {
			f.set(o, value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public static <T> T forceGet(Field f, Object o) {
		f.setAccessible(true);
		try {
			return (T) f.get(o);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static List<Field> getAllFields(Class<?> clazz) {
		List<Field> result = new ArrayList<Field>();
		for (Field f : clazz.getDeclaredFields()) {
			result.add(f);
		}
		Class<?> superClass = clazz.getSuperclass();
		if (superClass != null) {
			result.addAll(getAllFields(superClass));
		}
		return result;
	}

	public static Type getGenericClass(Type type) {
		return (Class<?>) ((ParameterizedType) type).getActualTypeArguments()[0];
	}
}
