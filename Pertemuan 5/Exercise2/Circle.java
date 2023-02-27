package Exercise2;

public class Circle extends Shape {
    /*
    * The Circle class models a circle with a radius and color.
    */
    // private instance variable, not accessible from outside this class
    private double radius;
    private String color;

    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Circle() { // 1st (default) constructor
        this.radius = 1.0;
        this.color = "red";
    }

    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double r) { // 2nd constructor
        this.radius = r;
        this.color = "red";
    }

    /** Penambahan constructs dengan ketentuan Constructor Circle(radius : double, color : string)*/
    public Circle(double r, String c, Boolean f) { // 2nd constructor
        this.radius = r;
        setColor(c);
        setFilled(f);
    }

    /** Returns the radius */
    public double getRadius() {
        return this.radius;
    }

    /** Penambahan void untuk set radius */
    public void setRadius(double r) {
        this.radius = r;
    }

    /** Returns the area of this Circle instance */
    public double getArea() {
        return this.radius*this.radius*Math.PI;
    }
    
    /** Returns the perimeter of this Circle instance */
    public double getPerimeter() {
        return 2*this.radius*Math.PI;
    }

    /** Penambahan modul untuk return color */
    public String getColor() {
        return color;
    }

    /** Penambahan void untuk set color */
    public void setColor(String c) {
        this.color = c;
    }
    
    /** Return a self-descriptive string of this instance in the form of
    Circle[radius=?,color=?] */
    public String toString() {
        return "Circle[color=" + this.color + ",filled=" + isFilled() + ",radius=" + getRadius() + "]";
    }
}
