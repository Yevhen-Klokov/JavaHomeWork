package com.pb.klokov.hw6;

import java.lang.reflect.Constructor;

public class Veterinarian {

    public void treatAnimal(Animal animal){
        System.out.println("Приём ветиринара " + animal);
    }
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("com.pb.klokov.hw6.Veterinarian");
        Constructor constr = clazz.getConstructor();
        Object obj = constr.newInstance();
        if(obj instanceof Animal){
            ((Animal) obj).getAnimal();
        }


    }



}
