
package sheet_3.Question_3;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle() {
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }
    
    public float getPerimeter(){
        return 2*(length+width);
    }
    
    public float getArea(){
        return length*width;
    }

    @Override
    public String toString() {
        return "Rectangle { " + "length=" + length + ", width=" + width + ", perimeter="+this.getPerimeter()+", area="+this.getArea()+" }\n";
    }
}
