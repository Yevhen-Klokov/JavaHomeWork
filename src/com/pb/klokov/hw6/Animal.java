package com.pb.klokov.hw6;

public class Animal {
    private String food;
    private String location;

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
}
