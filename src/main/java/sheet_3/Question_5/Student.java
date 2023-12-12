
package sheet_3.Question_5;

import java.util.Arrays;

/*Data members:
• rolling number,
• name,
• birthDate,
• maxDegree (which should be fixed for all subjects),
• an array of degrees for 3 subjects (each of the 3 degrees has
to be verified as being within the specified range),
• an array of CGPAs for 5 semesters,
• and a static variable named “count”, which keeps track of the
total number of enrolled students. The “count” variable can
be used to set the value of the rolling number for each
student.*/
public class Student {
    
    private int rolNo;
    private String name;
    private Date bdate;
    final private int maxDegree;
    private float degrees[];/* = new float[3];*/
    private float CGPA[];/*= new float[5];*/
    static private int count=1;

    public Student(int maxdegree) {
        this.rolNo=count;
        count++;
        this.maxDegree = maxdegree;
    }

    public Student(String name, Date bdate, int maxdegree, float[] degrees, float[] CGPA) {
        this.maxDegree = maxdegree;
        this.rolNo = count;
        count++;
        this.name = name;
        this.bdate=bdate;
        if(degrees.length!=3){
            System.out.println("Error: illegel range of degrees");
            throw new IllegalArgumentException("Illegal range degrees");
        }
        for(int i=0;i<degrees.length;i++)
            if(degrees[i]<0 || degrees[i]> this.maxDegree){
                System.out.println("Error: illegal degree");
                throw new IllegalArgumentException("illegal degree");
                }
        this.degrees=degrees;
        
        if(CGPA.length!=5){
            System.out.println("Error: illegel range of semesters");
            throw new IllegalArgumentException("Illegal range semesters");
        }
        for(int i=0;i<CGPA.length;i++)
            if(CGPA[i]<0 || CGPA[i]> 4){
                System.out.println("Error: illegal CGPA");
                throw new IllegalArgumentException("illegal CGPA");
                }
        this.CGPA=CGPA;
    }
    
    //setter & getter

    public void setRolNo(int rolNo) {
        this.rolNo = rolNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBdate(Date bdate) {
        this.bdate = bdate;
    }

    public void setDegrees(float[] degrees) {
        this.degrees = degrees;
    }

    public void setCGPA(float[] CGPA) {
        this.CGPA = CGPA;
    }

    public static void setCount(int count) {
        Student.count = count;
    }

    public int getRolNo() {
        return rolNo;
    }

    public String getName() {
        return name;
    }

    public Date getBdate() {
        return bdate;
    }

    public int getMaxDegree() {
        return maxDegree;
    }

    public float[] getDegrees() {
        return degrees;
    }

    public float[] getCGPA() {
        return CGPA;
    }

    public static int getCount() {
        return count;
    }
    
    
    
    public char [] calGradeOfEachSubject(){
        char grade[]=new char[3];
        for (int i=0;i<grade.length;i++){
            float precent=(this.degrees[i]/this.maxDegree)*100;
            if(precent >= 85)
                grade[i]='A';
            else if(precent < 85 
                    && precent >= 75)
                grade[i]='B';
            else if(precent < 75
                    && precent >= 65)
                grade[i]='C';
            else if(precent  < 65
                    && precent >= 60)
                grade[i]='D';
            else 
                grade[i]='F';
        }
        return grade;
    }
    
    public char calgrade(){
        float precent=0;
        for(int i=0;i<this.degrees.length;i++)
            precent+=this.degrees[i];
        //precent % = (sum of degrees of all subject)/(No. of subjects * the max degree of each subject))*100
        precent = (precent/(3*this.maxDegree))*100;
        //calculate grade depends on the %
        if( precent >= 85)
                return 'A';
            else if( precent < 85 
                    && precent >= 75)
                return 'B';
            else if( precent < 75
                    && precent >= 65)
                return 'C';
            else if( precent  < 65
                    && precent>= 60)
                return 'D';
            else 
                return 'F';
        }
    
    //display info of student
    public void display(){
        System.out.println("--- Info of student ---");
        System.out.print("The name: "+this.name
                    +"\n rolling NO.: "+this.rolNo
                    +"\n Birth date: ");
        this.bdate.display();//because its a void method can't be called in s.o.p
        System.out.println("The degrees in each subject: "+Arrays.toString(this.degrees)
                    +"\n The grade for each subject: "+Arrays.toString(this.calGradeOfEachSubject())
                    +"\n The CGPA for 5 semesters: "+Arrays.toString(this.CGPA)
                    +"\n The complete Grade: "+this.calgrade());
    }
}
