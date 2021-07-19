package com.example.practice.model;

public class Cartoon {
    private int id;
    private String title;
    private String artistName;
    private int weekday;
    private String genre;
    private String finished;
    private String createAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public int getWeekday() {
        return weekday;
    }

    public void setWeekday(int weekday) {
        this.weekday = weekday;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getFinished() {
        return finished;
    }

    public void setFinished(String finished) {
        this.finished = finished;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    @Override
    public String toString() {
        return "Cartoon{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", artistName='" + artistName + '\'' +
                ", weekday=" + weekday +
                ", genre='" + genre + '\'' +
                ", finished='" + finished + '\'' +
                ", createAt='" + createAt + '\'' +
                '}';
    }

}
