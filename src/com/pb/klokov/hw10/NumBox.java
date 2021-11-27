package com.pb.klokov.hw10;

import java.util.Arrays;

public class NumBox<T extends Number> {

    private final T[] numbers;

    @SuppressWarnings("unchecked")

    public NumBox(int size) {
        numbers = (T[]) new Number[size];
    }

    public T get(int index) {
        return numbers[index];
    }

    public void add(int index, T number) {
        try {
            this.numbers[index] = number;
        } catch (Exception e) {
            System.out.println("Не возможно добавить элемент т.к. массив переполнен!");
        }
    }

    public int length() {
        int count = 0;
        for(T t : numbers){
            count++;
        }
        return count;
    }

    public double sum (){
        double sum = 0;
        for (T t : numbers){
            sum += t.number;
        }
        return sum;
    }

    public double average (){
        double sum = 0;
        for (T t : numbers){
            sum += t.number;
        }
        return sum / numbers.length;
    }

    }




