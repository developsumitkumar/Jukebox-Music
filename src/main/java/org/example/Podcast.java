package org.example;

public class Podcast {
    private int id;
    private String title;
    private String host;
    private String category;
    private String filePath;

    public Podcast(int id, String title, String host, String category, String filePath) {
        this.id = id;
        this.title = title;
        this.host = host;
        this.category = category;
        this.filePath = filePath;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getHost() {
        return host;
    }

    public String getCategory() {
        return category;
    }

    public String getFilePath() {
        return filePath;
    }

    public void display() {
        System.out.println("ID: " + id +
                " | Title: " + title +
                " | Host: " + host +
                " | Category: " + category);
    }
}