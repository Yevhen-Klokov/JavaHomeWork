package com.pb.klokov.hw6;

public class VetСlinic {
    public static void main(String[] args) {
    Animal[] animals = {
            new Animal("Cat", "мышей", "в домe "),
            new Animal("пёс Барбос", "мясо", "во дворе "),
            new Animal("лошадь Буран", "сено", "в загоне ")
    };

        System.out.println("Все животные");
        for (int i = 0; i < animals.length; i++) {
            System.out.print(animals[i]);
        }

    }

}

