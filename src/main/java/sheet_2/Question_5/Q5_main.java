
package sheet_2.Question_5;

import java.util.Scanner;

public class Q5_main {
    public static void main(String args[]){
        Complex c1,c2;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two complex number; real part & imaginary part respectively");
        c1=new Complex(in.nextFloat(),in.nextFloat());
        c2=new Complex (in.nextFloat(),in.nextFloat());
        
        System.out.println("check the numbers:-");
        System.out.println("The first No is  purly real ? "+c1.isReal());
        System.out.println("The first No is purly imaginary ? "+c1.isImaginary());
        System.out.println("The second No is purly real ? "+c2.isReal());
        System.out.println("The second No is purly real ? "+c2.isImaginary());
        
        System.out.println("Is the two numbers equals ? "+c1.equals(c2));
        
        Complex sum =c1.addTo(c2);
        System.out.print("the sum of two No. = ");
        sum.display();
        
        Complex mult=c1.multiplyTo(c2);
        System.out.print("the multiplication of two No. = ");
        System.out.println(mult.toString());
        
        System.out.println("the conjugate of two Numbers :");
        System.out.print("first No. :");
        System.out.println(c1.conjugate());
        System.out.print("second No. :");
        System.out.println(c2.conjugate());
        
        System.out.println("the magnitude of two No. :");
        System.out.println("Num1 = "+c1.magnitude()+
                           "\nNum2 = "+c2.magnitude());
        
        System.out.println("----- THANK YOU -----");
    }
}
