package com.pb.klokov.hw6;

public class Animal {
     String animal;
     String food;
     String location;

    public Animal(String animal, String food, String location) {
        this.animal = animal;
        this.food = food;
        this.location = location;
    }

    public String getAnimal() {
        return animal;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public void makeNoise(){
        System.out.println(animal + " подаёт голос");
    }

    public void eat(){
        System.out.println(animal + " ест");
    }

    public void sleep(){
        System.out.println(animal + " спит");
    }

    @Override
    public String toString() {
        return "Животное: " + animal +
                ", ест " + food +
                ", живёт " + location + '\n';
    }
}
