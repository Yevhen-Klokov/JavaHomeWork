package com.pb.klokov.hw6;

import java.lang.reflect.Constructor;

public class VetСlinic {
    public static void main(String[] args) throws Exception{
    Animal dog = new Dog();
    Animal cat = new Cat();
    Animal horse = new Horse();
    Animal [] animals = {dog, cat, horse};

//        System.out.println("Все животные");
//        for (int i = 0; i < animals.length; i++) {
//            System.out.print(animals[i]);
//        }
//    Veterinarian vet = new Veterinarian();
//        System.out.println("Отправляем животных к ветеринару:");
//        for (int i = 0; i < animals.length; i++) {
//            vet.treatAnimal(animals[i]);
//        }
//        System.out.println(Veterinarian.class.getName());
//        com.pb.klokov.hw6.Veterinarian

    Class clazz = Class.forName("com.pb.klokov.hw6.Veterinarian");
        Constructor constr = clazz.getConstructor();
        Object obj = constr.newInstance();
        if(obj instanceof Veterinarian){
            for (int i = 0; i < animals.length; i++) {
                Veterinarian.treatAnimal(animals[i]);
            }
        }
    }

}

