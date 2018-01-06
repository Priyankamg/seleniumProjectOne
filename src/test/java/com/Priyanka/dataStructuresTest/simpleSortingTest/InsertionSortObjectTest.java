package com.Priyanka.dataStructuresTest.simpleSortingTest;

import com.Priyanka.dataStructures.simpleSorting.InsertionSortObject;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by prinks on 1/5/18.
 */
public class InsertionSortObjectTest {
    InsertionSortObject insertionSortObject;

    @Before
    public void initialize() {
        insertionSortObject = new InsertionSortObject(10);
    }

    @Test
    public void testInsertionObject() {
        insertionSortObject.insert("Sanjana","Amar",1);
        insertionSortObject.insert("Sahil","Pushpak",20);
        insertionSortObject.insert("Meena","Aman",15);
        insertionSortObject.insert("Preeti","Shah",25);

        insertionSortObject.display();

        insertionSortObject.sortInsertionMethod();
        System.out.println("--");
        insertionSortObject.display();
    }
}
