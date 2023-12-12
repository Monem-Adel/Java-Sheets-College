
package sheet_2.Question_6;

public class Q6_main {
    public static void main(String args[]){
        Author author1=new Author("Monem","Monem.123@randammail.com");
        Book book1=new Book("0123456789","Code of Duty","Adel's center",author1,250);
        Author author2=new Author("Hamza","Hamza.123@randammail.com");
        Book book2=new Book("0123456789","Swoop into OOP, set your code free!","Adel's center",author2,150);
        
        System.out.println("Book one:-");
        System.out.println(book1.toString());
        System.out.println("Book two:-");
        System.out.println(book2.toString());
        
        System.out.println("Are they equals ?");
        System.out.println(book1.equals(book2));
    }
}
