
package task2;

public class OrientationTask2_2 {

    public static void main(String[] args) {

        EventList list = new EventList();

        list.addEvent(new Event(15));
        list.addEvent(new Event(5));
        list.addEvent(new Event(10));
        list.addEvent(new Event(20));

        System.out.println("Events in time order:");
        list.printEvents();

        System.out.println("Next event:");
        System.out.println(list.getNextEvent());

        System.out.println("Remaining events:");
        list.printEvents();
    }
}

