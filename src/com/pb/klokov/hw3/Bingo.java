package com.pb.klokov.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        System.out.println("Вы запустили игру Bingo!");
        System.out.println("Загадано число в диапазоне от 0 до 100, пробробуйте его отгадать!");
        System.out.println("Для выхода из программы введите -1.");
        // загадываем число
        Random random = new Random();
        int rand_num = random.nextInt(101);
        int counter = 0;           // Счетчик попыток.
        Scanner scan = new Scanner(System.in);
        //System.out.println("Рандомное число " + rand_num + ":");

        while (counter >= 0 ) { //безлим попыток
            counter++;
            System.out.println("Попытка " + counter + ":");
            Integer value = scan.nextInt();

            if (value == -1) {
                break;
            }

            if (value < rand_num )  {
                System.out.println("Введено число меньше загаданного!");
                continue;
            }
            if (value > rand_num )  {
                System.out.println("Введено число больше загаданного!");
                continue;
            }
            System.out.println("Поздравляем, Вы угадали с " + counter + " попытки!");
            break;
        }

        System.out.println("Конец игры!");
    }
}

