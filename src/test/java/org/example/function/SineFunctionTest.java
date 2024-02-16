package org.example.function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SineFunctionTest {
    @Test
    public void function(){
        SineFunction fun = new SineFunction(2,1,0,Math.PI*2);
        assertEquals(2,fun.calc(Math.PI/2));
        assertThrows(IllegalArgumentException.class, ()->fun.calc(-1));
    }
}