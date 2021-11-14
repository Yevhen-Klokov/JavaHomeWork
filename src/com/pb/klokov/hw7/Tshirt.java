package com.pb.klokov.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes{

    public Tshirt(Size size, Integer price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan(){
        System.out.println("Футблока мужская: размер " + this.size + ", " + this.size.description + ", (евро размер " + this.size.euroSize + "), цена " + this.price + " грн., цвет " + this.color);
    }
    @Override
    public void dressWomen(){
        System.out.println("Футблока женская: размер " + this.size + ", " + this.size.description + ", (евро размер " + this.size.euroSize + "), цена " + this.price + " грн., цвет " + this.color);
    }

    }

