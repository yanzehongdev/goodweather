package com.goodweather.android.gson;

/**
 * Created by 小言 on 2017/9/3.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
