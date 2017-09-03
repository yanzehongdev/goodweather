package com.goodweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 小言 on 2017/9/3.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
