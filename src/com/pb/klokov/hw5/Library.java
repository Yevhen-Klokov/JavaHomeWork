package com.pb.klokov.hw5;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

        book1.setTitle("Приключения Шерлока Холмса");
        book1.setAuthor("Артур Конан Дойл");
        book1.setYear(1890);

        book2.setTitle("Джейн Эйр");
        book2.setAuthor("Шарлотта Бронте");
        book2.setYear(1847);

        book3.setTitle("Путешествия Гулливера");
        book3.setAuthor("Джонатан Свифт");
        book3.setYear(1726);

        Reader reader1 = new Reader();
        Reader reader2 = new Reader();
        Reader reader3 = new Reader();

        reader1.setFIO("Petrov I.I.");
        reader1.setTicket_number(1235);
        reader1.setFaculty("philological");
        reader1.setBirthday("18.02.2000");
        reader1.setPhone_number(226874);

        reader2.setFIO("Ivanov A.A.");
        reader2.setTicket_number(1236);
        reader2.setFaculty("economic");
        reader2.setBirthday("12.05.2001");
        reader2.setPhone_number(659874);

        reader3.setFIO("Sidorov A.B.");
        reader3.setTicket_number(1237);
        reader3.setFaculty("historical");
        reader3.setBirthday("01.07.2001");
        reader3.setPhone_number(123224);

        reader1.takeBook(reader1.getFIO(),3);
        reader1.takeBook(reader1.getFIO(), book1.getTitle());

    }
}
//    Book book1 = new Book("Sherlock Holmes", "Arthur Conan Doyle", 1890);
//    Book book2 = new Book("Jane Eyre", "Charlotte Brontë", 1847);
//    Book book3 = new Book("Gulliver's Travels", "Jonathan Swift", 1726);
//
//    Reader reader1 = new Reader("Petrov I.I.", 1235, "philological", "18.02.2000", 226874);
//    Reader reader2 = new Reader("Ivanov A.A.", 1236, "economic", "12.05.2001", 659874);
//    Reader reader3 = new Reader("Sidorov A.B.", 1237, "historical", "01.07.2001", 123224);