package com.pb.klokov.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes{

    public void dressMan(){
        System.out.println("Футблока, размер " + size + ", цена "+ price + ", цвет " + color);
    }
    public void dressWomen(){
        System.out.println("Футблока, размер " + size + ", цена "+ price + ", цвет " + color);
    }

    }

