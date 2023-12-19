package org.example.equation;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class QuadraticEquation {
    public double getLargerRoot(StorageQuadraticEquation equation) throws IllegalAccessException {
        List<Double> roots = equation.roots();
        if(roots.isEmpty()){
            throw new IllegalAccessException("Exception: no roots of equation");
        }
        Collections.sort(roots, Collections.reverseOrder());
        return roots.get(0);
    }
}
