package udemy;

/**
 * Created by prinks on 11/20/17.
 */
public class SinglyLinkedList {
    private Node head;
    private Node tail;

    public boolean isEmpty() {
        return head==null;
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        Node temp = head;
        while(temp.next!=null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public Node delete() {
        Node oldhead = head;
        head = head.next;
        return oldhead;
    }

    public void displayLinkedList() {
        System.out.println("(First --> Last): ");
        Node temp = head;
        while(temp!=null) {
            System.out.println(temp + " " + temp.data + " " + temp.next);
            temp = temp.next;
        }
    }

}
