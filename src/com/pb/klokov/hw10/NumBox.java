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
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка! Массив переполнен!");
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
        double sum = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i].doubleValue();
        }
        return sum;
    }

    public double average (){
        double sum = 0.0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i].doubleValue();
        }
        return sum / numbers.length;
    }
    public T max() {
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    @Override
    public String toString() {
        return "NumBox{" +
                "numbers=" + Arrays.toString(numbers) +
                '}';
    }
}




