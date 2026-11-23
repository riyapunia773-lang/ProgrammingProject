
package task6;

import java.util.LinkedList;

public class ServicePoint {

    private LinkedList<Customer6> queue = new LinkedList<>();

    private long totalServiceTime = 0;
    private int customerCount = 0;

    public void addToQueueue(Customer6 c) {
        c.setStartTime(System.nanoTime());
        queue.addFirst(c);
    }

    public Customer6 removeFromQueueue() {
        return queue.removeLast();
    }

    public void serve() {

        while (!queue.isEmpty()) {

            Customer6 c = removeFromQueueue();

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

            long serviceTime = c.getEndTime() - serviceStart;

            totalServiceTime = totalServiceTime + serviceTime;
            customerCount++;

            double responseTime = c.getTimeSpent() / 1000000.0;
            double timeInService = serviceTime / 1000000.0;

            System.out.println("Customer ID: " + c.getId());
            System.out.println("Service time: " + timeInService + " ms");
            System.out.println("Response time: " + responseTime + " ms");
            System.out.println("--------------------");
        }
    }

    public double getAverageServiceTime() {

        if (customerCount == 0) {
            return 0;
        }

        return totalServiceTime / 1000000.0 / customerCount;
    }
}

