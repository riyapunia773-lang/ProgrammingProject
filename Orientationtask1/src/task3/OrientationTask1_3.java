package task3;

public class OrientationTask1_3 {

    public static void main(String[] args) {

        Customer3 c1 = new Customer3();
        Customer3 c2 = new Customer3();

        c1.setStartTime(1000);
        c1.setEndTime(3000);

        c2.setStartTime(2000);
        c2.setEndTime(5000);

        System.out.println("Customer ID: " + c1.getId());
        System.out.println("Time spent: " + c1.getTimeSpent());

        System.out.println("Customer ID: " + c2.getId());
        System.out.println("Time spent: " + c2.getTimeSpent());
    }
}

