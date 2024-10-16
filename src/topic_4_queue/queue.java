package topic_4_queue;

import java.util.LinkedList;

public class queue {

    private LinkedList<customer> customers;

    public queue() {
        customers = new LinkedList<>();
    }

    public boolean isEmpty() {
        return customers.isEmpty();
    }

    public int size() {
        return customers.size();
    }

    public void enqueue(customer customer) {
        customers.addLast(customer);
        System.out.println(customer.getName() + " has been added to the queue.");
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("The queue is currently empty.");
        } else {
            System.out.print("Current queue: ");
            for (customer customer : customers) {
                System.out.print(customer.getName() + " | ");
            }
            System.out.println();
        }
    }
      public customer deQueue() {
        if (!isEmpty()) {
            customer customer = customers.removeFirst();
            System.out.println(customer.getName() + " has been served.");
            return customer;
        } else {
            System.out.println("The queue is empty.");
            return null;
        }
    }

}
