package org.example.lab5;

public class DiagMatrix extends Matrix implements IMatrix {
    public DiagMatrix(int size) {
        super(size);
    }

    public DiagMatrix(int size, double[] item) throws Exception {
        super(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                this.removeElementFromIndex(i, j, item[i]);
            }
        }
    }

    @Override
    public void setMatrix(double[] matrix) throws Exception {
        for (int i = 0; i < super.getSize(); i++) {
            for (int j = 0; j < super.getSize(); j++) {
                if (i != j) {
                    if (matrix[i * super.getSize() + j] != 0) {
                        throw new Exception("Exception: matrix doesn't diagonal");
                    }
                }
            }
        }
        if (matrix.length == super.getSize() * super.getSize()) {
            super.setMatrix(matrix);
        } else {
            throw new Exception("Exception: length doesn't match(setMatrix)");
        }
    }

    @Override
    public void removeElementFromIndex(int i, int j, double element) throws Exception {
        if (i != j) {
            throw new Exception("Exception: outside diagonal(DiagMatrix) ");
        }
        super.removeElementFromIndex(i, j, element);
    }
}
