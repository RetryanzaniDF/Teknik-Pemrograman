package Task1_1;

/*
* The Circle class models a circle with a radius and color.
*/
public class Circle { // Save as "Circle.java"
    // private instance variable, not accessible from outside this class
    private double radius;
    private String color;

    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Circle() { // 1st (default) constructor
        radius = 1.0;
        color = "red";
    }

    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double r) { // 2nd constructor
        radius = r;
        color = "red";
    }

    /** Penambahan constructs dengan ketentuan Constructor Circle(radius : double, color : string)*/
    public Circle(double r, String c) { // 2nd constructor
        radius = r;
        color = c;
    }

    /** Returns the radius */
    public double getRadius() {
        return radius;
    }

    /** Penambahan void untuk set radius */
    public void setRadius(double r) {
        this.radius = r;
    }

    /** Penambahan modul untuk return color */
    public String getColor() {
        return color;
    }

    /** Penambahan void untuk set color */
    public void setColor(String c) {
        this.color = c;
    }

    /** Returns the area of this Circle instance */
    public double getArea() {
        return radius*radius*Math.PI;
    }

    /** Return a self-descriptive string of this instance in the form of
    Circle[radius=?,color=?] */
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
}
