package HomeWork9_8.Shapes;

import HomeWork9_8.Point;
import HomeWork9_8.Quadrilateral;

public class Square extends Quadrilateral {

    public Square(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);
    }

    private boolean validateLength() {
        if (getPoint1().getX() != getPoint3().getX()
                || getPoint2().getX() != getPoint4().getX()
                || getPoint3().getY() != getPoint4().getY()
                || getPoint1().getY() != getPoint2().getY()) {
            return false;
        }

        double length1 = getPoint2().getX() - getPoint1().getX();
        double length2 = getPoint4().getX() - getPoint3().getX();
        double height1 = getPoint3().getY() - getPoint1().getY();
        double height2 = getPoint4().getY() - getPoint2().getY();
        if (length1 != length2 && length1 != height1 && length1 != height2) {
            return false;
        }

        return true;
    }

    @Override
    public void calculateArea() {
        if (validateLength()) {
            double length = getPoint2().getX() - getPoint1().getX();
            setArea(Math.pow(length, 2));
        }
    }

    @Override
    public String toString() {
        return "Area of square: " + getArea();
    }
}
