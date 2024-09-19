package com.example.weatherapp.service;

import java.time.LocalDate;
import java.time.LocalDate;

public class DailyWeather {
    private LocalDate date; // Tarih
    private double temperature; // Sıcaklık
    private String description; // Açıklama

    // Varsayılan yapıcı
    public DailyWeather() {
    }

    // Getter ve Setter metodları
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
