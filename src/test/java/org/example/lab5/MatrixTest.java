package org.example.lab5;

import org.example.lab5.Matrix;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MatrixTest {

    private final Matrix testMatrix = new Matrix(3);
    @BeforeEach
    void setUp() throws Exception {
        double[] setMatrix = new double[]{3,2,1,3,5,6,1,3,7};
        testMatrix.setMatrix(setMatrix);
    }

    @Test
    void getElementFromIndex() {
        Assertions.assertEquals(3, testMatrix.getElementFromIndex(0,0));
        Assertions.assertEquals(5, testMatrix.getElementFromIndex(1,1));
        Assertions.assertEquals(6, testMatrix.getElementFromIndex(1,2));
    }

    @Test
    void removeElementFromIndex() throws Exception {
        //System.out.println(testMatrix.toString());
        testMatrix.removeElementFromIndex(0,0,5);
        Assertions.assertEquals(5, testMatrix.getElementFromIndex(0,0));
        testMatrix.removeElementFromIndex(2,1,7);
        Assertions.assertEquals(7, testMatrix.getElementFromIndex(2,1));
        //System.out.println(testMatrix.toString());
    }

    @Test
    void determinateMatrix() throws Exception {
        Assertions.assertEquals(false, testMatrix.getFlag());
        Assertions.assertEquals(25,testMatrix.determinateMatrix(), 0.001);
        Assertions.assertEquals(true, testMatrix.getFlag());

    }

}