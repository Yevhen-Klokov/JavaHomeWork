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

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void makeNoise(Animal animal){

        System.out.println(animal + " подаёт голос");
    }

    public void eat(Animal animal){
        System.out.println(animal + " ест");
    }

    public void sleep(Animal animal){
        System.out.println(animal + " спит");
    }

    @Override
    public String toString() {
        return "Животное: " + animal +
                ", ест " + food +
                ", живёт " + location + '\n';
    }
}
