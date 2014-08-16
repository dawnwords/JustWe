package com.justwe.logic;

import java.util.Calendar;
import java.util.List;

import com.justwe.bean.data.CommodityDataRec;
import com.justwe.bean.data.HoldingRec;
import com.justwe.network.Login;
import com.justwe.network.Logout;
import com.justwe.network.Order;
import com.justwe.network.QueryCommodityData;
import com.justwe.network.QueryHolding;

public class SimpleLogic {
	public static void main(String[] args) throws Exception {
		final TimePair tp1 = new TimePair(new Time(9, 10), new Time(11, 30));
		final TimePair tp2 = new TimePair(new Time(13, 30), new Time(16, 0));
		final TimePair tp3 = new TimePair(new Time(19, 0), new Time(23, 59));
		final TimePair tp4 = new TimePair(new Time(0, 0), new Time(3, 0));

		new Login().login();

		while (checkCurrentTimeBetween(tp1) && checkCurrentTimeBetween(tp2)
				&& checkCurrentTimeBetween(tp3) && checkCurrentTimeBetween(tp4)) {
			CommodityDataRec MTZJJDataRec = getCommodityDataRec("ę́�����");
			CommodityDataRec YJLLDataRec = getCommodityDataRec("ԭ������");

			final double ratio = 5.3616;
			final double average = 88.7217;
			final double variance = 6.3430;
			final int MTZJJQuantity = 1;
			final int YJLLQuantity = (int) (MTZJJQuantity * ratio);

			double spread = MTZJJDataRec.getLAST() - YJLLDataRec.getLAST()
					* ratio;

			if (!checkHolding(MTZJJDataRec.getCO_I())
					&& !checkHolding(YJLLDataRec.getCO_I())) {
				if (spread > average + 2 * variance) {
					buyOpenPosition(MTZJJDataRec, MTZJJQuantity);
					sellOpenPosition(YJLLDataRec, YJLLQuantity);
				}

				if (spread < average - 2 * variance) {
					sellOpenPosition(MTZJJDataRec, MTZJJQuantity);
					buyOpenPosition(YJLLDataRec, YJLLQuantity);
				}
			} else {
				HoldingRec YJLLHolding = getHoldingRec(YJLLDataRec.getCO_I());
				HoldingRec MTZJJHolding = getHoldingRec(MTZJJDataRec.getCO_I());
				if (spread <= average) {
					if (YJLLHolding.getBU_H() != 0
							&& MTZJJHolding.getSE_H() != 0) {
						sellClosePosition(YJLLDataRec, YJLLHolding.getBU_H());
						buyClosePosition(MTZJJDataRec, MTZJJHolding.getSE_H());
					}
				} else if (YJLLHolding.getSE_H() != 0
						&& MTZJJHolding.getBU_H() != 0) {
					sellClosePosition(MTZJJDataRec, MTZJJHolding.getBU_H());
					buyClosePosition(YJLLDataRec, YJLLHolding.getSE_H());
				}
			}
		}

		new Logout().logout();
	}

	private static void sellOpenPosition(CommodityDataRec rec, int quantity)
			throws Exception {
		new Order().sellOpenPosition(rec.getCO_I(), quantity, rec.getOFFER());
	}

	private static void buyOpenPosition(CommodityDataRec rec, int quantity)
			throws Exception {
		new Order().buyOpenPosition(rec.getCO_I(), quantity, rec.getBID());
	}

	private static void sellClosePosition(CommodityDataRec rec, int quantity)
			throws Exception {
		new Order().sellClosePosition(rec.getCO_I(), quantity, rec.getOFFER());
	}

	private static void buyClosePosition(CommodityDataRec rec, int quantity)
			throws Exception {
		new Order().buyClosePosition(rec.getCO_I(), quantity, rec.getBID());
	}

	private static CommodityDataRec getCommodityDataRec(String commodityName)
			throws Exception {
		for (CommodityDataRec rec : new QueryCommodityData().queryAll()) {
			if (commodityName.equals(rec.getCO_N())) {
				return rec;
			}
		}
		return null;
	}

	private static HoldingRec getHoldingRec(String commodityId)
			throws Exception {
		List<HoldingRec> recs = new QueryHolding().queryHoldingAsc(commodityId,
				0, 1, "CO_I");
		return recs.get(0);
	}

	private static boolean checkHolding(String commodityId) {
		try {
			HoldingRec rec = getHoldingRec(commodityId);
			return rec.getBU_H() != 0 || rec.getSE_H() != 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	private static boolean checkCurrentTimeBetween(TimePair tp) {
		Calendar c = Calendar.getInstance();
		int H = c.get(Calendar.HOUR_OF_DAY);
		int M = c.get(Calendar.MINUTE);
		return (H > tp.start.hour || (H == tp.start.hour && M > tp.start.minute))
				&& (H < tp.end.hour || (H == tp.end.hour && M < tp.end.minute));
	}

	static class TimePair {
		Time start;
		Time end;

		public TimePair(Time start, Time end) {
			this.start = start;
			this.end = end;
		}
	}

	static class Time {
		int hour;
		int minute;

		public Time(int hour, int minute) {
			this.hour = hour;
			this.minute = minute;
		}
	}
}
