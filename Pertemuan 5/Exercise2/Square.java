package Exercise2;

public class Square extends Rectangle {
    /*
    * The Circle class models a circle with a radius and color.
    */
    // private instance variable, not accessible from outside this class

    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Square() { // 1st (default) constructor
        super();
    }

    /** Constructs a Circle instance with the given radius and default color */
    public Square(double s) { // 2nd constructor
        super(s, s);
    }

    /** Penambahan constructs dengan ketentuan Constructor Circle(radius : double, color : string)*/
    public Square(double s, String c, Boolean f) { // 2nd constructor
        super(s, s, c, f);
    }

    /** Returns the side */
    public double getSide() {
        return getWidth();
    }

    /** Penambahan void untuk set side */
    public void setSide(double s) {
        setWidth(s);
        setLength(s);
    }
    
    /** Penambahan void untuk set length */
    @Override
    public void setLength(double s) {
        super.setLength(s);
    }

    /** Penambahan void untuk set width */
    @Override
    public void setWidth(double s) {
        super.setWidth(s);
    }

    /** Return a self-descriptive string of this instance in the form of
     Circle[radius=?,color=?] */
    @Override
    public String toString() {
        return "Square[Rectangle[Shape[color=" +getColor() + ",filled=" + isFilled() + ",width=" + getWidth() + ",length=" + getLength() + "]]]";
    }
}
