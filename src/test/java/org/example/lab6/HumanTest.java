package org.example.lab6;

import org.example.lab6.classes.Human;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HumanTest {

    @Test
    void getSecondName() {

        Human first = new Human("dimas", "milk", "void", 34);
        Human second = new Human("oleg", "servich", "longling", 11);
        Human third = new Human("ritka", "milk", "narov", 23);

        Assertions.assertEquals("dimas", first.getSecondName());
        Assertions.assertEquals("oleg", second.getSecondName());
        Assertions.assertEquals("ritka", third.getSecondName());
    }

    @Test
    void getFirstName() {

        Human first = new Human("dimas", "milk", "void", 34);
        Human second = new Human("oleg", "servich", "longling", 11);
        Human third = new Human("ritka", "milk", "narov", 23);

        Assertions.assertEquals("milk", first.getFirstName());
        Assertions.assertEquals("servich", second.getFirstName());
        Assertions.assertEquals("milk", third.getFirstName());
    }

    @Test
    void getSurname() {

        Human first = new Human("dimas", "milk", "void", 34);
        Human second = new Human("oleg", "servich", "longling", 11);
        Human third = new Human("ritka", "milk", "narov", 23);


        Assertions.assertEquals("void", first.getSurname());
        Assertions.assertEquals("longling", second.getSurname());
        Assertions.assertEquals("narov", third.getSurname());
    }

    @Test
    void getAge() {

        Human first = new Human("dimas", "milk", "void", 34);
        Human second = new Human("oleg", "servich", "longling", 11);
        Human third = new Human("ritka", "milk", "narov", 23);

        Assertions.assertEquals(34, first.getAge());
        Assertions.assertEquals(11, second.getAge());
        Assertions.assertEquals(23, third.getAge());
    }

    @Test
    void testEquals() {

        Human first = new Human("dimas", "milk", "void", 34);
        Human second = new Human("oleg", "servich", "longling", 11);
        Human testEquals = new Human("dimas", "milk", "void", 34);

        Assertions.assertEquals(true, first.equals(testEquals));
        Assertions.assertEquals(false, first.equals(second));
    }
}