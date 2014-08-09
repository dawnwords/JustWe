package com.justwe.logic;

import com.justwe.bean.data.CommodityDataRec;
import com.justwe.network.Login;
import com.justwe.network.Logout;
import com.justwe.network.Order;
import com.justwe.network.QueryCommodityData;

public class Logic2 {
	public static void main(String[] args) throws Exception {
		new Login().login();

		CommodityDataRec bollRec = new QueryCommodityData().query("99BOLL")
				.get(0);
		double bid = bollRec.getBID();
		
		new Order().sellClosePosition("99BOLL", 2, bid);

		new Logout().logout();
	}
}
