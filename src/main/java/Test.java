interface A extends B {
default void m(){
System.out.println("interface A");
}
}
interface B {

default void m(){
System.out.println("interface B");
}
}
class C implements A,B{
/*@Override
public void m(){
System.out.println("class C");
}*/
}
public class Test{
public static void main (String args[]){
A a;
a=new C();
a.m();
B b =new C();
b.m();
}
}
