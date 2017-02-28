package com.example.wyf.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by WYF on 2017/2/28.
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temerature temerature;

    @SerializedName("cond")
    public More more;

    public class Temerature{
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
