package com.justwe.network;

import java.util.List;

import com.justwe.bean.data.FirmInfoRec;
import com.justwe.bean.request.FirmInfoRequest;
import com.justwe.bean.response.FirmInfoResponse;
import com.justwe.util.Log;

public class FirmInfo extends Networker<FirmInfoResponse> {

	public List<FirmInfoRec> get() throws Exception {
		return getResult(new FirmInfoRequest()).getResultList();
	}

	public static void main(String[] args) throws Exception {
		new Login().login();
		List<FirmInfoRec> recs = new FirmInfo().get();
		for (FirmInfoRec rec : recs) {
			Log.i(rec);
		}
		new Logout().logout();
	}
}
