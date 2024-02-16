package org.example.function;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionalFunctionTest {
    private FractionalFunction funcFirst;
    private FractionalFunction funcSecond;
    private FractionalFunction funcThird;

    @BeforeEach
    void SetUp(){
        funcFirst = new FractionalFunction(4, 6,1,9, 0, 10);
        funcSecond = new FractionalFunction(4,4,4, 0, 3,9);
        funcThird = new FractionalFunction(-3,3,-1,10, -10,90);
    }
    @Test
    void functionFirst(){
        assertEquals(1.5, funcFirst.calc(3));
    }
    @Test
    void functionSecond(){
        assertEquals(1.0625, funcSecond.calc(16));
    }
    @Test
    void functionThird(){
        assertThrows(IllegalArgumentException.class, ()->funcThird.calc(100));
    }

}