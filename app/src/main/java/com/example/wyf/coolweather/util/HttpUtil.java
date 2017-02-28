package com.example.wyf.coolweather.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by WYF on 2017/2/27.
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address, Callback callback){
        OkHttpClient okHttpClient = new OkHttpClient();
        Request build = new Request.Builder().url(address).build();
        okHttpClient.newCall(build).enqueue(callback);
    }
}
