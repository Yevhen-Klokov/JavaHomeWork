package com.pb.klokov.hw5;

public class Library {
    public static void main(String[] args) {

        //библиотека
        Book[] booksNew = {
                new Book("Приключения Шерлока Холмса","Артур Конан Дойл",1890),
                new Book("Джейн Эйр","Артур Конан Дойл",1890),
                new Book("Путешествия Гулливера","Джонатан Свифт",1726)
        };

        //читатели
        Reader[] readersNew = {
                new Reader("Петров I.I.",1235,"филологический","18.02.2000",226874),
                new Reader("Иванов A.A.",1236,"экономический","12.05.2001",659874),
                new Reader("Сидоров A.B.",1237,"исторический","01.07.2001",123224)
        };

        System.out.println("Книги в библиотеке");
        for (int i = 0; i < booksNew.length; i++) {
            System.out.print(booksNew[i]);
        }

        System.out.println("\nЧитатели библиотеки");
        for (int j = 0; j < readersNew.length; j++) {
            System.out.print(readersNew[j]);
        }
        System.out.println("\nПервый вывод takeBook");
        readersNew[0].takeBook(3);

        System.out.println("\nВторой вывод takeBook");
        readersNew[0].takeBook(booksNew[0].getTitle(),booksNew[1].getTitle());

        System.out.println("\nТретий вывод takeBook");
        readersNew[0].takeBook(booksNew[0].bookInfo(),booksNew[1].bookInfo(),booksNew[2].bookInfo());

        System.out.println("\nПервый вывод returnBook");
        readersNew[0].returnBook(3);

        System.out.println("\nВторой вывод returnBook");
        readersNew[0].returnBook(booksNew[0].getTitle(),booksNew[1].getTitle());

        System.out.println("\nТретий вывод returnBook");
        readersNew[0].returnBook(booksNew[0].bookInfo(),booksNew[1].bookInfo(),booksNew[2].bookInfo());

    }
    }
