package org.example.lab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionsDemo {

    /*in line 11 can be replaced: str.startsWith(symbol)*/
    static int sortByFirstSymbol(List<String> strings, char symbol){
        int result = 0;
        for(String str: strings){
            if (symbol == str.charAt(0)) {
                result++;
            }
        }
        return result;
    }
    /*can be replaced "for": resultList.removeIF(people -> people.equals(human));*/
    static List<Human> deleteHumanInList(List<Human> listHuman, Human human){
        List<Human> resultList = new ArrayList<>(listHuman);
        for (int i = 0; i < resultList.size(); i++) {
            Human people = resultList.get(i);
            if (people.equals(human)) {
                resultList.remove(people);
            }
        }
        return resultList;
    }
    static List<Integer[]> deletingSetsIntegerNumbers(List<Integer[]> setsIntNumber, Integer[] arrayNumber){
        List<Integer[]> resultSets = new ArrayList<>(setsIntNumber);
        for (int i = 0; i < resultSets.size(); i++) {
            Integer[] array = resultSets.get(i);
            if (Arrays.equals(array, arrayNumber)) {
                resultSets.remove(array);
            }
        }
        return resultSets;
    }
}