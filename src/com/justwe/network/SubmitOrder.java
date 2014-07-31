package com.justwe.network;

import com.justwe.bean.request.OrderSubmitRequest;
import com.justwe.bean.response.Result;

public class SubmitOrder extends Networker<Result> {
	public void buyOpenPosition(String customerId, String commodityId,
			int quantity, double price) throws Exception {
		getResult(OrderSubmitRequest.buyOpenPosition(customerId, commodityId,
				quantity, price));
	}

	public void sellOpenPosition(String customerId, String commodityId,
			int quantity, double price) throws Exception {
		getResult(OrderSubmitRequest.sellOpenPosition(customerId, commodityId,
				quantity, price));
	}

	public void buyClosePosition(String customerId, String commodityId,
			int quantity, double price) throws Exception {
		getResult(OrderSubmitRequest.buyClosePosition(customerId, commodityId,
				quantity, price));
	}

	public void sellClosePosition(String customerId, String commodityId,
			int quantity, double price) throws Exception {
		getResult(OrderSubmitRequest.sellClosePosition(customerId, commodityId,
				quantity, price));
	}
}
