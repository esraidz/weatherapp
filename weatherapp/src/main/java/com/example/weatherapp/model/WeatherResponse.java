package com.example.weatherapp.model;

import java.util.List;
public class WeatherResponse {
    private String name; // Şehir adı
    private Main main; // Sıcaklık, nem
    private List<Weather> weather; // Açıklama ve ikon
    private Wind wind; // Rüzgar hızı

    // Getter ve Setter metodları

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public static class Main {
        private double temp;
        private double humidity;

        // Getter ve Setter metodları

        public double getTemp() {
            return temp;
        }

        public void setTemp(double temp) {
            this.temp = temp;
        }

        public double getHumidity() {
            return humidity;
        }

        public void setHumidity(double humidity) {
            this.humidity = humidity;
        }
    }

    public static class Weather {
        private String description;
        private String icon;

        // Getter ve Setter metodları

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }
    }

    public static class Wind {
        private double speed;

        // Getter ve Setter metodları

        public double getSpeed() {
            return speed;
        }

        public void setSpeed(double speed) {
            this.speed = speed;
        }
    }
}
