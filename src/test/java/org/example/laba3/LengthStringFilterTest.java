package org.example.laba3;

import org.example.laba3.filter.LengthStringFilter;
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
        assertTrue(filter.apply("12345"));
    }
    @Test
    void applyFalseFirst(){
        assertFalse(filter.apply("123"));
    }
    @Test
    void applyFalseSecond(){
        assertFalse(filter.apply("12345678910"));
    }
}