package com.pb.klokov.hw5;

public class Reader {
    private String FIO; //ФИО
    private int ticket_number; //номер читательского билета
    private String faculty; //факультет
    private String birthday; //дата рождения
    private int phone_number; //телефон

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public int getTicket_number() {
        return ticket_number;
    }

    public void setTicket_number(int ticket_number) {
        this.ticket_number = ticket_number;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }
    //метод, который будет принимать количество взятых книг
    public void takeBook(String FIO, int count) {
        System.out.println(FIO + "взял " + count + " книги.");
    }
    //метод, который будет принимать переменное количество названий книг
    public void takeBook(String FIO, String... titles) {
        System.out.println(FIO + "взял книги:" + titles);
        for (String title : titles) {
            System.out.println(title);
        }


    }
}


