package HomeWork9_8.Shapes;
import HomeWork9_8.Point;
import HomeWork9_8.Quadrilateral;

public class Rectangle extends Quadrilateral {
    public Rectangle(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);

    }

    private boolean validateLength() {
        if (getPoint1().getX() != getPoint3().getX()
                || getPoint2().getX() != getPoint4().getX()
                || getPoint3().getY() != getPoint4().getY()
                || getPoint1().getY() != getPoint2().getY()) {
            return false;
        }

        double length1 = Math.abs(getPoint2().getX() - getPoint1().getX());
        double length2 = Math.abs(getPoint4().getX() - getPoint3().getX());
        double height1 = Math.abs(getPoint3().getY() - getPoint1().getY());
        double height2 = Math.abs(getPoint4().getY() - getPoint2().getY());
        if (length1 != length2 || height1 != height2) {
            return false;
        }

        return true;
    }

    @Override
    public void calculateArea() {
        if (validateLength()) {
            double length = getPoint2().getX() - getPoint1().getY();
            double height = getPoint3().getY() - getPoint1().getY();
            setArea(length * height);
        }
    }

    @Override
    public String toString() {
        return "Area of rectangle: " + getArea();
    }
}
