
package task7;

import eduni.distributions.Negexp;

public class OrientationTask3_7 {

    public static void main(String[] args) {

        Clock clock = Clock.getInstance();
        clock.setTime(0);

        EventList eventList = new EventList();
        ServicePoint servicePoint = new ServicePoint();

        Negexp generator = new Negexp(5.0);

        ArrivalProcess arrivalProcess =
                new ArrivalProcess(generator, EventType.ARRIVAL);

        // Create 10 arrival events
        for (int i = 0; i < 10; i++) {
            arrivalProcess.createArrival(eventList);
        }

        System.out.println("Clock after arrivals: "
                + clock.getTime());

        // Create customers from arrival events
        // Clock does not change here
        for (int i = 1; i <= 10; i++) {
            Event event = eventList.getNextEvent();

            Customer customer =
                    new Customer(i, event.getTime());

            servicePoint.addCustomer(customer);
        }

        System.out.println("Clock after processing events: "
                + clock.getTime());

        // Move clock forward by 5
        clock.setTime(clock.getTime() + 5);

        System.out.println("Final clock time: "
                + clock.getTime());

        // Remove customers and print their time in system
        servicePoint.serveCustomers(clock.getTime());
    }
}
