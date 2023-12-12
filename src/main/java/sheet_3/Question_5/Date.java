
package sheet_3.Question_5;

public class Date {
    
    private int day, month, year;

    public Date() {
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public boolean equals(Date d) {
        if (this.day != d.day) 
            return false;
        if (this.month != d.month) 
            return false;
        return this.year == d.year;
    }
    
    public void display(){
        System.out.println("Date: "+this.day+'/'+this.month+'/'+this.year);
    }
    
}
