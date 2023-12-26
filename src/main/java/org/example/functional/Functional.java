package org.example.functional;

import org.example.function.Function;

public interface Functional<T extends Function> {
    double calc(T function);

}
