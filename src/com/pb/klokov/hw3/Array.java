package com.pb.klokov.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] array= new int[10];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < array.length; i++){
            System.out.println("Введите значение индекса " + i +" :");
            array[i] = scan.nextInt();
        }

        //вывод массива на экран
        System.out.println("Выводим введённый массив чисел:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

        //вывод суммы чисел массива на экран
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }

        System.out.println("\nСумма чисел массива: " + sum); //тут я что-то не понял почему записывается в одну строку, сделал перенос

        //подсчёт к-ва положительных элементов
        int count = 0;
        for(int i = 0; i <array.length; i++){
            if(array[i] >= 0){
                count++;
            }
        }
        System.out.println("К-во положительных элементов: " + count);

        //сортировка
        for (int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++){
                if(array[j] < array[i]) {
                    int x = array[j];
                    int y = array[i];
                    array[i] = x; //меняем местами
                    array[j] = y; //меняем местами
                }
            }
        }
        //вывод  отсортированного массива на экран
        System.out.println("Выводим отсортированного методом пузырька массива:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

    }
}
