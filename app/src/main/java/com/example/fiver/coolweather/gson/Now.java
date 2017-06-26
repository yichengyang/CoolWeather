package com.example.fiver.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yang on 17/6/26.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
