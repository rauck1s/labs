package org.example.lab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class CollectionsDemo {

    /*can be replaced "if": str.startsWith(symbol)*/
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
    static List<Set<Integer>> deletingSetsIntegerNumbers(List<Set<Integer>> setsIntNumber, Set <Integer> arrayNumber){
        List<Set<Integer>> resultSets = new ArrayList<>(setsIntNumber);
        for (int i = 0; i < resultSets.size(); i++) {
            Set<Integer> array = resultSets.get(i);
            if (array.equals(arrayNumber)) {
                resultSets.remove(array);
            }
        }
        return resultSets;
    }
}