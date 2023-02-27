package Exercise2;

public class Rectangle extends Shape {
    /*
    * The Circle class models a circle with a radius and color.
    */
    // private instance variable, not accessible from outside this class
    private double width;
    private double length;

    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Rectangle() { // 1st (default) constructor
        this.width = 1.0;
        this.length = 1.0;
    }

    /** Constructs a Circle instance with the given radius and default color */
    public Rectangle(double w, double l) { // 2nd constructor
        this.width = w;
        this.length = l;
    }

    /** Penambahan constructs dengan ketentuan Constructor Circle(radius : double, color : string)*/
    public Rectangle(double w, double l, String c, Boolean f) { // 2nd constructor
        this.width = w;
        this.length = l;
        setColor(c);
        setFilled(f);
    }

    /** Returns the width */
    public double getWidth() {
        return this.width;
    }

    /** Penambahan void untuk set width */
    public void setWidth(double w) {
        this.width = w;
    }

    /** Returns the length */
    public double getLength() {
        return this.length;
    }

    /** Penambahan void untuk set length */
    public void setLength(double l) {
        this.length = l;
    }

    /** Returns the area of this Circle instance */
    public double getArea() {
        return this.width*this.length;
    }
    
    /** Returns the perimeter of this Circle instance */
    public double getPerimeter() {
        return (2*(this.width+this.length));
    }

    /** Return a self-descriptive string of this instance in the form of
    Circle[radius=?,color=?] */
    public String toString() {
        return "Rectangle[Shape[color=" +getColor() + ",filled=" + isFilled() + ",width=" + this.width + ",length=" + this.length + "]]";
    }
}
