
package sheet_6.Question_2;

public class Q2_main {
    public static void main(String args[]){
        Movable m = new MovablePoint(10,10,5,2);
        System.out.println("-- Before moving Right& Up --\n"+m.toString());
        m.moveRight();
        m.moveUp();
        System.out.println("-- After moving --\n"+m.toString());
        System.out.println("-- Before moving left & down --\n"+m.toString());
        m.moveLeft();
        m.moveDown();
        System.out.println("-- After moving --\n"+m.toString());
        
    }
}
