package com.pb.klokov.hw2;

import java.awt.peer.SystemTrayPeer;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать! Вы запустили калькулятор!");
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;
        System.out.println("Введи первое значение:");
        operand1 = scan.nextInt();
        System.out.println("Введи второе значение:");
        operand2 = scan.nextInt();
        System.out.println("Введи знак арифметической операции:");
        sign = scan.next();
        //преобразовуем строчное значение в символьное
        char sign2 = sign.charAt(0);
        //проверяем введённую оперецию и выполняем действие
        switch (sign2) {
            case '+':
                System.out.println("Результат: " + (operand1 + operand2));
                break;
            case '-':
                System.out.println("Результат: " + (operand1 - operand2));
                break;
            case '*':
                System.out.println("Результат: " + operand1 * operand2);
                break;
            case '/':
                if(operand2 == 0) {
                    System.out.println("Ошибка! Деление на 0 запрещено!");
                }
                else {
                    System.out.println("Результат: " + operand1 / operand2);
                }
                break;
            default:
                System.out.println("Ошибка! Введено неверный знак арифметической операции! Повторите ещё раз действие выбрав одну из доступных операций: '+' сложение, '-' вычитание, '*'умножение, -/- деление.");

        }
    }
}

