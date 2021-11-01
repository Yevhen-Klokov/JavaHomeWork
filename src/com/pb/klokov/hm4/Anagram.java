package com.pb.klokov.hm4;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    //метод сравнения массивов
    static String method (String line1, String line2){

        //переводим строки в нижний регистр
        String line1New = line1.toLowerCase();
        String line2New = line2.toLowerCase();

        //заменяем запятые на пробел
        String l1 = line1New.replaceAll("[()?:!.,;{}-]","");
        String l2 = line2New.replaceAll("[()?:!.,;{}-]", "");

        //строки в массивы
        char str1[] = l1.toCharArray();
        char str2[] = l2.toCharArray();

        //сортируем
        Arrays.sort(str1);
        Arrays.sort(str2);

        //проверяем
        String result;
        Boolean res = Arrays.equals(str1, str2);
        if(res == true){
            result = line1 + " и " + line2 + " - это анаграмма ";
        }
        else {
            result = line2 + " и " + line1 + " - это не анаграмма ";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Программа для определения является ли вторая строка анаграммой первой!");
        System.out.println("Введите первую строку:");
        Scanner scan = new Scanner(System.in);
        String line1 = scan.nextLine();
        System.out.println("Введите вторую строку:");
        String line2 = scan.nextLine();

        //передаём параметры в метод для проверки
        String anagr = method(line1,line2);

        //Выводим результат проверки на анограмму
        System.out.println(anagr);

    }
}


