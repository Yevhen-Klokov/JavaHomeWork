package com.pb.klokov.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        System.out.print("Регистрация в OnlineShop! \n Введите имя (login): ");
        Scanner scan1 = new Scanner(System.in);
        String setLogin = scan1.next();
        System.out.print("Введите пароль (password): ");
        Scanner scan2 = new Scanner(System.in);
        String setPassword = scan2.next();

        //создаём объект класса
        Auth auth = new Auth(setLogin,setPassword);
        auth.signUp(setLogin,setPassword);

    }
}
