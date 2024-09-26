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
    //Method to print linked list
    public void printList() {
        node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
     //Method to delete a node by value
    public void deleteByValue(int value) {
        if (head == null) {
            return;
        }

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

    //Method to move a node to a new position/swap nodes
    public void moveNodePointer(int currentIndex, int newIndex) {
        if (head == null || currentIndex == newIndex) {
            return;
        }

        node current = head;
        node prev = null;
        node movingNode = null;
        node movingPrev = null;

        for (int i = 0; current != null && i < currentIndex; i++) {
            movingPrev = prev;
            prev = current;
            current = current.next;
        }
        movingNode = current;

        if (movingNode == null) {
            return;
        }

        if (movingPrev != null) {
            movingPrev.next = movingNode.next;
        } else {
            head = movingNode.next;
        }

        current = head;
        prev = null;
        for (int i = 0; current != null && i < newIndex; i++) {
            prev = current;
            current = current.next;
        }

        if (prev != null) {
            movingNode.next = current;
            prev.next = movingNode;
        } else {
            movingNode.next = head;
            head = movingNode;
        }
    }
}
