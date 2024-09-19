package com.example.weatherapp.service;

import com.example.weatherapp.model.WeatherData;
import com.example.weatherapp.model.WeatherResponse;
import com.example.weatherapp.repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class WeatherService {

    private final WeatherRepository weatherRepository;
    private final RestTemplate restTemplate;

    @Value("${openweather.api.key}")
    private String apiKey;

    @Autowired
    public WeatherService(WeatherRepository weatherRepository, RestTemplate restTemplate) {
        this.weatherRepository = weatherRepository;
        this.restTemplate = restTemplate;
    }

    public WeatherData getWeatherData(String city) {
        String url = String.format("https://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s&units=metric", city, apiKey);
        WeatherResponse response = restTemplate.getForObject(url, WeatherResponse.class);

        if (response != null) {
            WeatherData weatherData = new WeatherData();
            weatherData.setCity(response.getName());
            weatherData.setTemperature(response.getMain().getTemp());
            weatherData.setDescription(response.getWeather().get(0).getDescription());
            weatherData.setDate(LocalDateTime.now());
            weatherData.setWindSpeed(response.getWind().getSpeed());
            weatherData.setHumidity(response.getMain().getHumidity());

            saveWeatherData(weatherData);

            return weatherData;
        } else {
            return null;
        }
    }

    public void saveWeatherData(WeatherData weatherData) {
        weatherRepository.save(weatherData);
    }


    public List<WeatherData> getDefaultCitiesWeather() {
        List<String> cities = Arrays.asList("Istanbul", "Ankara");
        List<WeatherData> weatherDataList = new ArrayList<>();

        for (String city : cities) {
            WeatherData data = getWeatherData(city);
            if (data != null) {
                weatherDataList.add(data);
            }
        }

        return weatherDataList;
    }
}


