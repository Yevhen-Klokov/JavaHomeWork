package com.pb.klokov.hw10;

public class Main {
    public static void main(String[] args) {
        NumBox<Number> nums = new NumBox<>(5);
        nums.set(0, new Number(1));
        nums.set(1, new Number(2));
        nums.set(2, new Number(3));
        nums.set(3, new Number(4));
        nums.set(4, new Number(5));

        Number n1 = nums.get(0);
        System.out.println(n1.getNumber());

    }
}
