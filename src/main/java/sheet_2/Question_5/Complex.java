
package sheet_2.Question_5;

//complex No is : X+Yi such that i= √(-1)        
public class Complex {
    //--- data member ---
    private float rel;
    private float img;
    
    public Complex(){
        rel=0;
        img=0;
    }
    
    public Complex(float rel,float img){
        this.rel=rel;
        this.img=img;
    }

    public void setRel(float rel) {
        this.rel = rel;
    }

    public void setImg(float img) {
        this.img = img;
    }

    public float getRel() {
        return rel;
    }

    public float getImg() {
        return img;
    }
    
    public boolean isReal(){
        return (this.img==0);
    }
    
    public boolean isImaginary(){
        return (this.rel==0);
    }
    
    //equals(Complex c) to compare two complex numbers
    public boolean equals(Complex x){
        return ((this.rel == x.rel)&&(this.img==x.img));
    }
    
    //add two complex: (𝑎 + 𝑏𝑖) + (𝑐 + 𝑑𝑖) = (𝑎 + 𝑐) + (𝑏 + 𝑑)𝑖
    public Complex addTo(Complex x){
        Complex result = new Complex();
        result.rel=this.rel+x.rel;
        result.img=this.img+x.img;
        return result;
    }
    
    //multiply two complex: (𝑎 + 𝑏𝑖)(𝑐 + 𝑑𝑖) = (𝑎𝑐 − 𝑑𝑏) + (𝑎𝑑 + 𝑏𝑐)𝑖
    public Complex multiplyTo(Complex x){
        Complex result = new Complex();
        result.rel=(this.rel*x.rel)-(this.img*x.img);
        result.img=(this.rel*x.img)+(this.img*x.rel);
        return result;
    }
    
    //return the conjugate of the complex number (conjugate ((𝑎 + 𝑏𝑖)) = (𝑎 − 𝑏𝑖));
    public Complex conjugate(){
        return new Complex(this.rel,-this.img);
    }
    
    //The magnitude of a complex number is a measure of its distance from the origin in the complex plane.
    //The magnitude is given by the formula:|a + bi| = √(a^2 + b^2)
    public double magnitude(){
        return Math.sqrt(Math.pow((double)rel,2.0)+Math.pow((double)img,2.0));
    }
    
    //print the complex number in the following form: real+imag 𝑖.
    public void display(){
        System.out.println(this.rel+(this.img < 0 ? " ":" + ")+(this.img)+"i");
    }
    //With toString
    @Override
    public String toString(){
        return (this.rel+(this.img < 0 ? " ":" + ")+(this.img)+"i");
    }
    
}
