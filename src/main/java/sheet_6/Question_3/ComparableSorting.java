
package sheet_6.Question_3;

public class ComparableSorting {
    
    public static <T extends Comparable> T swap(T x, T dummy){
        return x;
    }
    
    public static <T extends Comparable> void sort(T a[]){
        for(int i=0; i<a.length-1;i++)
            for(int j=i+1;j<a.length;j++)
                if(a[i].compareTo(a[j])>0)
                    a[i]=swap(a[j],a[j]=a[i]);
    }
}
