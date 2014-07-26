package com.justwe.util;

public class Log {
	public static void i(String tag, Object msg) {
		System.out.printf("%tF %<tH:%<tM:%<tS[%s]%s\n",
				System.currentTimeMillis(), tag, msg);
	}

	public static void i(Object msg) {
		StackTraceElement stack[] = (new Throwable()).getStackTrace();
		int ix = 0;
		while (ix < stack.length) {
			StackTraceElement frame = stack[ix++];
			String cname = frame.getClassName();
			if (cname.equals(Log.class.getName())) {
				break;
			}
		}
		String tag = stack[ix].getFileName();
		tag = tag.substring(0, tag.length() - 5);
		i(tag, msg);
	}

}
