package Practice2;

import java.util.Scanner;

public class MovableDemo {

    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        Scanner m = new Scanner(System.in);
        String dir;
        int speed;
        String session;
        MovablePoint point = new MovablePoint();
        MovableRectangle rec = new MovableRectangle();

        System.out.println("Choose to move point (p) or rectangle (r). Enter p/r:");
        session = m.nextLine();
        switch (session) {
            case "p": {


                while (true) {
                    System.out.println("Enter direction u/d/r/l = ");
                    dir = n.nextLine();
                    System.out.println("Enter speed from 1 = ");
                    speed = m.nextInt();

                    switch (dir) {
                        case "u":
                            point.setySpeed(speed);
                            point.moveUp();
                            System.out.println(point.toString());
                            break;
                        case "d":
                            point.setySpeed(speed);
                            point.moveDown();
                            System.out.println(point.toString());
                            break;
                        case "r":
                            point.setxSpeed(speed);
                            point.moveRight();
                            System.out.println(point.toString());
                            break;
                        case "l":
                            point.setxSpeed(speed);
                            point.moveLeft();
                            System.out.println(point.toString());
                            break;
                        default:
                            System.out.println("No such direction. Enter u/d/r/l");

                    }
                }
            }

            case "r": {
                while (true) {
                    System.out.println("Enter direction u/d/r/l = ");
                    dir = n.nextLine();
                    switch (dir) {
                        case "u":
                            rec.moveUp();
                            System.out.println(rec.toString());
                            break;
                        case "d":

                            rec.moveDown();
                            System.out.println(rec.toString());
                            break;
                        case "r":

                            rec.moveRight();
                            System.out.println(rec.toString());
                            break;
                        case "l":

                            rec.moveLeft();
                            System.out.println(rec.toString());
                            break;
                        default:
                            System.out.println("No such direction. Enter u/d/r/l");

                    }
                }
            }
            default:
                System.out.println("No such module.");
        }

    }
}



