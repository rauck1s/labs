package org.example.lab3;

import org.example.lab3.filter.SearchNumbersFilter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class SearchNumbersFilterTest {
    private static SearchNumbersFilter filter;
    @BeforeEach
    void setUp(){
        filter = new SearchNumbersFilter();
    }
    @Test
    void applyTru(){
        assertTrue(filter.apply("2 lfd 4 ks 3"));
    }
    @Test
    void applyFalse(){
        assertFalse(filter.apply("great life 1 3 5 "));
    }
    @Test
    void applyFalseSecond(){
        assertFalse(filter.apply("ghjkl dfa"));
    }
}

