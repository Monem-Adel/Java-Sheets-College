
package sheet_2;

import java.util.Scanner;


public class Question_2 {
    
    public static int reverse(int n){
        int reversedNo=0;
        while(n!=0){
            reversedNo*=10;
            reversedNo+=n%10;
            n/=10;
        }
        return reversedNo;
    }
    
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Enter an integer number");
        num = in.nextInt();
        System.out.print("NO. after reversed " + reverse(num));
    }
}
