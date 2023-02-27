package Exercise2;

public class TestShape {
    public static void main (String[] args) {
    // Declare and allocate a new instance of Square
    // with default side, color, and boolean
    Square s1 = new Square();
    System.out.println("Square:"
    + " side=" + s1.getSide()
    + " length=" + s1.getLength()
    + " width=" + s1.getWidth()
    + " Area=" + s1.getArea()
    + " Parimeter=" + s1.getPerimeter()
    + s1.toString());

    // Declare and allocate a new instance of Square
    // specifying side
    Square s2 = new Square(10.0);
    System.out.println("Square:"
    + " side=" + s2.getSide()
    + " length=" + s2.getLength()
    + " width=" + s2.getWidth()
    + " Area=" + s2.getArea()
    + " Parimeter=" + s2.getPerimeter()
    + s2.toString());

    // Declare and allocate a new instance of Square
    // specifying side, color, and boolean
    Square s3 = new Square(15.0, "Green", true);
    System.out.println("Square:"
    + " side=" + s3.getSide()
    + " length=" + s3.getLength()
    + " width=" + s3.getWidth()
    + " Area=" + s3.getArea()
    + " Parimeter=" + s3.getPerimeter()
    + s3.toString());

    // Declare and allocate a new instance of rectangle
    // with default color, length and width
    Rectangle r1 = new Rectangle();
    System.out.println("Rectangle:"
    + " length=" + r1.getLength()
    + " width=" + r1.getWidth()
    + " Area=" + r1.getArea()
    + " Parimeter=" + r1.getPerimeter()
    + r1.toString());

    // Declare and allocate a new instance of rectangle
    // specifying length, width
    Rectangle r2 = new Rectangle(10.0, 5.0);
    System.out.println("Rectangle:"
    + " length=" + r2.getLength()
    + " width=" + r2.getWidth()
    + " Area=" + r2.getArea()
    + " Parimeter=" + r2.getPerimeter()
    + r2.toString());

    // Declare and allocate a new instance of rectangle
    // specifying length, width ,color, and boolean
    Rectangle r3 = new Rectangle(15.0, 10.0, "Blue", true);
    System.out.println("Rectangle:"
    + " length=" + r3.getLength()
    + " width=" + r3.getWidth()
    + " Area=" + r3.getArea()
    + " Parimeter=" + r3.getPerimeter()
    + r3.toString());

    // Declare and allocate a new instance of cylinder
    // with default color, radius, and height
    Circle c1 = new Circle();
    System.out.println("Circle:"
    + " radius=" + c1.getRadius()
    + " Area=" + c1.getArea()
    + " Parimeter=" + c1.getPerimeter()
    + c1.toString());

    // Declare and allocate a new instance of Circle
    // specifying radius
    Circle c2 = new Circle(7.0);
    System.out.println("Circle:"
    + " radius=" + c2.getRadius()
    + " Area=" + c2.getArea()
    + " Parimeter=" + c2.getPerimeter()
    + c2.toString());

    // Declare and allocate a new instance of Circle
    // specifying radius,color, and boolean
    Circle c3 = new Circle(14.0, "Brown", true);
    System.out.println("Circle:"
    + " radius=" + c3.getRadius()
    + " Area=" + c3.getArea()
    + " Parimeter=" + c3.getPerimeter()
    + c3.toString());
    }

}