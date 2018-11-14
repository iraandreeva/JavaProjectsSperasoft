/*Java Fundamentals Practice #5: Turtle graphics
Let's implement a simple Turtle graphics program which would draw a two-dimensional board of chars in the console and allow us to draw on it by providing input in the format "direction distance", By drawing we mean changing visited cells chars on the board.

Create a TurtleGraphics class implementing simple turtle graphics logic.

Fields:

board - a two-dimensional array of chars representing the drawing board
penPosition - a Position class field for storing current pen position (default position is 0,0)
cellChar - character representing the clear board cell (by default use dot char)
coloredCellChar - character representing the coloured board cell (by default use 'o' char)
penChar - character representing the current position of the pen on the board (by default use 'x' char)
Implement necessary methods/constructors to initialize the board according to the user input.  Also, implement the following methods:

movePen( Direction dir, int length )  - should move the pen on the board in a specified direction changing all visited 'cell' chars to a 'coloredCell' chars;
movePenUp( int length )
movePenDown( int length )
movePenLeft( int length )
movePenRight( int length )
clearBoard() - should return the board to its initial state
Position is a simple class containing x and y position of the pen in the field.

Direction should be an enum representing 4 directions: up, down, right, left

Drawing methods should correctly handle the attempts to cross the board borders while drawing.

Fill free to add any other methods that you think may be required.



Implement TurtleGraphicsDemo class with a main() method which should do the following:

ask the user to provide the desired board width/height and initial pen position and print the result board;
wait for user input in the format "u 2" meaning that pen should be moved 2 positions up (or for example "r 3", "l 4", "d 1", etc.) Redraw the board after each input.
'c' char in user put should clear the board.
Example of the board:

. . . x . . .

. . . o.. . .

. . . o . . .

. . . . . . .
*/


import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class TurtleGraphicsDemo {


    public static void main (String[] args) {
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
        while (x > width)
        {
            System.out.println("ERROR. Enter start position x < " + width);
            x = n.nextInt();
        }
        System.out.println("Enter start position y < " + height);
        y = n.nextInt();
        while (y > height)
        {
            System.out.println("ERROR. Enter start position y < " + height);
            y = n.nextInt();
        }

        Position pos = new Position();
        pos.penPos(x, y);

        System.out.println("Let's beggin. What do you want to do? \n" +
                "1) Go up. Enter 'u' and number of cells\n " +
                "2) Go down. Enter 'd' and number of cells\n" +
                "3) Go right. Enter 'r' and number of cells\n" +
                "4) Go left. Enter 'l' and number of cells\n" +
                "5) Clear the board. Enter 'c'");

        String move = n.nextLine();
        String direction = move.substring(0 , 1);
        String number = move.substring(1, 2);
        int length = Integer.parseInt(number);
        TurtleGraphics position = new TurtleGraphics();

        switch (direction) {
            case "u": position.movePenUp(length); break;
            case "d": position.movePenDown(length); break;
            case "r": position.movePenRight(length); break;
            case "l": position.movePenLeft(length); break;
            case "c": position.clearBoard(); break;
            default: System.out.println("No such symbol. Try again."); break;
        }
    }
}

class TurtleGraphics {

    private char[][] board;
    private Position penPosition;
    private char cellChar = '.';
    private char coloredCellChar = 'o';
    private char penChar = 'x';

    public void movePen(Direction dir, int length) {


    }

    public void movePenUp(int length) {
    
    }

    public void movePenDown(int length) {

    }

    public void movePenLeft(int length) {

    }

    public void movePenRight(int length) {

    }

    public void clearBoard() {

    }




}

class Position {
    int x;
    int y;

    public Position() {
        x = 0;
        y = 0;
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

    public void penPos(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

enum Direction {
    up,
    down,
    right,
    left
}
