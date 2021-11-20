package com.pb.klokov.hw5;

public class Reader {
    String FIO; //ФИО
    int ticket_number; //номер читательского билета
    String faculty; //факультет
    String birthday; //дата рождения
    int phone_number; //телефон

    public Reader(String FIO, int ticket_number, String faculty, String birthday, int phone_number) {
        this.FIO = FIO;
        this.ticket_number = ticket_number;
        this.faculty = faculty;
        this.birthday = birthday;
        this.phone_number = phone_number;
    }

    public String getFIO() {
        return FIO;
    }

    public int getTicket_number() {
        return ticket_number;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getBirthday() {
        return birthday;
    }

    public int getPhone_number() {
        return phone_number;
    }

    @Override
    public String toString() {
        return "ФИО " + FIO + '\'' +
                ", номер читательского билета=" + ticket_number +
                ", факультет='" + faculty + '\'' +
                ", дата рождения='" + birthday + '\'' +
                ", тел. номер=" + phone_number +
                '}' + ", ";
    }

    //метод, который будет принимать количество взятых книг
    public void takeBook(int count) {
        System.out.println(FIO + "взял " + count + " книги.");
    }

    //метод, который будет принимать переменное количество названий книг
    public void takeBook(String... title) {
        String str = "";
        for (String s : title){
            str += s + ", ";
        }
        System.out.println(FIO + "взял книги:" + str);
        }

    //метод, который будет принимать переменное количество объектов класса Book
    public void takeBook(char ... k) {
        for(int i = 0; i < k.length; i++) {
            System.out.println(k[i]);
        }
    }


    //метод, который будет принимать количество взятых книг
    public void returnBook(int count) {
        System.out.println(FIO + "вернул " + count + " книги.");
    }

    //метод, который будет принимать переменное количество названий книг
    public void returnBook(String... title) {
        String str = "";
        for (String s : title){
            str += s + ", ";
        }
        System.out.println(FIO + "вернул книги:" + str);
    }
    //метод, который будет принимать переменное количество объектов класса Book
    public void returnBook(char ... k) {
            for(int i = 0; i < k.length; i++) {
                System.out.println(k[i]);
        }
    }
    }






