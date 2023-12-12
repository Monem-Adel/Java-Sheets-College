
package sheet_6.Question_1;
/*Design the “GeometricObject” class that contains the
following components.
Data Members: color of type string and filled of type
boolean.
Methods: suitable constructor(s), setters, getters, and override the
toString()method.
Abstract Methods: getArea() and getPerimeter().*/
abstract public class GeometricObject implements Comparable {
    protected String color;
    protected boolean filled;

    public GeometricObject() {
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    @Override
    public String toString() {
        return " GeometricObject{" + "color= " + color + ", filled= " + filled + '}';
    }
    
    abstract public double getArea();
    
    abstract public double getPerimeter();
    
    //for Question 3
    public int compareTo(GeometricObject ob){
        if(this.getArea() > ob.getArea())
            return 1;
        else if (this.getArea() == ob.getArea())
            return 0;
        else
            return -1;
    }
}
