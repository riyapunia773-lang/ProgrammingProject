
package task6;

import eduni.distributions.ContinuousGenerator;
import task5.Clock;

public class ArrivalProcess {

    private ContinuousGenerator generator;
    private EventType eventType;

    public ArrivalProcess(ContinuousGenerator generator, EventType eventType) {
        this.generator = generator;
        this.eventType = eventType;
    }

    public void createArrival(EventList eventList) {

        Clock clock = Clock.getInstance();

        double interval = generator.sample();
        double arrivalTime = clock.getTime() + interval;

        Event event = new Event(arrivalTime, eventType);
        eventList.addEvent(event);

        clock.setTime(arrivalTime);
    }
}
