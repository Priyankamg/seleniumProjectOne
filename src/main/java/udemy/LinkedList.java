package udemy;

/**
 * Created by prinks on 11/19/17.
 */
public class LinkedList {
    Node head = null;


    public boolean isEmpty() {
        return head==null;
    }

    public void insertFirst(int data) {
        Node n = new Node();
        n.data = data;
        n.next = head;
        head = n;
    }

    public void insert(int data) {
        Node n = new Node();
        n.data = data;
        n.next = null;

        if(head==null) {
            head = n;
        } else {
            Node temp = head;
            while(temp.next!=null) {
                temp = temp.next;
            }
            temp.next = n;
        }
    }

    public void delete() {
        Node temp = head;
        if(temp!=null) {
            if(temp.next!=null) {
                while((temp.next).next!=null) {
                    temp = temp.next;
                }
                temp.next = null;
            } else {
                head = null;
            }
        }
    }

    public void printLinkedList() {
        Node temp = head;
        while(temp!=null) {
            System.out.println(temp + " " + temp.data + " " + temp.next);
            temp = temp.next;
        }
    }

    public int lengthLinkedList() {
        Node temp = head;
        int count = 0;
        while(temp!=null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
