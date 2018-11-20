package Practice2;

public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint() {
        x = 0;
        y = 0;
        xSpeed = 1;
        ySpeed = 1;
    }

    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
        xSpeed = 1;
        ySpeed = 1;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }



    public String toString() {
        return "Coordinates x = " + x + ", y = " + y;
    }

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {

            y = y + ySpeed;
        }

        @Override
    public void moveDown() {
            y = y - ySpeed;
        }


    @Override
    public void moveLeft() {
            x = x - xSpeed;
    }

    @Override
    public void moveRight() {
            x = x + xSpeed;
        }
    }


