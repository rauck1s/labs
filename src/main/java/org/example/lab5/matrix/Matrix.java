package org.example.lab5.matrix;

import org.example.lab5.matrixInterface.IMatrix;

import java.util.Arrays;

public class Matrix implements IMatrix {
    private double[] matrix;
    private final int size;
    private double determinate;
    private boolean flag = false;
    public Matrix(int size) {
        this.size = size;
        this.matrix = new double[this.size * this.size];
        flag = false;
    }

    @Override
    public double getElementFromIndex(int i, int j) {
        return matrix[i * size + j];
    }

    @Override
    public void removeElementFromIndex(int i, int j, double element) throws Exception {
        matrix[i * size + j] = element;
        flag = false;
    }

    @Override
    public double determinateMatrix() {
        if(flag) {
            return determinate;
        }
        determinate = 1;
        double[][] helpMatrix = new double[size][size];
        for (int i = 0; i < size; i++) {
            for(int j =0; j < size; j ++){
                helpMatrix[i][j] =matrix[i * size + j];
            }
        }
        for (int i = 0; i < size; i++) {
            int maxRow = i;
            for (int j = i + 1; j < size; j++) {
                if (Math.abs(helpMatrix[j][i]) > Math.abs(helpMatrix[maxRow][i])) {
                    maxRow = j;
                }
            }
            if (maxRow != i) {
                double[] temp = helpMatrix[i];
                helpMatrix[i] = helpMatrix[maxRow];
                helpMatrix[maxRow] = temp;
                determinate = -determinate;
            }
            for (int j = i + 1; j < size; j++) {
                double coff = helpMatrix[j][i] / helpMatrix[i][i];
                for (int k = i; k < size; k++) {
                    helpMatrix[j][k] -= coff * helpMatrix[i][k];
                }
            }
            determinate *= helpMatrix[i][i];
        }
        flag = true;
        return determinate;
    }
    public double getDeterminate() throws Exception {
        if(flag){
            return determinate;
        }
        else{
            throw new Exception("Exception: no determinate, Flag = false");
        }
    }

    public double[] getMatrix() {
        return matrix;
    }

    public void setMatrix(double[] matrix) throws Exception {
        if(matrix.length == this.size * this.size){
            this.matrix = matrix;
        }
        else {
            throw new Exception("Exception: length doesn't match(setMatrix)");
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix1 = (Matrix) o;
        return Arrays.equals(matrix, matrix1.matrix);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(matrix);
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "matrix=" + Arrays.toString(matrix) +
                '}';
    }
}
