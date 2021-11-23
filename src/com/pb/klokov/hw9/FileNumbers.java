package com.pb.klokov.hw9;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class FileNumbers {
    public static void createNumbersFile() throws IOException {
        //Удаляю файл если уже создано
        Files.deleteIfExists(Paths.get("C:\\JavaHomeWorks\\JavaHomeWork\\numbers.txt"));
        //создаём файл
        Path file = Files.createFile(Paths.get("C:\\JavaHomeWorks\\JavaHomeWork\\numbers.txt"));
        //создаём массив и заполняем
        int[][] array = new int[10][10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(99);
            }
        }
        //пишем массив
        try (Writer writer = new FileWriter("C:\\JavaHomeWorks\\JavaHomeWork\\numbers.txt")) {
            // Пишем в файл
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    writer.write(String.valueOf(array[i][j]));
                    writer.write(" ");
                }
                writer.write("\r\n");
            }

        } catch (Exception e) {
            System.out.println("Ошибка " + e.getStackTrace());
        }

    }

    public static void createOddNumbersFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\JavaHomeWorks\\JavaHomeWork\\numbers.txt"));
        List<String> lines = new ArrayList<>();
        while (br.ready()) {
            lines.add(br.readLine());
        }

        Integer[][] array = new Integer[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                String[] line = lines.get(i).split(" ");
                array[i][j] = Integer.parseInt(line[j]);
            }
        }
        //замена нечётных на 0
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] % 2 != 0) {
                    array[i][j] = 0;
                }
            }
        }
        //пишем массив
        try (Writer writer = new FileWriter("C:\\JavaHomeWorks\\JavaHomeWork\\odd-numbers.txt")) {
            // Пишем в файл
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    writer.write(String.valueOf(array[i][j]));
                    writer.write(" ");
                }
                writer.write("\r\n");
            }

        } catch (Exception e) {
            System.out.println("Ошибка " + e.getStackTrace());
        }
    }

    public static void main(String[] args) throws IOException {
        createNumbersFile();
        createOddNumbersFile();
//        System.out.println("Был ли файл успешно создан?");
//        System.out.println(Files.exists(Paths.get("C:\\JavaHomeWorks\\JavaHomeWork\\numbers.txt")));
//        System.out.println(Files.size(Paths.get("C:\\JavaHomeWorks\\JavaHomeWork\\numbers.txt")));

    }
}


