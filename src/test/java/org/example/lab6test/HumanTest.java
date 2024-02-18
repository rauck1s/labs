package org.example.lab6test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HumanTest {
    Human first;
    Human second;
    Human third;
    Human testEquals;
    @BeforeEach
    void setUp() {
        first = new Human("dimas", "milk", "void", 34);
        second = new Human("oleg", "servich", "longling", 11);
        third = new Human("ritka", "milk", "narov", 23);
        testEquals = new Human("dimas", "milk", "void", 34);
    }

    @Test
    void getSecondName() {
        Assertions.assertEquals("dimas", first.getSecondName());
        Assertions.assertEquals("oleg", second.getSecondName());
        Assertions.assertEquals("ritka", third.getSecondName());
    }

    @Test
    void getFirstName() {
        Assertions.assertEquals("milk", first.getFirstName());
        Assertions.assertEquals("servich", second.getFirstName());
        Assertions.assertEquals("milk", third.getFirstName());
    }

    @Test
    void getSurname() {
        Assertions.assertEquals("void", first.getSurname());
        Assertions.assertEquals("longling", second.getSurname());
        Assertions.assertEquals("narov", third.getSurname());
    }

    @Test
    void getAge() {
        Assertions.assertEquals(34, first.getAge());
        Assertions.assertEquals(11, second.getAge());
        Assertions.assertEquals(23, third.getAge());
    }

    @Test
    void testEquals() {
        Assertions.assertEquals(true, first.equals(testEquals));
        Assertions.assertEquals(false, first.equals(second));
    }
}