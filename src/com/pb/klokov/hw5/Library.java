package com.pb.klokov.hw5;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

        book1.name = "Sherlock Holmes";
        book1.author = "Arthur Conan Doyle";
        book1.year = 1890;

        book2.name = "Jane Eyre";
        book2.author = "Charlotte Brontë";
        book2.year = 1847;

        book3.name = "Gulliver's Travels";
        book3.author = "Jonathan Swift";
        book3.year = 1726;

        Reader reader1 = new Reader();
        Reader reader2 = new Reader();
        Reader reader3 = new Reader();

        reader1.FIO = "Petrov I.I.";
        reader1.ticket_number = 1235;
        reader1.faculty = "philological";
        reader1.birthday = "18.02.2000";
        reader1.phone_number = 226874;

        reader2.FIO = "Ivanov A.A.";
        reader2.ticket_number = 1236;
        reader2.faculty = "economic";
        reader2.birthday = "12.05.2001";
        reader2.phone_number = 659874;

        reader3.FIO = "Sidorov A.B.";
        reader3.ticket_number = 1237;
        reader3.faculty = "historical";
        reader3.birthday = "01.07.2001";
        reader3.phone_number = 123224;

    }
}
//    Book book1 = new Book("Sherlock Holmes", "Arthur Conan Doyle", 1890);
//    Book book2 = new Book("Jane Eyre", "Charlotte Brontë", 1847);
//    Book book3 = new Book("Gulliver's Travels", "Jonathan Swift", 1726);
//
//    Reader reader1 = new Reader("Petrov I.I.", 1235, "philological", "18.02.2000", 226874);
//    Reader reader2 = new Reader("Ivanov A.A.", 1236, "economic", "12.05.2001", 659874);
//    Reader reader3 = new Reader("Sidorov A.B.", 1237, "historical", "01.07.2001", 123224);
