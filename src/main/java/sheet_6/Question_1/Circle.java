
package sheet_6.Question_1;
/*Design also the “Circle” class, which is a subclass of the
GeometricObject class and contains the following
components.
Data Members: radius of type float.
Methods: suitable constructor(s), setters, getters, and override the
toString()method.*/
public class Circle extends GeometricObject {
    private float radius;

    public Circle() {
        super();
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    public Circle(float radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    @Override
    public double getArea() {
        return (radius*radius*Math.PI);
    }

    @Override
    public double getPerimeter() {
        return (2*radius*Math.PI);
    }

    @Override
    public String toString() {
        return " Circle{" + "radius= " + radius + super.toString()
                +" Area= "+this.getArea()+" Perimeter= "+this.getPerimeter()+ '}';
    }

    @Override
    public int compareTo(Object o) {
       return super.compareTo((GeometricObject)o);
    }

}
