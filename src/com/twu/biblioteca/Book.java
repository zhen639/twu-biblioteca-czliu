package com.twu.biblioteca;

public class Book {
    private String name;
    private String author;
    private String publishYear;

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishYear() {
        return publishYear;
    }
}