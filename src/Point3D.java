/*
    INHERITANCE:

    AGGREGATION: An association defines a static relationship between objects of two classes.
        One such association, called aggregation (also known as composition), expresses how an object uses other objects.

 */

public class Point3D extends Point2D{

    // Static variable
    private static String info = "A 3D point represented by (x,y,z)-coordinates";

    //Instance variable:
    private int z;

    // Constructor
    public Point3D(int xCoord, int yCoord, int zCoord) {
        super(xCoord, yCoord);
        this.z = zCoord;
    }

    // Instance methods:
    public int getZ(){
        return this.z;
    }

    public void setZ(int zCoord){
        this.z = zCoord;
    }
    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + z + ")"; // Format: (x,y,z)
    }

    // Static methods:
    public static double distance(Point3D p1, Point3D p2){
        int xDiff = p1.getX() - p2.getX();
        int yDiff = p1.getX() - p2.getY();
        int zDiff = p1.getZ() - p2.getZ();
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff + zDiff*zDiff);
    }
}
