package HomeWork9_8.Shapes;

import HomeWork9_8.Point;
import HomeWork9_8.Quadrilateral;

public class Trapezoid extends Quadrilateral {


    public Trapezoid(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);
    }

    private boolean validateLength() {
        double a = getPoint2().getX() - getPoint1().getX();
        double b = getPoint4().getX() - getPoint3().getX();
        double h1 = getPoint1().getY() - getPoint2().getY();
        double h2 = getPoint3().getY() - getPoint4().getY();

        if (a == b && h1 != h2) {
            return false;
        }
        return true;
    }

    @Override
    public void calculateArea() {
        if (validateLength()) {
            double a = getPoint2().getX() - getPoint1().getX();
            double b = getPoint4().getX() - getPoint3().getX();
            double h = getPoint3().getY() - getPoint1().getY();

            setArea(((a + b) / 2) * h);
        }

    }

    @Override
    public String toString() {
        return "Area of trapezoid: " + getArea();
    }
}
