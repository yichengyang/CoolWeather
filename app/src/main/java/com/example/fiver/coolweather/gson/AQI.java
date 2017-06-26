package com.example.fiver.coolweather.gson;

/**
 * Created by yang on 17/6/26.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
