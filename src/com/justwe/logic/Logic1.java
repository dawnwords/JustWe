package com.justwe.logic;

import com.justwe.bean.data.CommodityDataRec;
import com.justwe.network.FirmInfo;
import com.justwe.network.Login;
import com.justwe.network.Logout;
import com.justwe.network.Order;
import com.justwe.network.QueryCommodityData;
import com.justwe.util.Log;

public class Logic1 {
	public static void main(String[] args) throws Exception {
		new Login().login();
		double eqt = new FirmInfo().get().get(0).getEQT();
		double prc = -1;
		double last = -1;
		String coi = "";

		for (CommodityDataRec rec : new QueryCommodityData().queryAll()) {
			if ("Ô­¾ÆáÁÁë".equals(rec.getCO_N())) {
				prc = rec.getPR_C();
				coi = rec.getCO_I();
				last = rec.getLAST();
				break;
			}
		}
		if (prc > 0) {
			int quantity = (int) (eqt / 2 / prc);
			Log.i("prc", prc);
			Log.i("coi", coi);
			Log.i("last", last);
			Log.i("quantity", quantity);
			new Order().buyOpenPosition(coi, 1, last);
			new Order().sellClosePosition(coi, 1, last);
		}
		new Logout().logout();
	}
}
