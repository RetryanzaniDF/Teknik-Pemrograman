package Exercise2;

public class Shape {
    // private instance variable, not accessible from outside this class
    private String color;
    private boolean filled;

    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Shape() { // 1st (default) constructor
        color = "red";
        filled = true;
    }

    /** Penambahan constructs dengan ketentuan Constructor Circle(radius : double, color : string)*/
    public Shape(String c, Boolean f) { // 2nd constructor
        color = c;
        filled = f;
    }

    /** Penambahan untuk get color */
    public String getColor() {
        return this.color;
    }

    /** Penambahan void untuk set color */
    public void setColor(String c) {
        this.color = c;
    }

    /** Penambahan untuk set Filled */
    public boolean isFilled() {
        return this.filled;
    }

    /** Penambahan void untuk set filled */
    public void setFilled(boolean f) {
        this.filled = f;
    }

    /** Penambahan untuk to string */
    public String toString() {
        return "Shape[color=" + this.color + ",filled=" + this.filled + "]";
    }
}
