package org.example.function;

public class LinearFunction implements Function {
    private final double a;
    private final double b;
    private final double rangeStart;
    private final double rangeEnd;

    public LinearFunction(double a, double b, double rangeStart, double rangeEnd) {
        this.a = a;
        this.b = b;
        this.rangeStart = rangeStart;
        this.rangeEnd = rangeEnd;
    }

    @Override
    public double calc(double arg) throws IllegalArgumentException {
        if (arg < rangeStart || arg > rangeEnd) {
            throw new IllegalArgumentException("Exception: arg is outside of range!");
        }
        return a * arg + b;
    }

    @Override
    public double getRangeStart() {
        return rangeStart;
    }

    @Override
    public double getRangeEnd() {
        return rangeEnd;
    }
}
