package org.example.lab5;

import org.example.lab5.DiagMatrix;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiagMatrixTest {
    DiagMatrix testMatrix = new DiagMatrix(3);

    @BeforeEach
    void setUp() throws Exception {
        double[] setMatrix = new double[]{2, 0, 0, 0, 5, 0, 0, 0, 7};
        testMatrix.setMatrix(setMatrix);
    }

    @Test
    void removeElementFromIndex() throws Exception {
        testMatrix.removeElementFromIndex(0, 0, 3);
        Assertions.assertEquals(3, testMatrix.getElementFromIndex(0, 0));
        Assertions.assertThrows(Exception.class, () -> testMatrix.removeElementFromIndex(0, 1, 5));
    }
    @Test
    void setTestMatrix() throws Exception {
        double[] setMatrixFalse = new double[]{2, 1, 0, 0, 5, 0, 0, 0, 7};
        Assertions.assertThrows(Exception.class, () -> testMatrix.setMatrix(setMatrixFalse));
        double[] setMatrixTrue = new double[]{2, 0, 0, 0, 5, 0, 0, 0, 7};
        testMatrix.setMatrix(setMatrixTrue);
        Assertions.assertEquals(setMatrixTrue.equals(testMatrix), testMatrix.equals(setMatrixTrue));
    }
    @Test
    void determinateMatrix(){
        assertEquals(70, testMatrix.determinateMatrix());
    }
}