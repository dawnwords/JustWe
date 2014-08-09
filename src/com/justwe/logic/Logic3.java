package com.justwe.logic;

import java.util.List;

import com.justwe.bean.data.OrderRec;
import com.justwe.network.Login;
import com.justwe.network.Logout;
import com.justwe.network.Order;
import com.justwe.network.QueryOrder;

public class Logic3 {
	public static void main(String[] args) throws Exception {
		new Login().login();

		List<OrderRec> recs = new QueryOrder().queryMyOrderAllAsc(0, 10,
				"OR_N", 0);
		for (OrderRec rec : recs) {
			if (rec.getSTA() == 1) {
				new Order().cancel(rec.getOR_N());
			}
		}

		new Logout().logout();
	}
}
