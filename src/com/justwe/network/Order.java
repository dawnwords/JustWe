package com.justwe.network;

import com.justwe.bean.data.CommodityDataRec;
import com.justwe.bean.request.CancelOrderRequest;
import com.justwe.bean.request.OrderSubmitRequest;
import com.justwe.bean.response.Result;
import com.justwe.util.Log;

public class Order extends Networker<Result> {
	public void buyOpenPosition(String commodityId, int quantity, double price)
			throws Exception {
		getResult(OrderSubmitRequest.buyOpenPosition(commodityId, quantity,
				price));
	}

	public void sellOpenPosition(String commodityId, int quantity, double price)
			throws Exception {
		getResult(OrderSubmitRequest.sellOpenPosition(commodityId, quantity,
				price));
	}

	public void buyClosePosition(String commodityId, int quantity, double price)
			throws Exception {
		getResult(OrderSubmitRequest.buyClosePosition(commodityId, quantity,
				price));
	}

	public void sellClosePosition(String commodityId, int quantity, double price)
			throws Exception {
		getResult(OrderSubmitRequest.sellClosePosition(commodityId, quantity,
				price));
	}

	public void cancel(String orderNum) throws Exception {
		getResult(new CancelOrderRequest(orderNum));
	}

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
		}
		new Logout().logout();
	}
}
