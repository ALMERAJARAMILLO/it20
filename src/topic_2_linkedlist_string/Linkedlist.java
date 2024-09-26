package topic_2_linkedlist_string;

public class Linkedlist {

    private node head;

    // Method to add a new node at the end of the list
    public void add(String data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
     //Method to print the linked list
    public void printlist() {
        node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    // Method to delete a node by value
    public void deleteByValue(String value) {
        if (head == null) {
            return;
        }

        // If the head needs to be removed
        if (head.data == value) {
            head = head.next;
            return;
        }

        node current = head;
        while (current.next != null) {
            if (current.next.data == value) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

}