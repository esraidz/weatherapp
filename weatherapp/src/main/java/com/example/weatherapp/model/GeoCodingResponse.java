package com.example.weatherapp.model;

public class GeoCodingResponse {
    private GeoCodingCoord coord;

    // Getters and setters

    public GeoCodingCoord getCoord() {
        return coord;
    }

    public void setCoord(GeoCodingCoord coord) {
        this.coord = coord;
    }


    public double getLat() {
        return 0;
    }

    public double getLon() {
        return 0;
    }

    public static class GeoCodingCoord {
        private double lon;
        private double lat;

        // Getters and setters

        public double getLon() {
            return lon;
        }

        public void setLon(double lon) {
            this.lon = lon;
        }

        public double getLat() {
            return lat;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }
    }
}

