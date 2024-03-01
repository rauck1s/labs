package org.example.lab6;

import org.example.lab6.classes.Human;
import org.example.lab6.collections.CollectionsDemo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CollectionsDemoTest {

    /*First Task*/
    @Test
    void sortByFirstSymbol() {
        String firstLine = "qwert";
        String secondLine = "werq";
        String thirdLine = "eqwer";
        String fourthLine = "qqwert";
        String fifthLine = "01";
        List<String> forSortByFirstSymbol =new ArrayList<>();
        forSortByFirstSymbol.add(firstLine);
        forSortByFirstSymbol.add(secondLine);
        forSortByFirstSymbol.add(thirdLine);
        forSortByFirstSymbol.add(fourthLine);
        forSortByFirstSymbol.add(fifthLine);
        assertEquals(2, CollectionsDemo.sortByFirstSymbol(forSortByFirstSymbol, 'q'));
        assertEquals(1, CollectionsDemo.sortByFirstSymbol(forSortByFirstSymbol, 'e'));
        assertEquals(1, CollectionsDemo.sortByFirstSymbol(forSortByFirstSymbol, '0'));
    }



    /*Third task*/
    @Test
    void deleteHumanInList() {

        Human first = new Human("dimas", "milk", "void", 34);
        Human second = new Human("oleg", "servich", "longling", 11);
        Human third = new Human("ritka", "milk", "narov", 23);
        Human fourth = new Human("dima", "milk", "volas", 10 );
        Human fifth = new Human("andrey", "supchik", "aka", 19);

        Human removeHuman = new Human("ritka", "milk", "narov", 23);

        List<Human> forDeleteHumaninList = new ArrayList<>();
        forDeleteHumaninList.add(first);
        forDeleteHumaninList.add(second);
        forDeleteHumaninList.add(third);
        forDeleteHumaninList.add(fourth);
        forDeleteHumaninList.add(fifth);

        List<Human> listForAssert = new ArrayList<>();
        listForAssert.add(first);
        listForAssert.add(second);
        listForAssert.add(fourth);
        listForAssert.add(fifth);

        assertEquals(listForAssert, CollectionsDemo.deleteHumanInList(forDeleteHumaninList, removeHuman));

    }

    /*Fourth task*/
    @Test
    void deletingSetsIntegerNumbers() {

        Set<Integer> setInput = new HashSet<>();
        setInput.add(10);
        setInput.add(20);
        setInput.add(30);

        List<Set<Integer>> listInput = new ArrayList<>();

        Set<Integer> firstSet = new HashSet<>();
        firstSet.add(5);
        firstSet.add(10);
        firstSet.add(15);

        Set<Integer> secondSet = new HashSet<>();
        secondSet.add(3);
        secondSet.add(6);
        secondSet.add(9);

        Set<Integer> thirdSet = new HashSet<>();
        thirdSet.add(10);
        thirdSet.add(20);
        thirdSet.add(30);

        listInput.add(firstSet);
        listInput.add(secondSet);
        listInput.add(thirdSet);

        List<Set<Integer>> output = new ArrayList<>();
        output.add(firstSet);
        output.add(secondSet);

        assertEquals(output, CollectionsDemo.deletingSetsIntegerNumbers(listInput, setInput));

    }

    /*Seventh task*/
    @Test
    void humanById(){

        Map<Integer, Human> inputMap = new HashMap<>();
        inputMap.put(1, new Human("rika", "milk", "void", 34));
        inputMap.put(2, new Human("ri", "servich", "longling", 11));
        inputMap.put(3, new Human("ritka", "milk", "narov", 23));
        inputMap.put(4, new Human("ritka", "milk", "narov", 23));
        inputMap.put(5, new Human("adf", "milk", "narov", 23));

        Set<Integer> inputSet = new HashSet<>();
        inputSet.add(1);
        inputSet.add(3);
        inputSet.add(5);

        Set<Human> outputSet = new HashSet<>();
        outputSet.add( new Human("rika", "milk", "void", 34));
        outputSet.add( new Human("ritka", "milk", "narov", 23));
        outputSet.add( new Human("adf", "milk", "narov", 23));

        assertEquals(outputSet,CollectionsDemo.humanById(inputMap,inputSet));
    }

    /*Eight task*/
    @Test
    void sortAdultsHuman(){
        Map<Integer, Human> inputMap = new HashMap<>();
        inputMap.put(1, new Human("rika", "milk", "void", 34));
        inputMap.put(2, new Human("ri", "servich", "longling", 11));
        inputMap.put(3, new Human("ritka", "milk", "narov", 23));
        inputMap.put(4, new Human("ritka", "milk", "narov", 23));
        inputMap.put(5, new Human("adf", "milk", "narov", 11));

        Set<Integer> inputSet = new HashSet<>();
        inputSet.add(1);
        inputSet.add(3);
        inputSet.add(5);

        Set<Human> outputSet = new HashSet<>();
        outputSet.add( new Human("rika", "milk", "void", 34));
        outputSet.add( new Human("ritka", "milk", "narov", 23));

        assertEquals(outputSet,CollectionsDemo.sortAdultsHuman(inputMap,inputSet));
    }

    /*Ninth task*/
    @Test
    void buildAgeMap(){

        Map<Integer, Human> inputMap = new HashMap<>();
        inputMap.put(1, new Human("rika", "milk", "void", 34));
        inputMap.put(2, new Human("ri", "servich", "longling", 11));
        inputMap.put(3, new Human("ritka", "milk", "narov", 23));
        inputMap.put(4, new Human("ritka", "milk", "narov", 23));
        inputMap.put(5, new Human("adf", "milk", "narov", 11));

    }

}