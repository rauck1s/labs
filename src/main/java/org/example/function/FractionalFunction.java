package org.example.function;

public class FractionalFunction implements Function{
    private final double a;
    private final double b;
    private final double c;
    private final double d;
    private final double rangeStart;
    private final double rangeEnd;

    public FractionalFunction(double a, double b, double c, double d, double rangeStart, double rangeEnd) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.rangeStart = rangeStart;
        this.rangeEnd = rangeEnd;
    }

    @Override
    public double calc(double arg) {
        if (arg <= rangeStart && arg >= rangeEnd) {
            throw new IllegalArgumentException("Exception: arg is outside of range!");
        }
        return (a * arg + b) / (c * arg + d);
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
