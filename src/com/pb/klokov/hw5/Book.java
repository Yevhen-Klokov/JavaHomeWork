package com.pb.klokov.hw5;

public class Book {
    String title; //название
    String author; //автор книги
    int year; //год издания

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return title + " (" + author + " " + year +
                ") , ";
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    String bookInfo(){
        return title + " (" + author + " " + year + " )";
    }


}