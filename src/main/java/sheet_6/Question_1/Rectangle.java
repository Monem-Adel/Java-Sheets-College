
package sheet_6.Question_1;

/**
Design also the “Rectangle” class, which is a subclass of the
GeometricObject class and contains the following
components.
Data Members: length and width of type float.
Methods: suitable constructor(s), setters, getters, and override the
toString()method.
 */
public class Rectangle extends GeometricObject {
    protected float length;
    protected float width;

    public Rectangle() {
        super();
    }

    public Rectangle(float length, float width, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    @Override
    public double getArea() {
        return (length*width);
    }

    @Override
    public double getPerimeter() {
        return (2*length*width);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "length=" + length + ", width=" + width + super.toString()
                +" Area= "+this.getArea()+" Perimeter= "+this.getPerimeter()+ '}';
    }

    @Override
    public int compareTo(Object o) {
       return super.compareTo((GeometricObject)o);
    }
    
}
