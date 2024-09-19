package com.example.weatherapp.controller;

import com.example.weatherapp.model.WeatherData;
import com.example.weatherapp.model.WeeklyWeatherData;
import com.example.weatherapp.model.WeeklyWeatherResponse; // Haftalık hava durumu yanıtı için model
import com.example.weatherapp.service.WeatherService;
import com.example.weatherapp.service.WeeklyWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @Autowired
    private WeeklyWeatherService weeklyWeatherService;

    @GetMapping("/{city}")
    public ResponseEntity<WeatherData> getWeather(@PathVariable String city) {
        WeatherData weatherData = weatherService.getWeatherData(city);
        return ResponseEntity.ok(weatherData);
    }

    //@GetMapping("/weekly/{city}")
   // public ResponseEntity<WeeklyWeatherData> getWeeklyWeather(@PathVariable String city) {
     //   WeeklyWeatherData weeklyWeatherResponse = weeklyWeatherService.getWeeklyWeatherData(city);
      //  return ResponseEntity.ok(weeklyWeatherResponse);
   // }

    @GetMapping("/default")
    public ResponseEntity<List<WeatherData>> getDefaultCitiesWeather() {
        List<WeatherData> defaultWeather = weatherService.getDefaultCitiesWeather();
        return ResponseEntity.ok(defaultWeather);
    }

    @GetMapping
    public ResponseEntity<String> getGeneralInfo() {
        return ResponseEntity.ok("Please provide a city name to get the weather information.");
    }
}
