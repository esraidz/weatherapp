package com.example.weatherapp.service;

import com.example.weatherapp.model.WeeklyWeatherData;
import com.example.weatherapp.model.WeeklyWeatherResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.example.weatherapp.model.GeoCodingResponse;

@Service
public class WeeklyWeatherService {

    private final RestTemplate restTemplate;

    @Value("${openweather.api.key}")
    private String apiKey;

    public WeeklyWeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public WeeklyWeatherData getWeeklyWeatherData(String city) {
        try {
            // OpenWeather API'den haftalık hava durumu verilerini al
            String url = String.format("https://api.openweathermap.org/data/2.5/forecast/daily?q=%s&appid=%s&units=metric", city, apiKey);
            WeeklyWeatherResponse response = restTemplate.getForObject(url, WeeklyWeatherResponse.class);

            if (response != null) {
                // WeeklyWeatherResponse'dan WeeklyWeatherData'ya dönüşüm
                WeeklyWeatherData weeklyWeatherData = new WeeklyWeatherData();
                // WeeklyWeatherResponse'tan verileri alın ve WeeklyWeatherData'ya taşıyın
                // weeklyWeatherData.setDailyWeather(response.getDailyWeatherList());
                return weeklyWeatherData;
            } else {
                return new WeeklyWeatherData(); // Boş veri döndür
            }
        } catch (Exception e) {
            throw new RuntimeException("Error fetching weekly weather data: " + e.getMessage(), e);
        }
    }
}
