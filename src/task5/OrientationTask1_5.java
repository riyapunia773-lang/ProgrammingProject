
package task5;

public class OrientationTask1_5 {

    public static void main(String[] args) {

        ServicePoint sp = new ServicePoint();

        CustomerGenerator generator = new CustomerGenerator();

        generator.generateCustomers(5, sp);

        System.out.println("Starting service...");

        sp.serve();

        System.out.println("All customers served.");
    }
}
