
package sheet_2.Question_4;

public class Q4_main {
    
    public static void main (String args[]){
        Invoice.Cashier c = new Invoice.Cashier("ahmed");
        Invoice I = new Invoice (1,"this is an arbitrary item",3,15);
        System.out.println(c);
        I.display();
        //System.out.println(I);
    }
}
