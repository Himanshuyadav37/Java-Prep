public class LinkedList {

    // Node class
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;


    public void addFirst(int data) {
        // step 1: create new node
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode; // first node in list
            return;
        }

        // step 2: newNode.next = head
        newNode.next = head;

        // step 3: head = newNode
        head = newNode;
    }

    public void addLast(int data){
        // step 1 -> create new node
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode; // first node in list
            return;
        }

        // step 2 ->  point the new node of tail to next
        tail.next = newNode;

        // step 3 ->
        tail = newNode;

    }

    // helper function to print list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(0);

        ll.addLast(3);
        ll.addLast(4);

        ll.printList(); // Output: 0 -> 1 -> 2 -> null
    }
}
