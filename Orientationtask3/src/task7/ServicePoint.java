
package task7;

import java.util.LinkedList;
import java.util.Queue;

public class ServicePoint {

    private Queue<Customer> queue = new LinkedList<>();

    public void addCustomer(Customer customer) {
        queue.add(customer);
    }

    public void serveCustomers(double currentTime) {

        while (!queue.isEmpty()) {
            Customer customer = queue.poll();
            customer.printTimeInSystem(currentTime);
        }
    }
}
