package org.example.lab7;

import java.io.*;

public class inputAndOutput {

    /*First task*/
    static int[] firstBinaryStreamExample(int[] array, String fileName){


        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(fileName))) {
            for (int num : array) {
                outputStream.writeInt(num);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        int[] resultArray = new int[array.length];

        try (DataInputStream inputStream = new DataInputStream(new FileInputStream(fileName))) {
            for (int i = 0; i < resultArray.length; i++) {
                resultArray[i] = inputStream.readInt();
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении из файла: " + e.getMessage());
        }
        return resultArray;
    }

    /*Second Task*/
    static int[] secondBinaryStreamExample(int[] array, String fileName){


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int num : array) {
                writer.write(num + " ");
            }

        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
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
            System.out.println("Ошибка при чтении из файла: " + e.getMessage());
        }

        return resultArray;
    }

    /*third task*/
    static int[] thirdBinaryStreamExample(int position, String fileName){

        int[] resultArray = new int[]{};



        return resultArray;
    }
}
