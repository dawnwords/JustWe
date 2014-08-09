package com.justwe.logic;

import java.util.Calendar;

import com.justwe.bean.data.CommodityDataRec;
import com.justwe.network.Login;
import com.justwe.network.Logout;
import com.justwe.network.Order;
import com.justwe.network.QueryCommodityData;

public class Logic4 {
	public static void main(String[] args) throws Exception {
		new Login().login();
		Calendar c = Calendar.getInstance();
		while (checkTimeBetween(c, 13, 30, 16, 0)) {
			CommodityDataRec boll = new QueryCommodityData().query("99BOLL")
					.get(0);
			new Order().buyOpenPosition("99BOLL", 1, boll.getOFFER());

			sleepOneMinute();

			new Order().sellClosePosition("99BOLL", 1, boll.getBID());

			sleepOneMinute();
		}

		new Logout().logout();
	}

	private static void sleepOneMinute() throws InterruptedException {
		Thread.sleep(60 * 1000);
	}

	
	
	private static boolean checkTimeBetween(Calendar c, int startH, int startM,
			int endH, int endM) {
		int H = c.get(Calendar.HOUR_OF_DAY);
		int M = c.get(Calendar.MINUTE);
		return (H > startH || (H == startH && M > startM))
				&& (H < endH || (H == endH && M < endM));
	}
}
