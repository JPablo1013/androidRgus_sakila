package com.example.peliculas2;

public class Movie {
    private String title;
    private int year;
    private int imageResourceId;
    private String description;
    private String languageId;
    private String originalLanguageId;
    private int rentalDuration;
    private double rentalRate;
    private int length;
    private double replacementCost;
    private String rating;
    private String specialFeatures;
    private String lastUpdate;

    public Movie(String title, int year, int imageResourceId, String description,
                 String languageId, String originalLanguageId, int rentalDuration,
                 double rentalRate, int length, double replacementCost, String rating,
                 String specialFeatures, String lastUpdate) {
        this.title = title;
        this.year = year;
        this.imageResourceId = imageResourceId;
        this.description = description;
        this.languageId = languageId;
        this.originalLanguageId = originalLanguageId;
        this.rentalDuration = rentalDuration;
        this.rentalRate = rentalRate;
        this.length = length;
        this.replacementCost = replacementCost;
        this.rating = rating;
        this.specialFeatures = specialFeatures;
        this.lastUpdate = lastUpdate;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public String getLanguageId() {
        return languageId;
    }

    public String getOriginalLanguageId() {
        return originalLanguageId;
    }

    public int getRentalDuration() {
        return rentalDuration;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public int getLength() {
        return length;
    }

    public double getReplacementCost() {
        return replacementCost;
    }

    public String getRating() {
        return rating;
    }

    public String getSpecialFeatures() {
        return specialFeatures;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }
}
