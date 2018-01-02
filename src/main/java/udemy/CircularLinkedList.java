package udemy;

/**
 * Created by prinks on 11/20/17.
 */
public class CircularLinkedList {
    private Node first;
    private Node last;

    public boolean isEmpty() {
        return first==null;
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        if(isEmpty()) {
            last = newNode;
        }
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }

    public void insertRear(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
    }

    public Node deleteFirst() {
        Node oldFirst = first;
        if(first.next==null) {
            first = null;
        } else {
            first = first.next;
        }
        return oldFirst;
    }

    public Node deleteLast() {
        Node oldLast = last;
        Node temp = first;
        if(first.next==null) {
            first = null;
        } else {
            while((temp.next).next!=null) {
                temp = temp.next;
            }
            last = temp;
            last.next = null;
        }
        return oldLast;
    }

    public void displayLinkedList() {
        System.out.println("First --> Last");
        Node temp = first;
        while(temp!=last) {
            System.out.println(temp + " " + temp.data + " " + temp.next);
            temp = temp.next;
        }
    }
}
