package org.example.lab7;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream {

    /*First task*/
    public static void inputStream(int[] array, String fileName) {

        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(fileName))) {
            for (int num : array) {
                outputStream.writeInt(num);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при записи: " + e.getMessage());
        }
    }

    public static int[] outputStream(String fileName) {

        int[] resultArray = new int[6];

        try (DataInputStream inputStream = new DataInputStream(new FileInputStream(fileName))) {
            for (int i = 0; i < resultArray.length; i++) {
                resultArray[i] = inputStream.readInt();
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении: " + e.getMessage());
        }
        return resultArray;
    }



    /*Second Task*/
    public static void inputStreamWithSpaces(int[] array, String fileName) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int num : array) {
                writer.write(num + " ");
            }

        } catch (IOException e) {
            System.out.println("Ошибка при записи: " + e.getMessage());
        }
    }

    public static int[] outputStreamWithSpaces(String fileName) {
        int[] resultArray = new int[]{};
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();

            if (line != null) {

                String[] numbers = line.trim().split("\\s+");
                resultArray = new int[numbers.length];
                for (int i = 0; i < numbers.length; i++) {
                    resultArray[i] = Integer.parseInt(numbers[i]);
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении: " + e.getMessage());
        }
        return resultArray;
    }

    /*third task*/
    public static int[] outputStreamWithPosition(int position, String fileName, int size) throws IOException {

        int[] array = new int[size];
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(fileName, "r")) {
            randomAccessFile.seek(position * 4);
            for (int i = 0; i < size; i++) {
                array[i] = randomAccessFile.readInt();
            }
        }
        return array;
    }

    public static List<String> getFiles(String directoryPath, String extension) {
        List<String> fileList = new ArrayList<>();

        File directory = new File(directoryPath);

        if (directory.isDirectory()) {
            File[] files = directory.listFiles((dir, name) -> name.endsWith(extension));

            if (files != null) {
                for (File file : files) {
                    fileList.add(file.getName());
                }
            } else {
                System.out.println("пустой каталог!");
            }
        } else {
            System.out.println(directoryPath + " это не каталог!");
        }

        return fileList;
    }
}
