package com.pb.klokov.hw6;

import java.util.Objects;

public class Cat extends Animal{
    String category = "короткошёрстный";
    String ear_type = "веслоухий";
    public Cat() {super("кот Муркот", "мышки", "в домe");}

    @Override
    public void makeNoise() {
        System.out.println("Кот " + animal + " мурчит");
    }

    @Override
    public void eat() {
        System.out.println("Кот " + animal + " ест");
    }

    @Override
    public String toString() {
        return "Кот{" +
                "категория='" + category + '\'' +
                ", вид ушей='" + ear_type + '\'' +
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
