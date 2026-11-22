
package task5;

import java.util.LinkedList;

public class ServicePoint {

    private LinkedList<Customer5> queue = new LinkedList<>();

    public void addToQueueue(Customer5 c) {
        c.setStartTime(System.nanoTime());
        queue.addFirst(c);
    }

    public Customer5 removeFromQueueue() {
        return queue.removeLast();
    }

    public void serve() {

        while (!queue.isEmpty()) {

            Customer5 c = removeFromQueueue();

            long serviceStart = System.nanoTime();

            int sleepTime = 500 + (int)(Math.random() * 1500);

            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
                return;
            }

            c.setEndTime(System.nanoTime());

            double serviceTime =
                    (c.getEndTime() - serviceStart) / 1000000.0;

            double responseTime =
                    c.getTimeSpent() / 1000000.0;

            System.out.println("Customer ID: " + c.getId());
            System.out.println("Service time: " + serviceTime + " ms");
            System.out.println("Response time: " + responseTime + " ms");
            System.out.println("--------------------");
        }
    }
}
