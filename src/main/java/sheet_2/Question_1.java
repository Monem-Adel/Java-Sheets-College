
package sheet_2;

import java.util.Scanner;


public class Question_1 {
    
    public static int count(int n){
        int counter=0;
        while(n!=0){
            n/=10;
            counter++;
        }
        return counter;
    }
    
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Enter an integer");
        num = in.nextInt();
        System.out.print("Number of digit of this integer  is : " + count(num));
    }
}
