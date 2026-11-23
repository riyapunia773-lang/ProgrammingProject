
package task6;

public class CustomerGenerator {

    public void generateCustomers(int number, ServicePoint sp) {

        for (int i = 0; i < number; i++) {

            Customer6 c = new Customer6();

            sp.addToQueueue(c);

            System.out.println("Customer added: " + c.getId());
        }
    }
}

