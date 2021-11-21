package com.pb.klokov.hw9;

import java.io.IOException;
import java.io.Writer;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class FileNumbers {
    public static void createNumbersFile() throws IOException {
        //Удаляю файл если уже создано
        Files.deleteIfExists(Paths.get("C:\\JavaHomeWorks\\JavaHomeWork\\numbers.txt"));
        //создаём файл
        Path file = Files.createFile(Paths.get("C:\\JavaHomeWorks\\JavaHomeWork\\numbers.txt"));
//        //создаём массив и заполняем
        int[] array = new int[100];
        Random random = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
        }

        String data = array.toString();
        System.out.println(data);
        // Creates a Writer using FileWriter
        try (Writer writer = new FileWriter("C:\\JavaHomeWorks\\JavaHomeWork\\numbers.txt")) {

            // Writes string to the file
            writer.write(data);

        } catch (Exception e) {
            System.out.println("Ошибка " + e.getStackTrace());
        }
    }

    public static void main(String[] args) throws IOException {
        createNumbersFile();
        System.out.println("Был ли файл успешно создан?");
        System.out.println(Files.exists(Paths.get("C:\\JavaHomeWorks\\JavaHomeWork\\numbers.txt")));
        System.out.println(Files.size(Paths.get("C:\\JavaHomeWorks\\JavaHomeWork\\numbers.txt")));
    }
    }


