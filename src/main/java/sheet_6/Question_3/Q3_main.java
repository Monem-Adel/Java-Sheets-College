
package sheet_6.Question_3;

import java.util.Arrays;
import sheet_6.Question_1.*;

public class Q3_main {
    public static void main (String args[]){
        GeometricObject shapes[] = new GeometricObject[6];
        shapes[0]= new Circle(2,"Red",true);
        shapes[1] = new Rectangle(5,6,"Green",false);
        shapes[2] = new Square (4,"Blue",true);
        shapes[3]= new Circle(5,"Red",true);
        shapes[4] = new Rectangle(10,15,"Green",false);
        shapes[5] = new Square (9,"Blue",true);

        System.out.println("--- Before sorting ---\n"+Arrays.toString(shapes));
        ComparableSorting.sort(shapes);
        System.out.println("--- After sorting ---\n"+Arrays.toString(shapes));

        
        
    
    }
}
