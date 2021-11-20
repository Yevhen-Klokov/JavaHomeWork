package com.pb.klokov.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        System.out.print("Регистрация в OnlineShop! \n Введите имя: ");
        Scanner scan = new Scanner(System.in);
        String setLogin = scan.nextLine();
        System.out.print("Введите пароль: ");
        String setPassword = scan.nextLine();
        System.out.print("Подтвердите пароль: ");
        String setPassword2 = scan.nextLine();

        //создаём объект класса
        Auth auth = new Auth(setLogin,setPassword,setPassword2);
            try {
                auth.signUp(setLogin, setPassword, setPassword);
            } catch (WrongLoginException e) {
                System.out.println("Ввведено некорректный логин! Длинна должна быть от 5 до 20 символов и содержать только латинские буквы и цифры.");
            return;
            } catch (WrongPasswordException c) {
                System.out.println("Ввведено некорректный пароль! Длинна более 5 символов, только латинские буквы, цифры и знак подчеркивания. Также пароль и подтверждение пароля должны совпадать.");
            return;
            }

        System.out.print("Выполните вход в личный кабинет OnlineShop! \n Введите имя: ");
        Scanner scan4 = new Scanner(System.in);
        String loginIn = scan4.next();
        System.out.print("Введите пароль: ");
        Scanner scan5 = new Scanner(System.in);
        String passwordIn = scan4.next();
                try {
                    auth.signIn(loginIn, passwordIn);
                } catch (WrongLoginException e) {
                    System.out.println("Введено неверно логин или пароль!");
                }
            }
    }
