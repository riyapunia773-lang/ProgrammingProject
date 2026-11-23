
package task6;

public class OrientationTask1_6 {

    public static void main(String[] args) {

        CustomerGenerator generator = new CustomerGenerator();

        for (int i = 1; i <= 3; i++) {

            System.out.println("Simulation run: " + i);

            ServicePoint sp = new ServicePoint();

            generator.generateCustomers(5, sp);

            sp.serve();

            System.out.println("Average service time: "
                    + sp.getAverageServiceTime() + " ms");

            System.out.println("--------------------");
        }
    }
}
