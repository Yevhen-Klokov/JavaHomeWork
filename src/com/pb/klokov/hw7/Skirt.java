package com.pb.klokov.hw7;

public class Skirt extends Clothes implements WomenClothes{

    public void dressWomen(){
        System.out.println("Юбка, размер " + size + ", цена "+ price + ", цвет " + color);
    }
}
