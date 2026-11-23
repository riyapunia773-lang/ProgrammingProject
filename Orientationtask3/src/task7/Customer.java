
package task7;

public class Customer {

    private int id;
    private double arrivalTime;

    public Customer(int id, double arrivalTime) {
        this.id = id;
        this.arrivalTime = arrivalTime;
    }

    public void printTimeInSystem(double currentTime) {
        double timeInSystem = currentTime - arrivalTime;

        System.out.println("Customer " + id +
                " time in system: " + timeInSystem);
    }
}

