package com.Priyanka.dataStructures.linkedList;

/**
 * Created by prinks on 1/20/18.
 */
public class insertDeleteFirst {

    private Link first;

    public insertDeleteFirst() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }


    public void insertFirst(int iData, double dData) {
        if(isEmpty()) {
            Link l = new Link(iData, dData);
            first = l;
        } else {
            Link l = new Link(iData, dData);
            l.setNext(first);
            first = l;
        }
    }

    public Link removeFirst() throws Exception {
        if(!isEmpty()) {
            Link temp = first;
            first = first.getNext();
            return temp;
        }
        throw new Exception("Linked List is empty");
    }

    public Link find(int key) throws Exception {
        Link temp = first;
        while(temp!=null) {
            if(temp.getiData()==key)
                return temp;
            temp = temp.getNext();
        }
        throw new Exception(key + " is not found in the LinkedList");
    }

    public void display() {
        Link temp = first;
        while(temp != null) {
            System.out.println(temp);
            temp.display();
            temp = temp.getNext();
        }
    }
}
