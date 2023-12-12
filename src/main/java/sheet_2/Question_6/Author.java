
package sheet_2.Question_6;

public class Author {
    //--- data member ---
    private String name;
    private String email;
    
    //--- methods ---
    public Author(){
        this.name="";
        this.email="";
    }
    
    public Author(String name,String email){
        this.name=name;
        this.email=email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    
    public void display(){
        System.out.println("\n\tThe Author name: "+this.getName());
        System.out.println("\n\tThe Email: "+this.getEmail());
    }
    
    @Override
    public String toString(){
        return ("\n\tThe Author name: "+this.getName()
                +"\n\tThe Email: "+this.getEmail());
    }
}
