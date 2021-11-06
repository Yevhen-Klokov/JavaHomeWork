package com.pb.klokov.hw6;

public class Veterinarian {
    public void treatAnimal(Animal animal){
        System.out.println("У ветеренара на приёме животное: "+ animal.getAnimal() + ", еда - " + animal.getFood() + ", живёт - " + animal.getLocation());

    }
}


