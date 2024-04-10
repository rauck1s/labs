package org.example.lab6.collections;

import org.example.lab6.classes.Human;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ListDemoTest {

    @Test
    void equalsSecondName() {
        Human inputHuman = new Human("dima", "milk", "тест",19);

        List<Human> inputList = new ArrayList<>();

        inputList.add(new Human("dima", "milk", "void", 34));
        inputList.add(new Human("oleg", "servich", "longling", 11));
        inputList.add(new Human("ritka", "milk", "narov", 23));
        inputList.add(new Human("dima", "milk", "volas", 10 ));
        inputList.add(new Human("andrey", "supchik", "aka", 19));

        List<Human> outputList = new ArrayList<>();
        outputList.add(new Human("dima", "milk", "void", 34));
        outputList.add(new Human("dima", "milk", "volas", 10 ));

        assertEquals(outputList, ListDemo.EqualsSecondName(inputList,inputHuman));
    }

    @Test
    void maxAged() {
        List<Human> inputList = new ArrayList<>();

        inputList.add(new Human("dima", "milk", "void", 34));
        inputList.add(new Human("oleg", "servich", "longling", 11));
        inputList.add(new Human("ritka", "milk", "narov", 23));
        inputList.add(new Human("dima", "milk", "volas", 10 ));
        inputList.add(new Human("andrey", "supchik", "aka", 19));

        Set<Human> outputList = new HashSet<>();
        outputList.add(new Human("dima", "milk", "void", 34));

        assertEquals(outputList, ListDemo.MaxAged(inputList));

        inputList.add(new Human("dasd", "faf", "adf", 34));
        outputList.add(new Human("dasd", "faf", "adf", 34));

        assertEquals(outputList, ListDemo.MaxAged(inputList));
    }
}