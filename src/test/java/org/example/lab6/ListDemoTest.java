package org.example.lab6;

import org.example.lab6.classes.Human;
import org.example.lab6.classes.Student;
import org.example.lab6.collections.ListDemo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ListDemoTest {

    /*Second task*/
    @Test
    void equalsSecondName() {

        Human first = new Human("rika", "milk", "void", 34);
        Human second = new Human("ri", "servich", "longling", 11);
        Human third = new Human("ritka", "milk", "narov", 23);
        Human fourth = new Human("ritka", "milk", "narov", 23);
        Human fifth = new Human("adf", "milk", "narov", 23);
        Human searchHuman =  new Human("ritka", "milk", "narov", 23);

        List<Human> nameList = new ArrayList<>();
        List<Human> checkResult = new ArrayList<>();

        nameList.add(first);
        nameList.add(second);
        nameList.add(third);
        nameList.add(fourth);
        nameList.add(fifth);
        checkResult.add(third);
        checkResult.add(fourth);

        assertEquals(checkResult, ListDemo.EqualsSecondName(nameList, searchHuman));
    }

    /*Fifth task*/
    @Test
    void MaxAge(){

        Human firstHuman = new Human();
        Human secondHuman = new Human("oleg", "servich", "longling", 11);
        Human thirdHuman = new Human("ritka", "milk", "narov", 23);
        Student fourthHumanStudent = new Student("mark", "levanovich", "markovnik", 19, "OmsuTOP");
        Student fifthHumanStudent = new Student("Daniil", "donkov", "marsianin", 60, "POLITEXFUUU");

        List<Human> inputList = new ArrayList<>();
        inputList.add(firstHuman);
        inputList.add(secondHuman);
        inputList.add(thirdHuman);
        inputList.add(fourthHumanStudent);


        Set<Human> firstOutputSet = new HashSet<>();
        firstOutputSet.add(thirdHuman);

        assertEquals(firstOutputSet, ListDemo.MaxAged(inputList));

        Set<Human> secondOutput = new HashSet<>();
        secondOutput.add(fifthHumanStudent);
        inputList.add(fifthHumanStudent);

        assertEquals(secondOutput, ListDemo.MaxAged(inputList));
    }
}