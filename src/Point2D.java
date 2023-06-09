import java.awt.*;

public class Point2D { // Class name

   // Class Member Declarations
   // Static variable:
    private static String info = "A point represented by (x,y)-coordinate.";

    // Instance variables:
    private int x;   // The x-coordinate
    private int y;   // The y-coordinate


    // Constructor
    public Point2D(int xCoord, int yCoord){
        x = xCoord;
        y = yCoord;
    }

    // Instance Methods :
    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setX(int xCoord){
        this.x = xCoord;
    }

    public void setY(int yCoord){
        this.y = yCoord;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";  // Format: (x,y)
    }

    // Static methods:
    public static double distance(Point2D p1, Point2D p2){
        int xDiff = p1.x - p2.x;
        int yDiff = p1.y - p2.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public static void showInfo(){
        System.out.println(info);
    }
}
