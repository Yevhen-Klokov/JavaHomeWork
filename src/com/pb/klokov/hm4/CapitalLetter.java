package com.pb.klokov.hm4;

import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        System.out.println("Введите текст:");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String[] textSplit;
        textSplit = text.split(" ");
        String textCapital = "";
        for(int i = 0; i <  textSplit.length; i++)
        {
            textCapital += textSplit[i].substring(0, 1).toUpperCase() + textSplit[i].substring(1) + " ";
        }
        System.out.println(textCapital);
    }
}

