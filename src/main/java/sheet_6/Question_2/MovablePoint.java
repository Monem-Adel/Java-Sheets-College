
package sheet_6.Question_2;
/**Design the “MovablePoint” class that uses the above interface
and contains the following components.
Data members: the 𝑥 − and 𝑦 −coordinates of type float,
𝑥Amount and 𝑦Amount of type float.
Methods: suitable constructors and override the toString()
method to return a string description of the movable point instance
in the format (𝑥, 𝑦) Amount= (𝑥𝐴𝑚𝑜𝑢𝑛𝑡, 𝑦𝐴𝑚𝑜𝑢𝑛𝑡).*/
public class MovablePoint implements Movable {
    private float x, y, xAmount, yAmount;

    public MovablePoint() {
    }

    public MovablePoint(float x, float y, float xAmount, float yAmount) {
        this.x = x;
        this.y = y;
        this.xAmount = xAmount;
        this.yAmount = yAmount;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setxAmount(float xAmount) {
        this.xAmount = xAmount;
    }

    public void setyAmount(float yAmount) {
        this.yAmount = yAmount;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getxAmount() {
        return xAmount;
    }

    public float getyAmount() {
        return yAmount;
    }
    
    @Override
    public void moveRight() {
        this.x+=this.xAmount;
    }

    @Override
    public void moveLeft() {
        this.x-=this.xAmount;
    }

    @Override
    public void moveDown() {
        this.y-=this.yAmount;
    }

    @Override
    public void moveUp() {
        this.y+=this.yAmount;
    }
    
    //the format (𝑥, 𝑦) Amount= (𝑥𝐴𝑚𝑜𝑢𝑛𝑡, 𝑦𝐴𝑚𝑜𝑢𝑛𝑡).
    @Override
    public String toString() {
        return "MovablePoint{("+this.x+','+this.y+") Amount = ("+this.xAmount+','+this.yAmount+") }";
    }
    
    
}
