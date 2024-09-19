package com.example.weatherapp.service;

import com.example.weatherapp.model.GeoCodingResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GeoCodingService {

    @Value("${geocoding.api.key}")
    private String apiKey;

    private final RestTemplate restTemplate;

    public GeoCodingService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public GeoCodingResponse getCoordinates(String city) {
        String url = String.format("https://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s", city, apiKey);
        return restTemplate.getForObject(url, GeoCodingResponse.class);
    }
}
