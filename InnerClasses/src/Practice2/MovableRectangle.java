package Practice2;

public class MovableRectangle implements Movable {

    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    private MovableRectangle() {
        topLeft.setX(4);
        topLeft.setY(2);
        bottomRight.setX(4);
        bottomRight.setY(-2);
    }


    @Override
   public String toString() {
       return "Coordinates topLeft = " + topLeft + ", bottomRight = " + bottomRight;
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
