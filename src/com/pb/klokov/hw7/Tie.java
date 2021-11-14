package com.pb.klokov.hw7;

public class Tie extends Clothes implements ManClothes{

    public Tie(Size size, Integer price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan(){
        System.out.println("Галстук: размер " + this.size + ", " + this.size.description + ", (евро размер " + this.size.euroSize + "), цена " + this.price + " грн., цвет " + this.color);
    }
}
