package org.example.lab9;

import org.junit.jupiter.api.Test;

import static org.example.lab9.Human.Gender.*;
import static org.example.lab9.LambdaDemo.*;
import static org.example.lab9.LambdaRunner.*;
import static org.junit.jupiter.api.Assertions.*;

class LambdaDemoTest {
    @Test
    public void testStringLength() {
        assertEquals(5, runFunction(stringLength, "abcde"));
    }

    @Test
    public void testStringLength2() {
        assertEquals(0, runFunction(stringLength, ""));
    }

    //task2
    @Test
    public void testFirstChar1() {
        assertEquals('a', runFunction(symbol, "abcDEF"));
    }

    @Test
    public void testFirstChar2() {
        assertEquals(null, runFunction(symbol, ""));
    }

    //task3
    @Test
    public void testNoSpaces1() {
        assertTrue(runPredicate(checkSpace, "akgmakmgkm"));
    }

    @Test
    public void testNoSpaces2() {
        assertFalse(runPredicate(checkSpace, "aaaaa bbbbb"));
    }

    @Test
    public void testNoSpaces3() {
        assertFalse(runPredicate(checkSpace, " aaaaaaa "));
    }

    //task4
    @Test
    public void testWordCount() {
        assertEquals(3, runFunction(wordCount, "a a, b b, c c"));
    }

    @Test
    public void testWordCount2() {
        assertEquals(3, runFunction(wordCount, "a,b,c"));
    }

    @Test
    public void testWordCount3() {
        assertEquals(1, runFunction(wordCount, "a b c"));
    }

    @Test
    public void testWordCount4() {
        assertEquals(null, runFunction(wordCount, ""));
    }

    @Test
    public void testWordCount5() {
        assertEquals(0, runFunction(wordCount, ","));
    }

    //task5
    @Test
    public void testAgeFunction1() {
        Human human = new Human("SurName", "FirstName", "Patronymic", 20, MAN);
        int expectedAge = 20;
        assertEquals(expectedAge, runFunction(age, human));
    }

    @Test
    public void testAgeFunction2() {
        Student student = new Student("Ivanov", "Ivan", "Ivanovich", 25, MAN, "OmSU", "FDTK", "Maths");
        int expectedAge = 25;
        assertEquals(expectedAge, runFunction(age, student));
    }

    @Test
    public void testAgeFunction3() {
        Student student = new Student("SurName", "FirstName", "Patronymic", 25, MAN, "IDK", "IDK", "IDK");
        int expectedAge = 25;
        assertEquals(expectedAge, runFunction(age, student));
    }

    //task6
    @Test
    public void testSameLastName1() {
        Human human1 = new Human("Khmelev", "Daniil", "Vasilyevich", 20, MAN);
        Human human2 = new Human("Khmelev", "Vladislav", "Vasilyevich", 26, MAN);
        assertFalse(runBiPredicate(equalsSurName, human1, human2));
    }

    @Test
    public void testSameLastName2() {
        Human human = new Human("IDK", "Name", "lastName", 19, MAN);
        Student student = new Student("IDK", "OtherName", "lastName", 18, WOMAN, "OmSU", "FDTC", "Maths");
        assertFalse(runBiPredicate(equalsSurName, human, student));
    }

    @Test
    public void testSameLastName3() {
        Human human = new Human("SurName", "Name", "lastName", 19, MAN);
        Student student = new Student("OtherSurName", "Name", "lastName", 18, MAN, "OmSU", "FDTC", "Maths");
        assertTrue(runBiPredicate(equalsSurName, human, student));
    }

    //task7
    @Test
    public void testFullName1() {
        Human human = new Human("Name", "FirstName", "LastName", 20, MAN);
        assertEquals("FirstName Name LastName", runFunction(fullName, human));
    }

    @Test
    public void testFullName2() {
        Student student = new Student("Ivan", "Ivanov", "Ivanovich", 25, MAN, "OmSU", "FDTC", "Maths");
        assertEquals("Ivanov Ivan Ivanovich", runFunction(fullName, student));
    }

    //task8
    @Test
    public void testOneYearOlder1() {
        Human human1 = new Human("SurName", "FirstName", "Pattonymic", 19, MAN);
        Student human2 = new Student("SurName", "FirstName", "Pattonymic", 20, MAN, "OmSU", "FDTC", "Maths");
        assertEquals(human2.getAge(), runFunction(oneYearOlder, human1).getAge());
    }
}