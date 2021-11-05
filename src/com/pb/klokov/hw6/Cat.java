package com.pb.klokov.hw6;

import java.util.Objects;

public class Cat extends Animal{
    String category; //короткошёрстные или длинношёрстные
    String ear_type; //веслоухие или не веслоухие

    public Cat(String animal, String food, String location, String category, String ear_type) {
        super(animal, food, location);
        this.category = "короткошёрстный";
        this.ear_type = "веслоухий";
    }

    @Override
    public void makeNoise(Animal animal) {
        System.out.println("Кот " + animal + "подал голос");
    }

    @Override
    public void eat(Animal animal) {
        System.out.println("Кот " + animal + "ест");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "category='" + category + '\'' +
                ", ear_type='" + ear_type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(category, cat.category) && Objects.equals(ear_type, cat.ear_type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, ear_type);
    }
}