package com.pb.klokov.hw7;

public class Atelier {
    public static void main(String[] args) throws Exception {
        Clothes tshirt = new Tshirt(Size.L, 1000, "green");
        Clothes pants = new Pants(Size.M, 2000, "black");
        Clothes skirt = new Skirt(Size.S,1200, "red");
        Clothes tie = new Tie(Size.XS,500,"yellow");

        Clothes[] clothes = {tshirt,pants,skirt,tie};

//        ((Tshirt) tshirt).dressMan();
//        ((Pants) pants).dressMan();
        System.out.println("Мужская одежда:");
        for(Clothes clothes1 : clothes){
            if(clothes1 instanceof Tshirt){
                ((Tshirt) tshirt).dressMan();
            }
            else if(clothes1 instanceof Pants){
                ((Pants) pants).dressMan();
            }
            else if(clothes1 instanceof Tie){
                ((Tie) tie).dressMan();
            }

        }
        System.out.println("");

        System.out.println("Женская одежда:");
        for(Clothes clothes1 : clothes){
            if(clothes1 instanceof Tshirt){
                ((Tshirt) tshirt).dressWomen();
            }
            else if(clothes1 instanceof Pants){
                ((Pants) pants).dressWomen();
            }
            else if(clothes1 instanceof Skirt){
                ((Skirt) skirt).dressWomen();
            }

        }

    }

    public static void dressMan(Clothes[] clothes){
    };
    public static void dressWomen(Clothes[] clothes){
    }

}
