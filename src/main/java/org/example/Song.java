package org.example;

public class Song {
    private int id;
    private String title;
    private String artist;
    private String album;
    private String genre;
    private String filePath;

    public Song(int id, String title, String artist, String album, String genre, String filePath) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.genre = genre;
        this.filePath = filePath;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public String getGenre() {
        return genre;
    }

    public String getFilePath() {
        return filePath;
    }

    public void display() {
        System.out.println("ID: " + id +
                " | Title: " + title +
                " | Artist: " + artist +
                " | Album: " + album +
                " | Genre: " + genre);
    }
}