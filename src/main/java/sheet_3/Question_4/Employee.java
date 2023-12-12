
package sheet_3.Question_4;

public class Employee {
    //Data members
    private String name;
    private String dept;
    private int noOfHours;
    private double salary;
    
    //Methods
    public Employee() {
    }

    public Employee(String name, String dept, int noOfHours, double salary) {
        this.name = name;
        this.dept = dept;
        this.noOfHours = noOfHours;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setNoOfHours(int noOfHours) {
        this.noOfHours = noOfHours;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public int getNoOfHours() {
        return noOfHours;
    }

    public double getSalary() {
        return salary;
    }
    
    public void addSalary(){
        if(this.salary < 1000)
            salary+=500;
    }
    
    public void addWork(){
        if(this.noOfHours > 8)
            salary+=100;
    }

    @Override
    public String toString() {
        return "Employee{ " + "name: " + name + ", dept: " + dept + ", noOfHours: " + noOfHours + ", salary: " + salary + " }\n";
    }
    
    
}
