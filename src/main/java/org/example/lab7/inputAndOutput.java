package org.example.lab7;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class inputAndOutput {

    /*First task*/
    public static int[] firstBinaryStreamExample(int[] array, String fileName){


        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(fileName))) {
            for (int num : array) {
                outputStream.writeInt(num);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при записи: " + e.getMessage());
        }

        int[] resultArray = new int[array.length];

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
    public static int[] secondBinaryStreamExample(int[] array, String fileName){


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int num : array) {
                writer.write(num + " ");
            }

        } catch (IOException e) {
            System.out.println("Ошибка при записи: " + e.getMessage());
        }
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
    public static int[] thirdBinaryStreamExample(int position, String fileName){
        int[] resultArray = new int[]{};
        try {
            RandomAccessFile file = new RandomAccessFile(fileName, "r");
            file.seek(position * 4);
            int nums = (int) (file.length() / 4) - position;

            resultArray = new int[nums];
            for (int i = 0; i < nums; i++) {
                resultArray[i] = file.readInt();
            }
            file.close();
        } catch (IOException e) {
            System.out.println("Ошибка при чтении: " + e.getMessage());
        }



        return resultArray;
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
