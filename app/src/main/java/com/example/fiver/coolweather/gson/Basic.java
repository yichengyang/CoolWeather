package com.example.fiver.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yang on 17/6/26.
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
