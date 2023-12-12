/*Notes:-
    - The class ; its first letter must be uppercase
    - The class name must be the same name of the file
    - Inside the file must have only one public class & that is the class contains the main method
    - Math.sqrt(): is a static method in the Math class
    - Note that: the general law : (-b ±  √(b^2 - 4ac))/(2a)
     (b*b-4*a*c)=> is a determinant if it > 0 the roots is real numbers , it < 0 the roots is imaginary numbers , it = 0 then root1 equals root 2
*/
package sheet_1;

import java.util.Scanner;

public class Sheet_1 {
    
    //Q1-new sheet1)
    /*public static void main (String argsp[]){
        //Block one)
        int x=5; 
        double y=x;
        System.out.println("y= "+y);
        double a=2.7;
        int b=(int)a;
        System.out.println("b= "+b);
        float c=2.7f;
        double d=(double)c;
        System.out.println("d= "+d);
        
        //Block two)
        char e='x';
        e++;
        System.out.println("e= "+e);
        char f=(char)90;
        System.out.println("f= "+f);
    }*/
    
    //Q2)
   /*public static void main(String[] args) {
        
        int n1,n2;   
        //the command line arguments
        //Right click on the project -> properties -> run => at arguments field write the numbers that is the array args in the parameter int main method
        //n1=Integer.parseInt(args[0]);
        //n2=Integer.parseInt(args[1]);
        
        //to read an input form user (using scanner class)
        Scanner in= new Scanner (System.in);
        do{
        System.out.println("Enter two integer number : ");
        n1=in.nextInt();
        n2=in.nextInt();
        
        if(n2==0) System.out.println("the second number shouldn't be zero");
        }while(n2==0);
        System.out.println("The quotient = "+n1/n2);
        System.out.println("The remainder = "+n1%n2);
    }
    
    //Q3)
    /*public static void main (String args[]){
        int B,E,result;
        Scanner in= new Scanner (System.in);
        System.out.println("Enter two nubmer ; base and exponent respectivly");
        B=in.nextInt();
        E=in.nextInt();
        result=B;
        for(int i=1;i<E;i++)
            result*=B;
        System.out.println("the result = "+result);
    }*/
    
    //Q4)
    /*public static void main (String args[]){
        double a,b,c,r1,r2;
        Scanner in= new Scanner (System.in);
        System.out.println("Enter The three term's coeffient a,b & c :");
        a=in.nextDouble();
        b=in.nextDouble();
        c=in.nextDouble();
        
        //Note that: the general law : (-b ±  √(b^2 - 4ac))/(2a)
        //(b*b-4*a*c)=> is a determinant if it > 0 the roots is real numbers , it < 0 the roots is imaginary numbers , it = 0 then root1 equals root 2
        if((b*b-4*a*c) > 0) {
            r1=(-b + Math.sqrt(b*b-4*a*c))/(2*a);
            r2=(-b - Math.sqrt(b*b-4*a*c))/(2*a);
            
            System.out.println("The roots : "+ r1 + " , "+r2);
        } 
        
        else if (((b*b-4*a*c)  <0)) {
            r1=(-b + Math.sqrt(-(b*b-4*a*c)))/(2*a);
            r2=(-b - Math.sqrt(-(b*b-4*a*c)))/(2*a);
            
            System.out.println("The roots : "+ r1 + "i , "+r2+"i");
        }
        else {
            r1 = r2 = -b/(2*a);
            System.out.println("The roots : "+ r1 + " , "+r2);
        }
    }*/
    
   
    //Q5)
    /*public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        int n,f0,f1,fi;
        f0=0;
        f1=1;
        System.out.println("Enter the an index number of Fibonacci");
        n=in.nextInt();
        System.out.print("The Fibonacci series is : "+f0+"  "+f1);
        for(int i=1;i<=n-2;i++){
            fi=f0+f1;
            f0=f1;
            f1=fi;
            System.out.print("  "+fi);
        }
    }*/
    
    
    //Q6)
    /*public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("Enter three numbers : ");
        n1=in.nextInt();
        n2=in.nextInt();
        n3=in.nextInt();
        
        if(n1 > n2 && n1 > n3)
            System.out.println("The largest No. is "+n1);
        else if (n2 > n3)
            System.out.println("The largest No. is "+n2);
        else 
            System.out.println("The largest No. is "+n3);
    }*/
    
    //Q7)
    /*public static void main (String args[]){
       Scanner in = new Scanner(System.in);
       int n,m;
       System.out.println("Enter two number");
       n=in.nextInt();
       m=in.nextInt();
       System.out.print("Primes :");
       
       if(m < n){
           for(int i=m;i<=n;i++){
               boolean flag=true;
               if(i==1) flag=false;
               for(int j=2;j<=i/2;j++){
                   if(i%j==0){
                       flag = false;
                       break;
                   }   
               }
               if(flag)
                   System.out.print(" "+i);
           }
       }
       else {
           for(int i=n;i<=m;i++){
               boolean flag=true;
               if(i==1) flag=false;
               for(int j=2;j<=i/2;j++){
                   if(i%j==0){
                       flag = false;
                       break;
                   }   
               }
               if(flag)
                   System.out.print(" "+i);
           }
       }
    }*/
}
