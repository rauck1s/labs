package org.example.lab5;

import org.example.lab5.UpTriangleMatrix;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UpTriangleMatrixTest {
    UpTriangleMatrix testMatrix = new UpTriangleMatrix(3);
    @BeforeEach
    void setUp() throws Exception {
        double[] setMatrix = new double[]{3,2,1,0,1,4,0,0,6};
        testMatrix.setMatrix(setMatrix);
        //System.out.println(testMatrix.toString());
    }
    @Test
    void removeElementFromIndex() throws Exception {
        Assertions.assertThrows(Exception.class, () -> testMatrix.removeElementFromIndex(1,0,4));
        testMatrix.removeElementFromIndex(0,0,10);
        Assertions.assertEquals(10,testMatrix.getElementFromIndex(0,0));
    }
    @Test
    void determinateMatrix() {
        Assertions.assertThrows(Exception.class, () -> testMatrix.getDeterminate());
        Assertions.assertEquals(18,testMatrix.determinateMatrix());
    }
    @Test
    void getElementFromIndex(){
        assertEquals(2, testMatrix.getElementFromIndex(0,1));
    }
}