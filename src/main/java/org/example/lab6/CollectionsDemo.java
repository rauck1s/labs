package org.example.lab6;

import java.util.List;

public class CollectionsDemo {
    static int sortByFirstSymbol(List<String> strings, char symbol){
        int result = 0;
        for(String str: strings){
            if (symbol == str.charAt(0)) {
                result++;
            }
        }
        return result;
    }
}
/*str.startsWith(symbol)*/