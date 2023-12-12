
package sheet_6.Question_1;

import java.util.Arrays;

/*
Test the classes with an array of geometric objects, which contains
different types of geometric objects (circles, rectangles, and
squares). Then, show the information of geometric objects whose
areas exceed 20.
 */
public class Q1_main {
    public static void main (String args[]){
        GeometricObject shapes[] = new GeometricObject[3];
        shapes [0]= new Circle(2,"Red",true);
        shapes[1] = new Rectangle(5,6,"Green",false);
        shapes[2] = new Square (4,"Blue",true);
        
        System.out.println("-- All shapes --");
        System.out.println(Arrays.toString(shapes));
        
        for(int i=0; i<shapes.length;i++){
            if(shapes[i].getArea() > 20)
                System.out.println(shapes[i]);
        }
    }
}
