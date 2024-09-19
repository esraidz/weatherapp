package com.example.weatherapp.model;

import com.example.weatherapp.service.DailyWeather;

import java.util.List;

public class WeeklyWeatherData {
    private List<DailyWeather> dailyWeather;

    // Getter ve Setter metodları
    public List<DailyWeather> getDailyWeather() {
        return dailyWeather;
    }

    public void setDailyWeather(List<DailyWeather> dailyWeather) {
        this.dailyWeather = dailyWeather;
    }
}
