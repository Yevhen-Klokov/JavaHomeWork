package com.pb.klokov.hw7;

public abstract class Clothes {
    Size size;
    Integer price;
    String color;

    public Clothes(Size size, Integer price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }


}
