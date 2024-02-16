public class Vector3D {
    private double x;
    private double y;
    private double z;
    public Vector3D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Vector3D (){

    }
    public Vector3D(Point3D point1, Point3D point2) {
        this.x = point2.getX() - point1.getX();
        this.y = point2.getY() - point1.getY();
        this.z = point2.getZ() - point1.getZ();
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
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
    public double lengthVector() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public String printVector(){
        return "(" + x + ", " + y + ", " + z + ")";
    }
    public  boolean compare( Vector3D vector2){
        return (getX() == vector2.getX()) && (getY() == vector2.getY()) && (getZ() == vector2.getZ());
    }

}
