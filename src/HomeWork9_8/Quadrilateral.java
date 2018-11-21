package HomeWork9_8;

public abstract class Quadrilateral {

    private double area;

    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;


    public Quadrilateral(Point point1, Point point2, Point point3, Point point4) {
        setPoint1(point1);
        setPoint2(point2);
        setPoint3(point3);
        setPoint4(point4);
    }

    abstract public void calculateArea();

    public void setArea(double area) {
        this.area = area;
    }

    public void setPoint1(Point point1) {

        this.point1 = point1;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    public void setPoint4(Point point4) {
        this.point4 = point4;
    }


    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public Point getPoint4() {
        return point4;
    }

    public double getArea() {
        return area;
    }
}
