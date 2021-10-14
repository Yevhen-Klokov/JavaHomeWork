package com.pb.klokov.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать! Вы запустили программу определения интервала.");
        int operand;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целочисленное значение от 0 до 100:");
        operand = scan.nextInt();
        if(operand >= 0 && operand <= 14){
            System.out.println("Введённое число попадает в интервал [0-14]");
        }
        else if(operand >= 15 && operand <= 35){
            System.out.println("Введённое число попадает в интервал [15-35]");
        }
        else if(operand >= 36 && operand <= 50){
            System.out.println("Введённое число попадает в интервал [36-50]");
        }
        else if(operand >= 51 && operand <= 100){
            System.out.println("Введённое число попадает в интервал [51-100]");
        }
        else if(operand <0 || operand >100 ) {
            System.out.println("Введённое число не попадает в существующие интервалы!");
        }
    }
}
