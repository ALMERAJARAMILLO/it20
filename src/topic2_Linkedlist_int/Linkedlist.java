package topic2_Linkedlist_int;

public class Linkedlist {

    private node head;

    //Method to add a new node
    public void add(int data) {
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
