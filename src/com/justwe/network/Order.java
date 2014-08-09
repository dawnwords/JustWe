package com.justwe.network;

import com.justwe.bean.request.CancelOrderRequest;
import com.justwe.bean.request.OrderSubmitRequest;
import com.justwe.bean.response.Result;

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

}
