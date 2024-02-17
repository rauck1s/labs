package org.example.lab1;

public class Vector3DArray {
    private Vector3D[] arr;

    Vector3DArray(int size) {
        arr = new Vector3D[size];
        for (int i = 0; i < size; i++) {
            arr[i] = new Vector3D(0,0,0);
        }
    }

    public double lengthArr() {
        return arr.length;
    }

    public void replace(Vector3D vector1, int i) {
        arr[i] = vector1;

    }

    public void print() {
        System.out.println("print array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].printVector());
        }
    }

    public String maximumLength() {

        double maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            double test = 0;
            test = arr[i].lengthVector();
            if (test > maxLength) {
                maxLength = test;
            }
        }
        return ("Maximum length Vector3DArray:" + maxLength);
    }

    public int searchVector3DArray(Vector3D vector) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compare(vector)) {
                return i;
            }
        }
        return -1;
    }

    public Vector3D sumVector3DArray() {
        double x = 0;
        double y = 0;
        double z = 0;
        for (int i = 0; i < arr.length; i++) {
            x += arr[i].getX();
            y += arr[i].getY();
            z += arr[i].getZ();
        }
        return new Vector3D(x, y, z);

    }

    public Vector3D linearVector(double[] array) {
        double x = 0;
        double y = 0;
        double z = 0;
        if (array.length != arr.length) {
            return new Vector3D();
        } else {
            for (int i = 0; i < arr.length; i++) {
                x += arr[i].getX() * array[i];
                y += arr[i].getY() * array[i];
                z += arr[i].getZ() * array[i];
            }
            return new Vector3D(x, y, z);
        }
    }

    public Point3D[] shiftPoints(Point3D point) {
        Point3D[] shiftedPoints = new Point3D[arr.length];
        for (int i = 0; i < arr.length; i++) {
            Vector3D vector = arr[i];
            double newX = point.getX() + vector.getX();
            double newY = point.getY() + vector.getY();
            double newZ = point.getZ() + vector.getZ();
            shiftedPoints[i] = new Point3D(newX, newY, newZ);
        }
        return shiftedPoints;
    }

}
