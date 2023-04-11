public class SinglyLinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // Setting current new node address pointer next to previous head
        head = newNode; // Assigning current new node as the head
    }

    public void display() {
        Node node = head;
        if (node == null) {
            System.out.println("No values present in the linked list");
        }

        while(node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();
        ll.insertFirst(1);
        ll.insertFirst(2);
        ll.insertFirst(3);
        ll.insertFirst(4);

        ll.display();
    }

}
