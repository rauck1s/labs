package org.example.lab6test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ListDemoTest {
    List<Human> nameList = new ArrayList<>();
    List<Human> checkResult = new ArrayList<>();
    Human searchHuman;

    @BeforeEach
    void setUp() {
        Human first = new Human("rika", "milk", "void", 34);
        Human second = new Human("ri", "servich", "longling", 11);
        Human third = new Human("ritka", "milk", "narov", 23);
        Human fourth = new Human("ritka", "milk", "narov", 23);
        Human fifth = new Human("adf", "milk", "narov", 23);
        searchHuman =  new Human("ritka", "milk", "narov", 23);
        nameList.add(first);
        nameList.add(second);
        nameList.add(third);
        nameList.add(fourth);
        nameList.add(fifth);
        checkResult.add(third);
        checkResult.add(fourth);
        /*aesklghlkwqegljlkew*/

    }

    @Test
    void equalsSecondName() {
        Assertions.assertEquals(checkResult, ListDemo.EqualsSecondName(nameList, searchHuman));
    }
}