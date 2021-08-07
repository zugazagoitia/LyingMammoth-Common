package com.zugazagoitia.lyingMammoth.common.util.adapter;

import com.squareup.moshi.ToJson;
import com.zugazagoitia.lyingMammoth.common.model.AuthToken;

public class AuthTokenAdapter {
	@ToJson
	String toJson(AuthToken token){
		return token.getToken();
	}
}
