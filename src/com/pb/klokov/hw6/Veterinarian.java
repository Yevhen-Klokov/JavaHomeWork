package com.pb.klokov.hw6;

public class Veterinarian extends Animal{

    public void treatAnimal(Animal animal){
        System.out.println("Еда " + animal + " это " + getFood() + ", " + " место проживания " + getLocation());
    }
}
