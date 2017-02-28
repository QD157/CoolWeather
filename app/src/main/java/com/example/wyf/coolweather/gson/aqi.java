package com.example.wyf.coolweather.gson;

/**
 * Created by WYF on 2017/2/28.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
