
package task5;

public class CustomerGenerator {

    public void generateCustomers(int number, ServicePoint sp) {

        for (int i = 0; i < number; i++) {

            Customer5 c = new Customer5();

            sp.addToQueueue(c);

            System.out.println("Customer added: " + c.getId());
        }
    }
}
