package org.example.functional;

import org.example.function.Function;

public class IntegralFunctional<T extends Function> implements Functional<T> {
    private final int intervals;
    private final double rangeStart;
    private final double rangeEnd;

    public IntegralFunctional(int intervals, double rangeStart, double rangeEnd) {
        if (intervals <= 0) {
            throw new IllegalArgumentException("Exception: intervals <= 0!");
        }
        this.intervals = intervals;

        if (rangeStart > rangeEnd) {
            throw new IllegalArgumentException("Exception: rangeStart > rangeEnd!");
        }
        this.rangeStart = rangeStart;
        this.rangeEnd = rangeEnd;
    }

    @Override
    public double calc(T func) {
        if (rangeStart > func.getRangeStart()) {
            throw new IllegalArgumentException("start boundary beyond function range");
        }
        if (rangeEnd > func.getRangeEnd()) {
            throw new IllegalArgumentException("end boundary beyond function range");
        }

        final double h = Math.abs(rangeEnd - rangeStart) / intervals;
        double arg;
        double sum = 0;

        for (int i = 0; i < intervals; i++) {
            arg = rangeStart + (i + 0.5) * h;
            sum += func.calc(arg);
        }
        return sum * h;
    }

}
