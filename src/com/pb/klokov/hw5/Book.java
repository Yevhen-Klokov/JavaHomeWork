package com.pb.klokov.hw5;

public class Book {
    private String title; //название
    private String author; //автор книги
    private int year; //год издания

    //Гет и сет методы
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    String bookInfo(){
        return title + " (" + author + " " + year + " )";
    }
    

}