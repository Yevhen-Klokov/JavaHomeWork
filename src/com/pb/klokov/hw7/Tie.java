package com.pb.klokov.hw7;

public class Tie extends Clothes implements ManClothes{
    public void dressMan(){
        System.out.println("Галстук, размер " + size + ", цена "+ price + ", цвет " + color);
    }
}
