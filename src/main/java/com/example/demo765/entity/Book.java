package com.example.demo765.entity;

public class Book {
    private Integer id;

    private String title;

    private String author;

    private String date;

    private String press;

    private String abs;

    public Book(Integer id, String title, String author, String date, String press, String abs) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.date = date;
        this.press = press;
        this.abs = abs;
    }

    public Book() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press == null ? null : press.trim();
    }

    public String getAbs() {
        return abs;
    }

    public void setAbs(String abs) {
        this.abs = abs == null ? null : abs.trim();
    }
}