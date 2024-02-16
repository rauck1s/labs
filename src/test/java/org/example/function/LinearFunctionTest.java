package org.example.function;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinearFunctionTest {
    private LinearFunction funcFirst;
    private LinearFunction funcSecond;
    private LinearFunction funcThird;

    @BeforeEach
    void SetUp(){
        funcFirst = new LinearFunction(3, 6, 0, 10);
        funcSecond = new LinearFunction(1, 5, 0,9);
        funcThird = new LinearFunction(0,0, -1,1);
    }
    @Test
    void functionFirst(){
        assertEquals(15, funcFirst.calc(3));
    }
    @Test
    void functionSecond(){
        assertEquals(14, funcSecond.calc(9));
    }
    @Test
    void functionThird(){
        assertThrows(IllegalArgumentException.class, ()->funcThird.calc(10));
    }
}