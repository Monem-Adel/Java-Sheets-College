
package sheet_3;

import java.util.Arrays;
import java.util.Scanner;

public class Question_1 {
    
    //first point 
    public static void insertAt(int arr[],int e,int p){
        for(int i=arr.length;i>=p;i--)
            arr[i+1]=arr[i];
        arr[p]=e;
    }
    
    //second point
    public static int[] findPrime(int arr[]){
        int temp [] , primes [];
        int count=0;
        temp = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            boolean flag=true;
            if(arr[i]==1 || arr[i]==0){
                flag=false;
                continue;
            }
            for(int j=2;j<=arr[i]/2;j++){
                if(arr[i]%j==0){
                    flag=false;
                    break;
                }
            }
            if (flag){
                temp[count++]=arr[i];
            }
        }
        //primes= new int[count];
        primes = Arrays.copyOf(temp, count);
        return primes;
    }
    
    //third point
    public static int [][][] getFactors(int arr[]){
        //array to store the factors temporary
        int temp[]= new int[50];//any large size 
        //count; to count the No. of factors
        //index; the iterative index for the new factors to store in temp[index] & its the index of thrid sized array
        int count,index;
        //the returned array for the number & their factors
        int factors[][][]= new int [arr.length][][];
        for (int i=0;i<arr.length;i++){
            count=1;
            index=1;
            temp[0]=arr[i]; //store the Number before its factors(it's one of its factors)
            for(int j=1;j<=arr[i]/2;j++){
                if(arr[i]%j==0){
                    count++;
                    temp[index++]=j;
                }
            }
            //temp[index]=arr[i]; // Is that true
            //putting the factors in the multi-diminsional array
            factors[i]= new int[count][2];
            for(int j=0;j<factors[i].length/*==count*/;j++){
                factors[i][j][0]= temp[j];
                factors[i][j][1]= temp[j]%2==0 ? 1:0;
            }
        }
        return factors;
    }

    
    public static void main(String args[]){
        //first point
        int a[]={3,4,5,7,0,1};
        //int e,p;
//        System.out.println("Before insertion : "+Arrays.toString(a));
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter an integer element & the position");
//        e=in.nextInt();
//        p=in.nextInt();
//        if(p >= a.length) 
//            System.out.println("Error : invaild position");
//        else
//            insertAt(a,e,p);
//        System.out.println("After insertion : "+Arrays.toString(a));
        
        //secont point
//        System.out.println("the primes in the array :");
//        System.out.println(Arrays.toString(findPrime(a)));

        //third point 
        int a2[]={6,3};
        int[][][] printedA = new int[a2.length][][];
        printedA = getFactors(a2);
        System.out.println("FACTORS   odd/even");
        for(int[][] x:printedA){
            for(int [] y:x){
                for(int z:y){
                    System.out.print(z + "   \t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
