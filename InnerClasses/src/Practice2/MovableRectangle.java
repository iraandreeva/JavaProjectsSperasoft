package Practice2;

public class MovableRectangle implements Movable {

    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle() {
        topLeft = new MovablePoint(4,2);
        bottomRight = new MovablePoint(-4, 2);
    }


    @Override
   public String toString() {
       return "TopLeft " + topLeft + ", bottomRight " + bottomRight;
   }

   @Override
    public void moveLeft() {
       topLeft.moveLeft();
       bottomRight.moveLeft();
   }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        topLeft.moveUp();
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }
}
