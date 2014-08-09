package com.justwe.network;

import java.util.List;

import com.justwe.bean.data.OrderRec;
import com.justwe.bean.request.QueryMyOrderRequest;
import com.justwe.bean.request.QueryWeekOrderRequest;
import com.justwe.bean.response.QueryOrderResponse;

public class QueryOrder extends Networker<QueryOrderResponse> {
	public List<OrderRec> queryWeekOrderAllDesc(int startNum, int resultCount,
			String sortField, long updateTime) throws Exception {
		return queryOrder(new QueryWeekOrderRequest("", startNum, resultCount,
				sortField, 1, "", "", updateTime));
	}

	public List<OrderRec> queryWeekOrderAllAsc(int startNum, int resultCount,
			String sortField, long updateTime) throws Exception {
		return queryOrder(new QueryWeekOrderRequest("", startNum, resultCount,
				sortField, 2, "", "", updateTime));
	}

	public List<OrderRec> queryWeekOrderBuyDesc(String orderNo,
			String commodityId, int startNum, int resultCount,
			String sortField, long updateTime) throws Exception {
		return queryOrder(new QueryWeekOrderRequest(commodityId, startNum,
				resultCount, sortField, 1, "1", orderNo, updateTime));
	}

	public List<OrderRec> queryWeekOrderBuyAsc(String orderNo,
			String commodityId, int startNum, int resultCount,
			String sortField, long updateTime) throws Exception {
		return queryOrder(new QueryWeekOrderRequest(commodityId, startNum,
				resultCount, sortField, 2, "1", orderNo, updateTime));
	}

	public List<OrderRec> queryWeekOrderSellDesc(String orderNo,
			String commodityId, int startNum, int resultCount,
			String sortField, long updateTime) throws Exception {
		return queryOrder(new QueryWeekOrderRequest(commodityId, startNum,
				resultCount, sortField, 1, "2", orderNo, updateTime));
	}

	public List<OrderRec> queryWeekOrderSellAsc(String orderNo,
			String commodityId, int startNum, int resultCount,
			String sortField, long updateTime) throws Exception {
		return queryOrder(new QueryWeekOrderRequest(commodityId, startNum,
				resultCount, sortField, 2, "2", orderNo, updateTime));
	}

	public List<OrderRec> queryMyOrderAllDesc(int startNum, int resultCount,
			String sortField, long updateTime) throws Exception {
		return queryOrder(new QueryMyOrderRequest("", startNum, resultCount,
				sortField, 1, "", "", updateTime));
	}

	public List<OrderRec> queryMyOrderAllAsc(int startNum, int resultCount,
			String sortField, long updateTime) throws Exception {
		return queryOrder(new QueryMyOrderRequest("", startNum, resultCount,
				sortField, 2, "", "", updateTime));
	}

	public List<OrderRec> queryMyOrderBuyDesc(String orderNo,
			String commodityId, int startNum, int resultCount,
			String sortField, long updateTime) throws Exception {
		return queryOrder(new QueryMyOrderRequest(commodityId, startNum,
				resultCount, sortField, 1, "1", orderNo, updateTime));
	}

	public List<OrderRec> queryMyOrderBuyAsc(String orderNo,
			String commodityId, int startNum, int resultCount,
			String sortField, long updateTime) throws Exception {
		return queryOrder(new QueryMyOrderRequest(commodityId, startNum,
				resultCount, sortField, 2, "1", orderNo, updateTime));
	}

	public List<OrderRec> queryMyOrderSellDesc(String orderNo,
			String commodityId, int startNum, int resultCount,
			String sortField, long updateTime) throws Exception {
		return queryOrder(new QueryMyOrderRequest(commodityId, startNum,
				resultCount, sortField, 1, "2", orderNo, updateTime));
	}

	public List<OrderRec> queryMyOrderSellAsc(String orderNo,
			String commodityId, int startNum, int resultCount,
			String sortField, long updateTime) throws Exception {
		return queryOrder(new QueryMyOrderRequest(commodityId, startNum,
				resultCount, sortField, 2, "2", orderNo, updateTime));
	}

	private List<OrderRec> queryOrder(QueryMyOrderRequest request)
			throws Exception {
		return getResult(request).getResultList();
	}

	public static void main(String[] args) throws Exception{
		new Login().login();
		new QueryOrder().queryMyOrderAllAsc(0, 100, "OR_N", 0);
		new Logout().logout();
	}
}
