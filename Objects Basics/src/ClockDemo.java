import java.util.Scanner;

public class ClockDemo {

    public static void main(String[] args) {

        //Instantiate a Clock object firstClock using one integer seconds since midnight obtained from the user input;
        System.out.println("Enter seconds after midnight:");
        Scanner sc = new Scanner(System.in);
        int sec = sc.nextInt();
        Clock demo = new Clock(sec);

        //Tick the clock ten times by applying its tick() method and print out the time after each tick.
        demo.Tick();
        System.out.println(demo.getHours() + ":" + demo.getMinutes() + ":" + demo.getSeconds());

        //Instantiate a Clock object secondClock by using three integers (hours, minutes, seconds) read from the console.
        Clock secondClock = new Clock();
        System.out.println("Enter hours, minutes, seconds:");
        Scanner h = new Scanner(System.in);
        Scanner m = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        int hour = h.nextInt();
        int minutes = m.nextInt();
        int seconds = s.nextInt();

        //Then tick the clock ten times, printing the time after each tick.
        secondClock.Tick();

        //Add the secondClock time in firstClock by calling method addClock.
        //secondClock.addClock();

        //Print both clock objects.
        secondClock.Print();

        //Get the difference of firstClock and secondClock by calling the method subtractClock() and print it to the console.






    }
}


class Clock {

    int hours;
    int minutes;
    int seconds;
    Clock clock;

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

    public Clock(int seconds) {
        if (seconds > 3600) {
            hours = seconds / 3600;
            minutes = seconds % 3600;
            if (minutes > 60) {
                minutes = minutes / 60;
                seconds = minutes % 60;
            }
        }
        else if (seconds < 3600 && seconds > 60) {
            minutes = seconds / 60;
            seconds = seconds % 60;
        }
        else if (seconds < 60)
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
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

    //a set-method method setClock() with one parameter seconds since midnight (to be converted into the time value in hours, minutes, and seconds as above)
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    //a constructor with one parameter: the value of time in seconds since midnight (it should be converted into the time value in hours, minutes, and seconds)
    public void setClock(int seconds) {
        hours = seconds / 3600;
        minutes = seconds / 60;
        this.seconds = seconds;
    }


    //method tick() with no parameters that increments the time stored in a Clock object by one second;
    public void Tick() {

        if (seconds > 60) {
            int sec = seconds / 60;
            minutes = minutes + sec;
            seconds = seconds % 60;
        }

        if (seconds == 60) {
            minutes++;
            seconds = 0;
        }
        if (minutes == 60) {
            hours++;
            minutes = 0;
        }

        if (hours == 23) {
            hours = 0;
        }
        seconds++;
    }

    //method addClock() accepting an object of type Clock as a parameter. The method should add the time represented by the parameter class to the time represented in the current class;
    public void addClock(Clock clock) {
        this.clock = clock;
    }

    //method to return a String representation of the Clock object in the form "(hh:mm:ss)", for example "(03:02:34)"
    public void Print() {
        System.out.println("(" + hours + ":" + minutes + ":" + seconds);
    }

    //Add an instance method tickDown() which decrements the time stored in a Clock object by one second;
    /*public void tickDown(Clock clock) {
        clock--;
    }*/

    //Add an instance method subtractClock() that takes one Clock parameter and returns the difference between the time represented in the current Clock object and the one represented
    //by the Clock parameter. The difference of time should be returned as a Clock object.
    /*public void subtractClock(Clock clock) {
        clock = clock - addClock.clock;

    }*/
}