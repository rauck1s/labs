package org.example.equation;

import org.example.StorageQuadraticEquation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationTest {
    private StorageQuadraticEquation testEquationFirst;

    private StorageQuadraticEquation testEquationSecond;

    private StorageQuadraticEquation testEquationThird;

    private StorageQuadraticEquation testEquationFourth;
    private StorageQuadraticEquation testEquationFifth;


    @BeforeEach
    void setUp() {
        testEquationFirst = new StorageQuadraticEquation(0,-4,2);
        testEquationSecond = new StorageQuadraticEquation(-1,0,4);
        testEquationThird = new StorageQuadraticEquation(3,2,0);
        testEquationFourth = new StorageQuadraticEquation(2,2,2);
        testEquationFifth = new StorageQuadraticEquation(0,0,0);
    }
    /*root:
    * 1: 0,5*/
    @Test
    void solutionFirst() throws IllegalAccessException {
        List<Double> test = new ArrayList<>();
        test.add(0.5);
        assertEquals(test, testEquationFirst.roots());
    }
    /*root
    * 1: -2
    * 2: 2 */
    @Test
    void solutionSecond() throws IllegalAccessException {
        List<Double> test = new ArrayList<>();
        test.add(-2.);
        test.add(2.);
        assertEquals(test, testEquationSecond.roots());
    }
    /*root
    * 1: 0
    * 2: -6*/
    @Test
    void solutionThird() throws IllegalAccessException {
        List<Double> test = new ArrayList<>();
        test.add(0.);
        test.add(-6.);
        assertEquals(test, testEquationThird.roots());
    }
    /*no roots */
    @Test
    void solutionFourth(){
        assertThrows(IllegalAccessException.class, ()->{testEquationFourth.roots();});
    }
    /*no roots*/
    @Test
    void solutionFifth(){
        assertThrows(IllegalAccessException.class, ()->{testEquationFifth.roots();});
    }
    @Test
    void testMaxFirst() throws IllegalAccessException {
        assertEquals(0., QuadraticEquation.getLargerRoot(testEquationThird));
    }
    @Test
    void testMaxSecond() throws IllegalAccessException {
        assertEquals(2., QuadraticEquation.getLargerRoot(testEquationSecond));
    }
    @Test
    void testMaxThird() throws IllegalAccessException {
        assertEquals(0.5, QuadraticEquation.getLargerRoot(testEquationFirst));
    }
}