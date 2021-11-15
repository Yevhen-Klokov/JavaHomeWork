package com.pb.klokov.hw7;

public class Atelier {

        public static void main(String[] args) throws Exception {
        Clothes tshirt = new Tshirt(Size.L, 1000, "green");
        Clothes pants = new Pants(Size.M, 2000, "black");
        Clothes skirt = new Skirt(Size.S,1200, "red");
        Clothes tie = new Tie(Size.XS,500,"yellow");

        Clothes[] clothes = {tshirt,pants,skirt,tie};
        dressMan(clothes);
        dressWomen(clothes);

    }
    static void dressMan (Clothes[] clothes) {
        System.out.println("Мужская одежда:");
        for (Clothes clothe : clothes) {
            if (clothe instanceof ManClothes) {
                ((ManClothes) clothe).dressMan();
            }
        }
    }

    static void dressWomen (Clothes[] clothes) {
        System.out.println("Женская одежда:");
        for (Clothes clothe : clothes) {
            if (clothe instanceof WomenClothes) {
                ((WomenClothes) clothe).dressWomen();
            }
        }
    }


}
