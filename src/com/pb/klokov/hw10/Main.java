package com.pb.klokov.hw10;

import com.pb.klokov.hw3.Array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)  {
        NumBox<Number> nums = new NumBox<>(5);
        nums.add(0, new Number(1));
        nums.add(1, new Number(2));
        nums.add(2, new Number(3));
        nums.add(3, new Number(4));
        nums.add(4, new Number(5));

        //Попитка добавить элемент
        nums.add(5, new Number(6));
        System.out.println("Число массива по индекусу 0: " + nums.get(0).getNumber());
        System.out.println("К-во элементов массива: " + nums.length());
        System.out.println("Среднее значение элементов массива: " + nums.average());
        System.out.println("Сумма элеменов массива: " + nums.sum());
        System.out.println("Максимальний элемент массива undefined" );
    }
}
