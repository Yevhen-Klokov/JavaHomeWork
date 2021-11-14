package com.pb.klokov.hw7;

public class Pants extends Clothes implements ManClothes, WomenClothes{

    public Pants(Size size, Integer price, String color) {
        super(size, price, color);
    }
    @Override
    public void dressMan(){
        System.out.println("Штаны мужские: размер " + this.size + ", " + this.size.description + ", (евро размер " + this.size.euroSize + "), цена " + this.price + " грн., цвет " + this.color);
    }
    @Override
    public void dressWomen(){
        System.out.println("Штаны женские: размер " + this.size + ", " + this.size.description + ", (евро размер " + this.size.euroSize + "), цена " + this.price + " грн., цвет " + this.color);
    }

}
