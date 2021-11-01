package com.pb.klokov.hw5;

public class Reader {
    String FIO; //ФИО
    int ticket_number; //номер читательского билета
    String faculty; //факультет
    String birthday; //дата рождения
    int phone_number; //телефон

    public void takeBook(int count){
        System.out.println(FIO + "взял " + count + " книги.");
    }
    public void takeBook(String...name){
        System.out.println(FIO + "взял книги: " + name);
    }
    public void takeBook(Object...arg){
        System.out.println(FIO + "взял книги: " + );
    }
    }


