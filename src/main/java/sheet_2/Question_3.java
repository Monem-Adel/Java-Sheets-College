
package sheet_2;

import java.util.Scanner;

public class Question_3 {
    
    public static void pattern_1(int n){
        char c=65;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print(c+" ");
            c++;
            System.out.print("\n");
        }
    }
    
    public static void pattern_2(int n){
        int num=0;
        for(int i=1;i<=n;i++){
            num=2*i-1;
            for(int j=1;j<=n-i;j++)
                System.out.print("  ");
            for(int j=i;j<=num;j++)
                System.out.print(j + " ");
            for(int j=num-1;j>=i;j--)
                System.out.print(j + " ");
            System.out.println();

        }
    }
    
    public static void main (String args[]){
            Scanner in = new Scanner(System.in);
            int NofLines;
            System.out.println("Enter the Number of lines");
            NofLines = in.nextInt();
            System.out.println("What pattern you want 1 or 2 ?");
            switch(in.nextInt()){
                case 1: pattern_1(NofLines);
                        break;
                case 2 : pattern_2(NofLines);
                        break;
            }

    }
         
}
