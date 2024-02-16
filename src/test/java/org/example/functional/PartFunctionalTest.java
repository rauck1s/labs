package org.example.functional;

import org.example.function.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
class PartFunctionalTest {
    @Test
    public void calc(){

        PartFunctional<Function> Functional = new PartFunctional<>();

        ExpFunction expFunc = new ExpFunction(1,2,-1,1);
        assertEquals(10.086,Functional.calc(expFunc), 0.001);

        LinearFunction linFunc = new LinearFunction(2,3,0,9);
        assertEquals(36,Functional.calc(linFunc));

        FractionalFunction rationalFunc = new FractionalFunction(4,2,1,4,-1,4);
        assertEquals(3.037,Functional.calc(rationalFunc),0.001);

        SineFunction sineFunc = new SineFunction(1,2,0,1);
        assertEquals(1.75,Functional.calc(sineFunc), 0.001);

    }
}