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
}