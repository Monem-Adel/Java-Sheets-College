
package sheet_3.Question_4;

import java.util.Arrays;

/*Test the class with an array of employees and display all
information about employees whose salary is less than 500.
Display also all information about employees whose working hours
exceed 8 hours. Update the salaries of the employees according to
the specified rules.
You should override the toString() method for displaying
information about employees.*/
public class Q4_main {
    public static void main (String args [] ){
        Employee emps[] = new Employee[4];
        emps [0] = new Employee("Abo Ubaida","El-Qassam",24,400);
        emps [1]= new Employee("Abo Hamza","Sraya El-Quds",20,300);
        emps [2] = new Employee("Usama Hemdan","PR",8,1000);
        emps [3] = new Employee ("Salah El-ga3fary","Journalist",10,100);
        
        //display all information about employees whose salary is less than 500
        System.out.println("The Employees whose salary is less than 500");
        for(int i=0;i<emps.length;i++)
            if(emps[i].getSalary()< 500)
                System.out.println(emps[i].toString());
        
        //Display also all information about employees whose working hours exceed 8 hours
        System.out.println("The Employees whose working hours exceed 8 hours");
        for(int i=0;i<emps.length;i++)
            if(emps[i].getNoOfHours()> 8)
                System.out.println(emps[i].toString());
        
        //Update the salaries of the employees according to the specified rules.
        for(int i=0;i<emps.length;i++){
            emps[i].addSalary();
            emps[i].addWork();
        }
        System.out.println("---- All the Employees after the updating ----");
        System.out.println(Arrays.toString(emps));
    }
}
