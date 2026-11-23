
package task3;

public class Event implements Comparable<Event> {

    private double eventTime;
    private EventType eventType;

    public Event(double eventTime, EventType eventType) {
        this.eventTime = eventTime;
        this.eventType = eventType;
    }

    public double getEventTime() {
        return eventTime;
    }

    public EventType getEventType() {
        return eventType;
    }

    public int compareTo(Event other) {
        return Double.compare(this.eventTime, other.eventTime);
    }

    public String toString() {
        return "Time: " + eventTime + ", Type: " + eventType;
    }
}

