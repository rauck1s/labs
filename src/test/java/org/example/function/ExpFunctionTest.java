package org.example.function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpFunctionTest {
    @Test
    public void function(){
        ExpFunction fun = new ExpFunction(2,3,-1,8);
        assertEquals(5,fun.calc(0));
        assertThrows(IllegalArgumentException.class, ()->fun.calc(9));
    }
}