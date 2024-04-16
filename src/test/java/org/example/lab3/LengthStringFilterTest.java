package org.example.lab3;

import org.example.lab3.filter.LengthStringFilter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthStringFilterTest {
    private LengthStringFilter filter;
    @BeforeEach
    void setUp(){
        filter = new LengthStringFilter();
    }
    @Test
    void applyTru(){
        assertFalse(filter.apply("12345"));
    }
    @Test
    void applyFalseFirst(){
        assertFalse(filter.apply("123"));
    }
    @Test
    void applyFalseSecond(){
        assertTrue(filter.apply("12345678910"));
    }
}