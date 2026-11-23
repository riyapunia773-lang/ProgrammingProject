
package task6;

import eduni.distributions.Negexp;
import task5.Clock;

public class OrientationTask3_6 {

    public static void main(String[] args) {

        Clock clock = Clock.getInstance();
        clock.setTime(0);

        EventList eventList = new EventList();

        Negexp generator = new Negexp(5.0);

        ArrivalProcess arrivalProcess =
                new ArrivalProcess(generator, EventType.ARRIVAL);

        for (int i = 0; i < 10; i++) {
            arrivalProcess.createArrival(eventList);
        }

        System.out.println("10 arrival events:");
        eventList.printEvents();

        System.out.println("Clock time: " + clock.getTime());
    }
}

