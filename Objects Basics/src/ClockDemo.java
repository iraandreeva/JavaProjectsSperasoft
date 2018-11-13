import java.util.Scanner;

public class ClockDemo {

    public static void main(String[] args) {

        //Instantiate a Clock object firstClock using one integer seconds since midnight obtained from the user input;
        System.out.println("Enter seconds after midnight:");
        Scanner sc = new Scanner(System.in);
        int sec = sc.nextInt();
        Clock firstClock = new Clock(sec);

        //Tick the clock ten times by applying its tick() method and print out the time after each tick.
        for (int i = 0; i < 10; i++) {
            firstClock.Tick();
            firstClock.Print();
        }


        //Instantiate a Clock object secondClock by using three integers (hours, minutes, seconds) read from the console.

        System.out.println("Enter hours, minutes, seconds:");
        Scanner h = new Scanner(System.in);
        Scanner m = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        int hour = h.nextInt();
        int minutes = m.nextInt();
        int seconds = s.nextInt();

        //Then tick the clock ten times, printing the time after each tick.
        Clock secondClock = new Clock(hour, minutes, seconds);
        for (int i = 0; i < 10; i++) {
            secondClock.Tick();
            secondClock.Print();
        }

        //Add the secondClock time in firstClock by calling method addClock.
        firstClock.addClock(secondClock);

        //Print both clock objects.
        System.out.print("First clock = ");
        firstClock.Print();
        System.out.print("Second clock = ");
        secondClock.Print();

        //Get the difference of firstClock and secondClock by calling the method subtractClock() and print it to the console.
        System.out.print("Difference between 1st and 2nd clocks = ");
        firstClock.subtractClock(secondClock).Print();






    }
}


class Clock {

    private int hours;
    private int minutes;
    private int seconds;
    private static final int secMin = 60;
    private static final int secHour = 3600;
    private static final int secDay = 3600*24;

    //default (with no parameters passed; it should initialize the represented time to 12:0:0)
    public Clock() {
        hours = 12;
        minutes = 0;
        seconds = 0;
        }

    //a constructor with three parameters: hours, minutes, and seconds
    public Clock(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    //a constructor with one parameter: the value of time in seconds since midnight (it should be converted into the time value in hours, minutes, and seconds)
    public Clock(int seconds) {
        setClock(seconds);
    }

    public int getHours() {

        return hours;
    }

    public int getMinutes() {

        return minutes;
    }

    public int getSeconds() {

        return seconds;
    }

    public void setHours(int hours) {

        this.hours = hours;
    }

    public void setMinutes(int minutes) {

        this.minutes = minutes;
    }


    public void setSeconds(int seconds) {

        this.seconds = seconds;
    }
    //a set-method method setClock() with one parameter seconds since midnight (to be converted into the time value in hours, minutes, and seconds as above)
    public void setClock(int seconds) {
        seconds = seconds % secDay;
        hours = seconds / secHour;
        minutes = (seconds % secHour) / secMin;
        this.seconds = seconds % secMin;
    }

    public int getClock() {
        return hours * secHour + minutes * secMin + seconds;
    }


    //method tick() with no parameters that increments the time stored in a Clock object by one second;
    public void Tick() {
        setClock(getClock() + 1);

    }

    //method addClock() accepting an object of type Clock as a parameter. The method should add the time represented by the parameter class to the time represented in the current class;
    public void addClock(Clock clock) {
        setClock(getClock() + clock.getClock());
    }

    //method to return a String representation of the Clock object in the form "(hh:mm:ss)", for example "(03:02:34)"
    public void Print() {
        System.out.printf("(%02d:%02d:%02d)\n", hours, minutes, seconds);//("(" + hours + ":" + minutes + ":" + seconds + ")");
    }

    //Add an instance method tickDown() which decrements the time stored in a Clock object by one second;
    public void tickDown(Clock clock) {
        setClock(getClock() - 1);
    }

    //Add an instance method subtractClock() that takes one Clock parameter and returns the difference between the time represented in the current Clock object and the one represented
    //by the Clock parameter. The difference of time should be returned as a Clock object.
    public Clock subtractClock(Clock clock) {
        return new Clock(Math.abs(getClock() - clock.getClock()));

    }
}