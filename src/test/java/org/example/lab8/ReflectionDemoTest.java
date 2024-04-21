package org.example.lab8;

import org.example.lab8.classes.Cat;
import org.example.lab8.classes.Human;
import org.example.lab8.classes.Man;
import org.example.lab8.classes.Woman;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReflectionDemoTest {

    @Test
    void searchHumanObj() {
        List<Object> inputList = List.of(new Human(), new Woman(), "str", 35, 43.1111, new Man(), 980, new Human());

        assertEquals(4, ReflectionDemo.searchHumanObj(inputList));
    }
    @Test
    void getPublicMethodNames(){

        List<String> expectedList = new ArrayList<>();

        expectedList.add("getAge");
        expectedList.add("getName");
        expectedList.add("setAge");
        expectedList.add("setName");

        assertEquals(expectedList, ReflectionDemo.getPublicMethodNames(new Man()));
    }
    @Test
    void getSuperclassNames(){

        List<String> firstExpectedList = List.of("Man", "Human", "Object");
        List<String> secondExpectedList = List.of("Cat", "Woman", "Human", "Object");

        assertEquals(firstExpectedList, ReflectionDemo.getSuperclassNames(new Man()));

        assertEquals(secondExpectedList, ReflectionDemo.getSuperclassNames(new Cat()));
    }

}