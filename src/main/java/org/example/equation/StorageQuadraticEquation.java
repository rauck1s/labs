package org.example.equation;

import java.util.ArrayList;
import java.util.List;

public  class StorageQuadraticEquation {
    private final double a;
    private final double b;
    private final double c;

    public StorageQuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public List<Double> roots() throws IllegalAccessException {
        final List<Double> roots = new ArrayList<>();

        if (a == 0) {
            roots.add(-c/b);
            return roots;
        }

        double disc = b*b - 4*a*c;
        if(disc < 0){
            throw new IllegalAccessException("Exception: no roots of equation");
        }else if (disc == 0) {
            roots.add(-b/2*a);
        } else {
            roots.add((-b+Math.sqrt(disc))/2*a);
            roots.add((-b-Math.sqrt(disc))/2*a);
        }
        return roots;
    }
}
