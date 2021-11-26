package com.pb.klokov.hw10;

import java.util.Random;

public class NumBox<T extends Number> {

private final T[] numbers;
@SuppressWarnings("unchecked")

    public NumBox(int size) {
        numbers = (T[]) new Number[size];
}
    public T get(int index){
        return numbers[index];
    }
    public void set(int index, T number){
    this.numbers[index] = number;
    }

    public void add(T num){
        for(int i = 0; i < numbers.length; i++){
            Random random = new Random();
            try {
                numbers[i] = get(i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}


