package Practice2;

public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    private Position penPosition;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
            penPosition.y--;
        }

        @Override
    public void moveDown() {
            penPosition.y++;
        }



    public void moveLeft() {
            penPosition.x--;
    }

    public void moveRight() {
            penPosition.x++;
        }
    }


    class Position {
        int x;
        int y;

        public Position() {
            x = 0;
            y = 0;
        }

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
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

        public void setPos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
