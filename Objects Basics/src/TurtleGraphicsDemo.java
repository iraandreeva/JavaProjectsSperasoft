import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

enum  Direction {
    Up,
    Down,
    Right,
    Left
}

public class TurtleGraphicsDemo {


    public static void main(String[] args) {
        TurtleGraphicsDemo turtleGraphicsDemo = new TurtleGraphicsDemo();
        turtleGraphicsDemo.run();
    }

    public void run() {
        int width;
        int height;
        int x, y;

        Scanner n = new Scanner(System.in);
        System.out.println("Enter width of the board:");
        width = n.nextInt();
        System.out.println("Enter height of the board:");
        height = n.nextInt();

        System.out.println("Enter start position x < " + width);
        x = n.nextInt();
        while (x > width || x < 0)
        {
            System.out.println("ERROR. Enter start position x < " + width);
            x = n.nextInt();
        }
        System.out.println("Enter start position y < " + height);
        y = n.nextInt();
        while (y > height || y < 0)
        {
            System.out.println("ERROR. Enter start position y < " + height);
            y = n.nextInt();
        }

        TurtleGraphics demo = new TurtleGraphics(width, height, x, y);

        demo.printBoard();


        System.out.println("Let\'s begin. What do you want to do? \n" +
                "1) Go up. Enter 'u' and number of cells\n " +
                "2) Go down. Enter 'd' and number of cells\n" +
                "3) Go right. Enter 'r' and number of cells\n" +
                "4) Go left. Enter 'l' and number of cells\n" +
                "5) Clear the board. Enter 'c'");
        Scanner moo = new Scanner(System.in);

        while (true) {
            String move = moo.nextLine();
            String direction = move.substring(0, 1);
            Direction curDir = Direction.Up;

            switch (direction) {
                case "u":
                    curDir = Direction.Up;
                    break;
                case "d":
                    curDir = Direction.Down;
                    break;
                case "r":
                    curDir = Direction.Right;
                    break;
                case "l":
                    curDir = Direction.Left;
                    break;
            }
            if(direction.equals("c"))
                demo.clearBoard();
            else {
                String number = move.substring(2, 3);
                int length = Integer.parseInt(number);
                demo.movePen(curDir, length);
            }
            demo.printBoard();
        }

    }
}

class TurtleGraphics {

    private char[][] board;
    private Position penPosition;
    private static final char cellChar = '.';
    private static final char coloredCellChar = 'o';
    private static final char penChar = 'x';


    public TurtleGraphics(int width, int height) {

        board = new char[width][height];
        penPosition = new Position();
        clearBoard();
        fillCell();
    }

    public TurtleGraphics(int width, int height, int x, int y) {

        board = new char[width][height];
        penPosition = new Position(x, y);
        clearBoard();
        fillCell();
    }

    public void movePen(Direction dir, int length) {
        switch (dir) {
            case Up:
                movePenUp(length);
                break;
            case Down:
                movePenDown(length);
                break;
            case Left:
                movePenLeft(length);
                break;
            case Right:
                movePenRight(length);
                break;
        }
    }

    public void movePenUp(int length) {
        for (int i = 0; i < length; i++) {
            if (penPosition.y - 1 < 0)
                break;
            penPosition.y--;
            fillCell();
        }

    }

    public void movePenDown(int length) {
        for (int i = 0; i < length; i++) {
            if (penPosition.y + 1 >= board[0].length)
                break;
            penPosition.y++;
            fillCell();
        }
    }

    public void movePenLeft(int length) {
        for (int i = 0; i < length; i++) {
            if (penPosition.x - 1 < 0)
                break;
            penPosition.x--;
            fillCell();
        }
    }

    public void movePenRight(int length) {
        for (int i = 0; i < length; i++) {
            if (penPosition.x + 1 >= board.length)
                break;
            penPosition.x++;
            fillCell();
        }
    }

    public void clearBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = cellChar;
            }
        }

        fillCell();
    }

    public void fillCell() {
        if (board[penPosition.x][penPosition.y] == cellChar) {
            board[penPosition.x][penPosition.y] = coloredCellChar;
        }

    }

    public void printBoard() {
        for (int i = 0; i < board.length; i++)
            System.out.print("__\t");
        System.out.print("\n");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (j == penPosition.x && i == penPosition.y)
                    System.out.print(penChar + "\t");
                else
                    System.out.print(board[j][i] + "\t");
            }
            System.out.print("\n");
        }
        for (int i = 0; i < board.length; i++)
            System.out.print("__\t");
        System.out.print("\n");
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



