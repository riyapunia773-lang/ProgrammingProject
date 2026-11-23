
package task6;

public class Customer {

    private int id;
    private double arrivalTime;

    public Customer(int id, double arrivalTime) {
        this.id = id;
        this.arrivalTime = arrivalTime;
    }

    public void printTimeInSystem(double currentTime) {
        System.out.println("Customer " + id +
                " time in system: " + (currentTime - arrivalTime));
    }
}
