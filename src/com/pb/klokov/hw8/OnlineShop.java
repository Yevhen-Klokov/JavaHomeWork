package com.pb.klokov.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        System.out.print("Регистрация в OnlineShop! \n Введите имя: ");
        Scanner scan1 = new Scanner(System.in);
        String setLogin = scan1.next();
        System.out.print("Введите пароль: ");
        Scanner scan2 = new Scanner(System.in);
        String setPassword = scan2.next();
        System.out.println("Подтвердите пароль: ");
        Scanner scan3 = new Scanner(System.in);
        String setPassword2 = scan3.next();

        //создаём объект класса
        Auth auth = new Auth(setLogin,setPassword,setPassword2);
        try {
            auth.signUp(setLogin,setPassword,setPassword);
        } catch (WrongLoginException e) {
            e.printStackTrace();
        } catch (WrongPasswordException e) {
            e.printStackTrace();
        }
    }
}
