import java.util.Objects;

public class Point3D {
    private double x;
    private double y;
    private double z;
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public void setZ(double z){
        this.z = z;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getZ(){
        return z;
    }
    public Point3D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Point3D(){
    }
    public String print(){
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public boolean compareTwoPoint(Point3D point){
        return getX() == point.getX() && getY() == point.getY() && getZ() == point.getZ();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point3D point3D = (Point3D) o;
        return Double.compare(x, point3D.x) == 0
                && Double.compare(y, point3D.y) == 0
                && Double.compare(z, point3D.z) == 0;

    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
