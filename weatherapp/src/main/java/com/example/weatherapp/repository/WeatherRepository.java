package com.example.weatherapp.repository;


    import com.example.weatherapp.model.WeatherData;
    import org.springframework.data.mongodb.repository.MongoRepository;

    import java.util.List;

public interface WeatherRepository extends MongoRepository<WeatherData, String> {

        List<WeatherData> findByCity(String city);
    }

