public class Line {

    // Instance variables:
    private Point2D endPoint1;
    private Point2D endPoint2;

    // Constructor:
    public Line(Point2D p1, Point2D p2){
        this.endPoint1 = p1;
        this.endPoint2 = p2;
    }

    // Methods:
    public void setEndPoint1(Point2D point1){
        this.endPoint1 = point1;
    }

    public Point2D getEndPoint1(){
        return this.endPoint1;
    }

    public void setEndPoint2(Point2D point2){
        this.endPoint2 = point2;
    }

    public  Point2D getEndPoint2(){
        return this.endPoint2;
    }

    public double length(){
        return Point2D.distance(endPoint1, endPoint2);
    }

    public String toString(){
        return "Line[" + endPoint1 + "," + endPoint2 + "]";
    }
}
