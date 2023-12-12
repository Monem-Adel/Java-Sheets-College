
package sheet_3.Question_3;

import java.util.Arrays;

class WrapperR {
    Rectangle t;
    public WrapperR(Rectangle r){
        this.t=r;
    }
}

public class Q3_main {
    /*public static void Exchange(WrapperR x,WrapperR y){
        Rectangle temp=x.t;
        x.t=y.t;
        y.t=temp;
    }*/
    public static Rectangle Exchange2(Rectangle x, Rectangle y){
        return x;
    }
    public static void main (String args[]){
        Rectangle R[]= new Rectangle[6];
        
        R[0]= new Rectangle(40,40);
        R[1]= new Rectangle(40,50);
        R[2]= new Rectangle(40,50);
        R[3]= new Rectangle(10,20);
        R[4]= new Rectangle(10,15);
        R[5] = new Rectangle(40,60);
        
        //show all info. of Rectangles
        for (int i=0;i<R.length;i++)
            System.out.println((i+1)+"- "+R[i].toString());
        
        //show all info. for those their areas > 1500
        System.out.println("The Rectangles whose area exceeds 1500");
        for (int i=0;i<R.length;i++){
            if(R[i].getArea()>1500)
                System.out.println(R[i].toString());
        }
        
        //Exchanging the Rectangles whose lengths are same but different in width
        //using wrapper class
        
        //show all info before exchanging 
        System.out.println("all Rectangles before exchanging:-\n"+Arrays.toString(R));
        /*for(int i=0 ; i<R.length-1;i++){
            WrapperR o1,o2;
            o1=new WrapperR(R[i]);
            //System.out.println(o1.t.toString());
            for(int j=i+1;j<R.length;j++){
                o2=new WrapperR(R[j]);
               // System.out.println(o2.t.toString());
                if(R[i].getLength()==R[j].getLength()
                        && R[i].getWidth()!=R[j].getWidth()){
                    //Exchange(o1,o2);
                    R[i]=Exchange2(R[j],R[j]=R[i]);
                    break;
                }
            }    
        }*/
        WrapperR rr[]=new WrapperR[R.length];
        for(int i=0;i<R.length;i++){
            rr[i]=new WrapperR(R[i]);
        }
        exchange(rr);
        //show all info after exchanging
        System.out.println("all Rectangles after exchanging:-\n"+Arrays.toString(R));
    }
    public static void exchange(WrapperR r[]){
          //Rectangle s;
       for(int i=0 ; i<r.length ; i++){
                for(int j=i+1;j<r.length;j++){
                   if(r[i].t.getLength()==r[j].t.getLength()){
                       if(r[i].t.getWidth() != r[j].t.getWidth()){
                           Rectangle temp = r[i].t;
                           r[i].t=r[j].t;
                           r[j].t=temp;
                       }
                   }
                }
       }
    }
}
