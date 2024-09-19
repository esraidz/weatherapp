package com.example.weatherapp.model;

import com.example.weatherapp.service.DailyWeather;

import java.util.List;
import java.util.List;

public class WeeklyWeatherResponse {
    private List<DailyWeather> daily;

    public WeeklyWeatherResponse() {
    }

    // Getter ve Setter metodları
    public List<DailyWeather> getDaily() {
        return daily;
    }

    public void setDaily(List<DailyWeather> daily) {
        this.daily = daily;
    }
}
