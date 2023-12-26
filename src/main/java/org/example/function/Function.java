package org.example.function;

public interface Function {
    double calc(double arg) throws IllegalArgumentException;
    double getRangeStart();
    double getRangeEnd();

}
