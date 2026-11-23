
package task2;

public class Event implements Comparable<Event> {

    private double eventTime;

    public Event(double eventTime) {
        this.eventTime = eventTime;
    }

    public double getEventTime() {
        return eventTime;
    }

    public int compareTo(Event other) {
        return Double.compare(this.eventTime, other.eventTime);
    }

    public String toString() {
        return "Event time: " + eventTime;
    }
}
