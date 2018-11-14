import java.util.Scanner;

public class ClockDemo {

    public static void main(String[] args) {

        System.out.println("Enter seconds after midnight:");
        Scanner sc = new Scanner(System.in);
        int sec = sc.nextInt();
        Clock firstClock = new Clock(sec);

        for (int i = 0; i < 10; i++) {
            firstClock.Tick();
            firstClock.Print();
        }


        System.out.println("Enter hours, minutes, seconds:");
        Scanner h = new Scanner(System.in);
        Scanner m = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        int hour = h.nextInt();
        int minutes = m.nextInt();
        int seconds = s.nextInt();

        Clock secondClock = new Clock(hour, minutes, seconds);
        for (int i = 0; i < 10; i++) {
            secondClock.Tick();
            secondClock.Print();
        }

        firstClock.addClock(secondClock);

        //Print both clock objects.
        System.out.print("First clock = ");
        firstClock.Print();
        System.out.print("Second clock = ");
        secondClock.Print();

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


    public Clock() {
        hours = 12;
        minutes = 0;
        seconds = 0;
        }


    public Clock(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }


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

    public void setClock(int seconds) {
        seconds = seconds % secDay;
        hours = seconds / secHour;
        minutes = (seconds % secHour) / secMin;
        this.seconds = seconds % secMin;
    }

    public int getClock() {
        return hours * secHour + minutes * secMin + seconds;
    }

    public void Tick() {
        setClock(getClock() + 1);

    }

    public void addClock(Clock clock) {
        setClock(getClock() + clock.getClock());
    }

    public void Print() {
        System.out.printf("(%02d:%02d:%02d)\n", hours, minutes, seconds);//("(" + hours + ":" + minutes + ":" + seconds + ")");
    }

    public void tickDown(Clock clock) {
        setClock(getClock() - 1);
    }

    public Clock subtractClock(Clock clock) {
        return new Clock(Math.abs(getClock() - clock.getClock()));

    }
}