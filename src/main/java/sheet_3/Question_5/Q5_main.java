
package sheet_3.Question_5;

public class Q5_main {
    public static void main (String args[]){
        StudentTest students = new StudentTest();
        students.insertStudents();
        
        System.out.println("--- The all students ---");
        students.display();
      
        System.out.println("--- The student with hightest total degree ---");
        students.highTotal().display();
        
        System.out.println("--- the students who are on probation ---");
        students.cGpaFalls();
    }
}
