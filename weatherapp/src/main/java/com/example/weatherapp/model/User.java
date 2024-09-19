package com.example.weatherapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String username;
    private String email;
    private String password; // Şifreyi hash'lemeyi unutmayın
    private List<String> favoriteCities; // Kullanıcının favori şehirleri

    public User() {
        // Varsayılan yapıcı metod
    }

    public User(String id, String username, String email, String password, List<String> favoriteCities) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.favoriteCities = favoriteCities;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getFavoriteCities() {
        return favoriteCities;
    }

    public void setFavoriteCities(List<String> favoriteCities) {
        this.favoriteCities = favoriteCities;
    }
}

