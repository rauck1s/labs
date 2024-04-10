package org.example.lab2;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProcessor {
    public static String returnNewLine(String line, int n)  {
        if (n < 0 || line == null) {
            throw new IllegalArgumentException("Exception: n < 0!");
        }
        StringBuilder lineResult = new StringBuilder();
        for (int i = 0; i < n; i++) {
            lineResult.append(line);
        }
        return lineResult.toString();
    }
    public static int inputLine(String lineOne, String lineTwo)  {
        if (Objects.equals(lineTwo, "") || lineTwo == null ) {
            throw new IllegalArgumentException("Exception: Second line is empty or null!");
        }
        else if (lineOne == null){
            throw new IllegalArgumentException("Exception: First line is null!");
        }
        else {
            return lineOne.split(lineTwo, -1).length - 1;//разбивает строку по нашей строке, -1 аргумент чтоб получить все подстроки как в конце так и в начале
        }
    }

    public static String remove(String line)  {
        if(line == null){
            throw new IllegalArgumentException("Exception: line is null!");
        }
        String resultLine = "";
        for(int i =0; i< line.length(); i ++){
            char symbol = line.charAt(i);
            int helpCase = symbol - '0';
            switch (helpCase) {
                case 1 -> {
                    resultLine += "One";
                }
                case 2 -> {
                    resultLine += "Two";
                }
                case 3 -> {
                    resultLine +="Three";
                }
                default -> resultLine +=symbol;
            }
        }
        return resultLine;
    }

    public static String delete(String line) {
        if(line == null){
            throw new IllegalArgumentException("Exception: line is null!");
        }
        StringBuilder resultLine = new StringBuilder(line);
        for (int i = 1; i < resultLine.length(); i++) {
            resultLine = resultLine.deleteCharAt(i);
        }
        return resultLine.toString();
    }

    public static String reverseString(String line) {
        if(line == null){
            throw new IllegalArgumentException("Exception: line is null!");
        }
        String[] words = line.split("\\s+", -1);
        String[] spaces = line.split("\\S+", -1);
        StringBuilder reversed = new StringBuilder();
        int spaceIndex = 0;
        for (int i = words.length - 1; i >= 0; i--) {
            if (spaceIndex < spaces.length) {
                reversed.append(spaces[spaceIndex]);
                spaceIndex++;
            }
            reversed.append(words[i]);
        }
        return reversed.toString();
    }

    public static String searchHex(String line) {
        if(line == null){
            throw new IllegalArgumentException("Exception: line is null!");
        }
        String hexRegex = "0x[A-Fa-f0-9]+";
        Pattern pattern = Pattern.compile(hexRegex);
        Matcher matcher = pattern.matcher(line);
        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            String hex = matcher.group();
            int decimal = Integer.parseInt(hex.substring(2), 16);
            matcher.appendReplacement(result, Integer.toString(decimal));
        }
        matcher.appendTail(result);
        return result.toString();
    }
}