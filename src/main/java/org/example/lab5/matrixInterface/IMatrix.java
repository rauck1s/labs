package org.example.lab5.matrixInterface;

public interface IMatrix {
    double getElementFromIndex(int i, int j);
    void removeElementFromIndex(int i, int j, double element ) throws Exception;
    double determinateMatrix();
}
