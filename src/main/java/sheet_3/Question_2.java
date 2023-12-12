
package sheet_3;

import java.util.Arrays;
import java.util.Scanner;

//import class Author
import sheet_2.Question_6.Author;

class Book {
    //---data member---
    private String ISBN, name, publisher;
    private Author authors[];
    private float price;
    
    //--- methods---

    public Book() {
    }

    public Book(String ISBN, String name, String publisher, Author[] authors, float price) {
        this.ISBN = ISBN;
        this.name = name;
        this.publisher = publisher;
        this.authors = authors;
        this.price = price;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getName() {
        return name;
    }

    public String getPublisher() {
        return publisher;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public float getPrice() {
        return price;
    }
    
    @Override
    public String toString(){
        return (" Name: "+this.getName()
                +"\n ISBN: "+this.getISBN()
                +"\n Authors: "+Arrays.toString(this.getAuthors())
                +"\n Publisher: "+this.getPublisher()
                +"\n Price: "+this.getPrice()+" $");
    }
    
    public boolean equals(Book b){
        return (this.ISBN==b.ISBN);
    }
}

public class Question_2 {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter No. of Authors of the book: ");
        Author[] authors = new Author[in.nextInt()];
        System.out.println("Enter the names of authors & their E-mail :-");
        for (int i=0 ; i<authors.length ; i++){
            System.out.println("Auther "+(i+1)+"\t -\t Email ");
            authors[i] = new Author(in.next(),in.next());
        }
        
        Book book=new Book("0123456789","Code of Duty","Adel's center",authors,250);
        
        System.out.println("Book :-");
        System.out.println(book.toString());
      
    }
}
