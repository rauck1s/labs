package org.example.lab3;

import org.example.lab3.filter.BeginStringFilter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeginStringFilterTest {
    private static String string;
    private static BeginStringFilter filter1;
    private static BeginStringFilter filter2;
    @BeforeEach
    void setUp() {
        string = "Мама мыла раму";
        filter1 = new BeginStringFilter("Мама");
        filter2 = new BeginStringFilter("мыла");
    }
    @Test
    void applyTrue() {
        assertTrue(filter1.apply(string));
    }
    @Test
    void applyFalse() {
        assertFalse(filter2.apply(string));
    }
}