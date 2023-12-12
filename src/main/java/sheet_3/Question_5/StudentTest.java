
package sheet_3.Question_5;

import java.util.Scanner;

/*Data members: an array of students;
Methods: insert student’s data,
find the students with the highest total degree,
find the students who are on probation, which means their CGPA falls below 2 for TWO consecutive semesters.*/
public class StudentTest {
    private Student [] st;
    
    public StudentTest(){
    }

    public StudentTest(Student[] st) {
        this.st = st;
    }
    
    public void insertStudents(){
        String sName;
        Date bdate;
        int maxDeg;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the max degree of a subject");
        maxDeg=in.nextInt();
        System.out.print("Enter the number of students: ");
        int n = in.nextInt();
       
        st = new Student[n];
        System.out.println("--- Enter students data ---");
        for(int i=0;i<st.length;i++){
            float degs[]=new float[3];
            float cGpa[]=new float[5];
            System.out.println("-- Student "+(i+1)
                    +" --\n Enter the name:");
            in.nextLine(); // Add this line to consume the newline character
            sName=in.nextLine();//take all line
            System.out.println(sName);
            System.out.println("Enter the brith date (day month year): ");
            bdate = new Date(in.nextInt(),in.nextInt(),in.nextInt());
            System.out.println("Enter the student degrees: ");
            degs[0]=in.nextFloat();
            degs[1]=in.nextFloat();
            degs[2]=in.nextFloat();
            System.out.println("Enter student cGpa: ");
            for(int j=0 ; j<cGpa.length;j++)
                cGpa[j]=in.nextFloat();
            
            //Assgin everything to the student object
            st[i]=new Student(sName, bdate, maxDeg, degs, cGpa);
        }
    }
    
    //find the students with the highest total degree
    public Student highTotal(){
        float sum[]= new float[st.length];
        for(int i=0;i<sum.length;i++){
            int s=0;
            float alldeg[] = st[i].getDegrees();
            s+=alldeg[0]+alldeg[1]+alldeg[2];
            sum[i]=s;
        }
        float max=sum[0];
        int index=0; //i will use that to return the student with highest degree
        for(int i=0;i<sum.length;i++){
            if(sum[i]>max){
                max=sum[i];
                index=i;
            }
            System.out.println(sum[i]);
        }
        return st[index];
    }
    
    //find the students who are on probation, which means their CGPA falls below 2 for TWO consecutive semesters.
    public void cGpaFalls(){
        float g[];
        int noSemester;
        for(Student s:st){
            g=s.getCGPA();
            noSemester=0;
            for(int i=0;i<g.length-1;i++){
                if(g[i] < 2 && g[i+1] < 2){
                    noSemester++;
                    if(noSemester >= 2){
                        s.display();
                        break;
                    }
                }
                else
                    noSemester = 0; // Reset the count if not consecutive
                
                
            }
            
        }
    }
    
    //display all student
    public void display(){
        for(Student s: st)
            s.display();
    }
}
