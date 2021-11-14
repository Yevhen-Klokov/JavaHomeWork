package com.pb.klokov.hw7;

import java.lang.reflect.Constructor;

public class Atelier {
    public static void main(String[] args) throws Exception {
        Clothes tshirt = new Tshirt(Size.L, 1000, "green");
        Clothes pants = new Pants(Size.M, 2000, "black");
        Clothes skirt = new Skirt(Size.S,1200, "red");
        Clothes tie = new Tie(Size.XS,500,"yellow");

        Clothes[] clothes = {tshirt,pants,skirt,tie};

        ((Tshirt) tshirt).dressMan();
        ((Pants) pants).dressMan();

    }

    public static void dressMan(Clothes[] clothes){
    };
    public static void dressWomen(Clothes[] clothes){
    }

}
