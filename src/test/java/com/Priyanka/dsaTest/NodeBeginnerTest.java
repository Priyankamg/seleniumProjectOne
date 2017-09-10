package com.Priyanka.dsaTest;

import com.Priyanka.dsa.NodeBeginner;

/**
 * Created by prinks on 9/9/17.
 */
public class NodeBeginnerTest {
    public static void main(String[] args) {
        NodeBeginner nodeA = new NodeBeginner();
        NodeBeginner nodeB = new NodeBeginner();
        NodeBeginner nodeC = new NodeBeginner();
        NodeBeginner nodeD = new NodeBeginner();

        nodeA.setData(2);

        nodeB.setData(4);

        nodeC.setData(6);

        nodeD.setData(8);

        nodeA.setNext(nodeB);
        nodeB.setNext(nodeC);
        nodeC.setNext(nodeD);

        System.out.println("Length of linked list from node A: " + listLength(nodeA));
        System.out.println("Length of linked list from node B: " + listLength(nodeB));
        System.out.println("Length of linked list from node C: " + listLength(nodeC));
        System.out.println("Length of linked list from node D: " + listLength(nodeD));
    }

    public static int listLength(NodeBeginner node) {
        int count=0;
        while(node!=null) {
            count++;
            node = node.getNext();
        }
        return count;
    }
}
