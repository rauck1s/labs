package org.example.functional;


import org.example.function.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;

class IntegralFunctionalTest {
    @Test
    public void integral(){
        IntegralFunctional<Function> integral = new IntegralFunctional<>(100, 0,1);

        ExpFunction expFunc = new ExpFunction(1,2,0,1);
        assertEquals(3.718,integral.calc(expFunc), 0.001);

        LinearFunction linFunc = new LinearFunction(1,2,0,1);
        assertEquals(2.5,integral.calc(linFunc), 0.001);

        FractionalFunction rationalFunc = new FractionalFunction(1,2,3,4,0,1);
        assertEquals(0.457, integral.calc(rationalFunc),0.001);

        SineFunction sineFunction = new SineFunction(1,2,0,1);
        assertEquals(0.708,integral.calc(sineFunction),0.001);
    }
}