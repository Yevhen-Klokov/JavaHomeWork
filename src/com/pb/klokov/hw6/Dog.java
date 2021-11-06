package com.pb.klokov.hw6;

import java.util.Objects;

public class Dog extends Animal{
    String breed = "сторожевой"; //порода (сторожевая, бойцовская ...)
    String breedName = "алабай"; //название породы
    public Dog() {super("Барбос", "мясо", "вдор");}

    public String getBreed() {
        return breed;
    }

    public String getBreedName() {
        return breedName;
    }

    @Override
    public void makeNoise() {
        System.out.println("Пёс " + animal + " лает");
    }

    @Override
    public void eat() {

        System.out.println("Пёс " + animal + " ест");
    }

    @Override
    public String toString() {
        return "Пёс {" +
                "тип породы='" + breed + '\'' +
                ", название породы='" + breedName + '\'' +
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

