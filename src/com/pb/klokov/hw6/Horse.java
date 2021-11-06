package com.pb.klokov.hw6;

import java.util.Objects;

public class Horse extends Animal{
    String kind = "одомашненная"; //Дикая или Одомашненная, Одичалая
    String status = "элитная"; //Элитные или простые
    public Horse() {super("конь Буран", "сено", "в конюшне.");}

    @Override
    public void makeNoise() {

        System.out.println("Лошадь " + animal + " иржёт");
    }

    @Override
    public void eat() {

        System.out.println("Лошадь " + animal + " ест");
    }

    @Override
    public String toString() {
        return "Лошадь{" +
                "вид ='" + kind + '\'' +
                ", статус ='" + status + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Objects.equals(kind, horse.kind) && Objects.equals(status, horse.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, status);
    }
}
