package com.example.practice.model;

public class CartoonsSearch {


    private String date;
    private String genre;
    private String finished;


    public void setDate(String date) {
        this.date = date;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setFinished(String finished) {
        this.finished = finished;
    }


    public String getDate() {
        return date;
    }

    public String getGenre() {
        return genre;
    }

    public String getFinished() {
        return finished;
    }

    @Override
    public String toString() {
        return "CartoonsSearch{" +
                "date='" + date + '\'' +
                ", genre='" + genre + '\'' +
                ", finished='" + finished + '\'' +
                '}';
    }
}
