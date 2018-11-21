package HomeWork9_8;

import HomeWork9_8.Shapes.Parallelogram;
import HomeWork9_8.Shapes.Rectangle;
import HomeWork9_8.Shapes.Square;
import HomeWork9_8.Shapes.Trapezoid;

public class QuadrilateralTest {
    public static void main(String[] args) {

        Quadrilateral square = new Square(new Point(1, 1), new Point(4, 1), new Point(1, 4), new Point(4, 4));
        square.calculateArea();
        System.out.println(square.toString());

        Quadrilateral rectangle = new Rectangle(new Point(1, 1), new Point(4, 1), new Point(1, 8), new Point(4, 8));
        rectangle.calculateArea();
        System.out.println(rectangle.toString());


        Quadrilateral trapezoid = new Trapezoid(new Point(1, 1), new Point(5, 1), new Point(3, 4), new Point(5, 4));
        trapezoid.calculateArea();
        System.out.println(trapezoid.toString());


        Quadrilateral parallelogram = new Parallelogram(new Point(1, 1), new Point(5, 1),
                new Point(3, 4), new Point(7, 4));
        parallelogram.calculateArea();
        System.out.println(parallelogram.toString());

    }
}
