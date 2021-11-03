package com.pb.klokov.hw6;

import java.util.Objects;

public class Dog extends Animal{
    String breed; //порода (сторожевая, бойцовская ...)
    String breedName; //название породы

    @Override
    public void makeNoise(Animal animal) {
        System.out.println("Пёс " + animal + "подал голос");
    }

    @Override
    public void eat(Animal animal) {
        System.out.println("Пёс " + animal + "ест");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", breedName='" + breedName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(breed, dog.breed) && Objects.equals(breedName, dog.breedName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed, breedName);
    }
}

