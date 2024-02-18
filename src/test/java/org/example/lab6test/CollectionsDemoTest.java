package org.example.lab6test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class CollectionsDemoTest {
    List<String> forSortByFirstSymbol;
    List<Human> forDeleteHumaninList;
    @Test
    void sortByFirstSymbol() {
        String firstLine = "qwert";
        String secondLine = "werq";
        String thirdLine = "eqwer";
        String fourthLine = "qqwert";
        String fifthLine = "01";
        forSortByFirstSymbol =new ArrayList<>();
        forSortByFirstSymbol.add(firstLine);
        forSortByFirstSymbol.add(secondLine);
        forSortByFirstSymbol.add(thirdLine);
        forSortByFirstSymbol.add(fourthLine);
        forSortByFirstSymbol.add(fifthLine);
        Assertions.assertEquals(2, CollectionsDemo.sortByFirstSymbol(forSortByFirstSymbol, 'q'));
        Assertions.assertEquals(1, CollectionsDemo.sortByFirstSymbol(forSortByFirstSymbol, 'e'));
        Assertions.assertEquals(1, CollectionsDemo.sortByFirstSymbol(forSortByFirstSymbol, '0'));
    }

    @Test
    void deleteHumanInList() {
        Human first = new Human("dimas", "milk", "void", 34);
        Human second = new Human("oleg", "servich", "longling", 11);
        Human third = new Human("ritka", "milk", "narov", 23);
        Human fourth = new Human("dima", "milk", "volas", 10 );
        Human fifth = new Human("andrey", "supchik", "aka", 19);
        Human renoveHuman = new Human("ritka", "milk", "narov", 23);
        forDeleteHumaninList = new ArrayList<>();
        forDeleteHumaninList.add(first);
        forDeleteHumaninList.add(second);
        forDeleteHumaninList.add(third);
        forDeleteHumaninList.add(fourth);
        forDeleteHumaninList.add(fifth);

    }

    @Test
    void deletingSetsIntegerNumbers() {
    }
}