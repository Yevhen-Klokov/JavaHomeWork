package com.pb.klokov.hw7;

public class Pants extends Clothes implements ManClothes, WomenClothes{
    public void dressMan(){
        System.out.println("Штаны, размер " + size + ", цена "+ price + ", цвет " + color);
    }
    public void dressWomen(){
        System.out.println("Штаны, размер " + size + ", цена "+ price + ", цвет " + color);
    }

}
