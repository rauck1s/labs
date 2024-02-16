package org.example.lab5;

public class UpTriangleMatrix extends Matrix implements IMatrix{
    public UpTriangleMatrix(int size) {
        super(size);
    }
    @Override
    public void removeElementFromIndex(int i, int j, double element ) throws Exception {
        if(i >j){
            throw new Exception("Exception: lower triangle(UpTriangleMatrix)");
        }
        super.removeElementFromIndex(i, j, element);
    }
}
