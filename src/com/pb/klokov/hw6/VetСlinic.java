package com.pb.klokov.hw6;

public class VetСlinic {
    public static void main(String[] args) {
    Animal dog = new Dog();
    Animal cat = new Cat();
    Animal horse = new Horse();
    Animal [] animals = {dog, cat, horse};

//        System.out.println("Все животные");
//        for (int i = 0; i < animals.length; i++) {
//            System.out.print(animals[i]);
//        }
    Veterinarian vet = new Veterinarian();
        System.out.println("Отправляем животных к ветеренару:");
        for (int i = 0; i < animals.length; i++) {
            vet.treatAnimal(animals[i]);
        }
    }

}

