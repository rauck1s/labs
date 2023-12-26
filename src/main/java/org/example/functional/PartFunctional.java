package org.example.functional;

import org.example.function.Function;

public class PartFunctional<T extends Function> implements Functional<T> {
    @Override
    public double calc(T func) {
        return func.calc(func.getRangeStart())
                + func.calc(func.getRangeEnd())
                + func.calc((func.getRangeStart() + func.getRangeEnd()) / 2);
    }
}
