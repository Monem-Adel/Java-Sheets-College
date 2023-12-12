
package sheet_2.Question_6;

public class Book {
    //---data member---
    private String ISBN, name, publisher;
    private Author author;
    private float price;
    
    //--- methods---

    public Book() {
    }

    public Book(String ISBN, String name, String publisher, Author author, float price) {
        this.ISBN = ISBN;
        this.name = name;
        this.publisher = publisher;
        this.author = author;
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

    public void setAuthor(Author author) {
        this.author = author;
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

    public Author getAuthor() {
        return author;
    }

    public float getPrice() {
        return price;
    }
    
    @Override
    public String toString(){
        return (" Name: "+this.getName()
                +"\n ISBN: "+this.getISBN()
                +"\n Author: "+this.getAuthor()
                +"\n Publisher: "+this.getPublisher()
                +"\n Price: "+this.getPrice());
    }
    
    public boolean equals(Book b){
        return (this.ISBN==b.ISBN);
    }
}
