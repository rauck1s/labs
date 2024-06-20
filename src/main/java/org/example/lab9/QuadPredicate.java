package org.example.lab9;
    @FunctionalInterface
    public interface QuadPredicate<A, B, C, D> {
        boolean test(A t, B u, C w, D v);
    }

