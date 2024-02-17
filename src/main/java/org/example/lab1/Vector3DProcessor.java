package org.example.lab1;

public class Vector3DProcessor {
    public Vector3D sum(Vector3D vector1, Vector3D vector2) {
        double x = vector1.getX() + vector2.getX();
        double y = vector1.getY() + vector2.getY();
        double z = vector1.getZ() + vector2.getZ();
        return new Vector3D(x, y, z);
    }

    public Vector3D diff(Vector3D vector1, Vector3D vector2) {
        double x = vector1.getX() - vector2.getX();
        double y = vector1.getY() - vector2.getY();
        double z = vector1.getZ() - vector2.getZ();
        return new Vector3D(x, y, z);
    }
    public double scalar(Vector3D vector1, Vector3D vector2) {
        double x = vector1.getX() * vector2.getX();
        double y = vector1.getY() * vector2.getY();
        double z = vector1.getZ() * vector2.getZ();
        return z + y + x;
    }
    public Vector3D vectorComp(Vector3D vector1, Vector3D vector2) {
        double m1, m2, m3;
        m1 = (vector1.getY() * vector2.getZ()) - (vector1.getZ() * vector2.getY());
        m2 = (vector1.getX() * vector2.getZ()) - (vector1.getZ() * vector2.getX());
        m3 = (vector1.getX() * vector2.getY()) - (vector1.getY() * vector2.getX());
        m2 = m2 *(-1);
        return new Vector3D(m1, m2, m3);
    }
    public boolean collVector(Vector3D vector1, Vector3D vector2) {
        double compX, compY, compZ;
        compX = vector1.getX()/vector2.getX();
        compY = vector1.getY()/vector2.getY();
        compZ = vector1.getZ()/vector2.getZ();
        return (compX == compY && compY == compZ);
    }
}