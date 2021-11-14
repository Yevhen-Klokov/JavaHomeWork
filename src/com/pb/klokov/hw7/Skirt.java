package com.pb.klokov.hw7;

public class Skirt extends Clothes implements WomenClothes{

    public Skirt(Size size, Integer price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen(){
        System.out.println("Юбка: размер " + this.size + ", " + this.size.description + ", (евро размер " + this.size.euroSize + "), цена " + this.price + " грн., цвет " + this.color);
    }
}
