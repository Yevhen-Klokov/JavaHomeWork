package com.pb.klokov.hw6;

import java.util.Objects;

public class Horse extends Animal{
    String kind; //Дикая или Одомашненная, Одичалая
    String status; //Элитные или простые

    @Override
    public void makeNoise(Animal animal) {
        System.out.println("Лошадь " + animal + "подал голос");
        super.makeNoise(animal);
    }

    @Override
    public void eat(Animal animal) {
        System.out.println("Лошадь " + animal + "ест");
    }

    @Override
    public String toString() {
        return "Horse{" +
                "kind='" + kind + '\'' +
                ", status='" + status + '\'' +
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
