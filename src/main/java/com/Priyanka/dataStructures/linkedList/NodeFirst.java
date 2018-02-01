package com.Priyanka.dataStructures.linkedList;

/**
 * Created by prinks on 1/31/18.
 */
public class NodeFirst {
    private Node first;

    public NodeFirst() {
        first = null;
    }

    public boolean isEmpty() {
        return (first==null);
    }

    public void insertFirst(int iData, double dData) {
        Node newNode = new Node(iData, dData);
        if(isEmpty()) {
            first = newNode;
        } else {
            newNode.setNext(first);
            first = newNode;
        }
    }

    public Node deleteFirst() throws Exception {
        if(!isEmpty()) {
            Node temp = first;
            first = first.getNext();
            return temp;
        } else {
            throw new Exception("Linked List is Empty");
        }
    }

    public void display() {
        Node temp = first;
        while(temp != null) {
            System.out.println(temp);
            temp.display();
            temp = temp.getNext();
        }
    }

    public Node find(int key) throws Exception {
        if(!isEmpty()) {
            Node temp = first;
            while(temp != null) {
                if(temp.getiData()==key)
                    return temp;
                else
                    temp = temp.getNext();
            }
            throw new Exception(key + " is not found in the Linked List");
        }
        throw new Exception("Linked List is empty");
    }

    public Node deleteAfterFind(int key) throws Exception {
        if(!isEmpty()) {
            Node current = first;
            Node previous = first;

            while(current.getiData() != key) {
                if(current.getNext()==null)
                    return null;
                else {
                    previous = current;
                    current = current.getNext();
                }
            }
            if(current==first) {
                first = first.getNext();
            } else {
                previous.setNext(current.getNext());
            }
            return current;
        }
        throw new Exception("Linked List is empty");
    }

}
