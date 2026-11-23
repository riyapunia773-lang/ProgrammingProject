
package task3;

public class OrientationTask2_3 {

    public static void main(String[] args) {

        EventList list = new EventList();

        list.addEvent(new Event(10, EventType.ARRIVAL));
        list.addEvent(new Event(5, EventType.EXIT));
        list.addEvent(new Event(20, EventType.ARRIVAL));
        list.addEvent(new Event(15, EventType.EXIT));

        System.out.println("Events in chronological order:");
        list.printEvents();

        System.out.println("Next event:");
        System.out.println(list.getNextEvent());
    }
}
