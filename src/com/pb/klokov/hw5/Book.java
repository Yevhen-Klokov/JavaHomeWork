package com.pb.klokov.hw5;

public class Book {
    String name; //название
    String author; //автор книги
    int year; //год издания

    String bookInfo(){
        return "Book name: " + name + ", author: " + author + ", year: " + year;
    }

    }

