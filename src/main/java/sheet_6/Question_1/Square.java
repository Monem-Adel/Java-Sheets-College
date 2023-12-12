
package sheet_6.Question_1;

/**
Design also the “Square” class, which is a subclass of the
Rectangle class and contains the following methods: suitable
constructors, setSide(), getSide(), and override the
toString()method.
 */
public class Square extends Rectangle {

    public Square() {
        super();
    }

    public Square(float side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public void setSide(float side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public float getSide() {
        return length;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean isFilled() {
        return filled;
    }

    @Override
    public String toString() {
        return "Square{Side= "+ this.length +" Color= "+this.color+" "
                + "Filled= "+this.filled+" Area= "+this.getArea()+" Perimeter= "+this.getPerimeter() + '}';
    }
    
    
}
