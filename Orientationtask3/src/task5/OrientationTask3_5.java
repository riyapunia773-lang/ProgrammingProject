
package task5;

public class OrientationTask3_5 {

    public static void main(String[] args) {

        Clock clock = Clock.getInstance();

        System.out.println("Starting time: " + clock.getTime());

        clock.setTime(5);
        System.out.println("Time after change: " + clock.getTime());

        clock.setTime(12);
        System.out.println("New time: " + clock.getTime());

        Clock anotherClock = Clock.getInstance();

        System.out.println("Same clock object: " + (clock == anotherClock));
    }
}

