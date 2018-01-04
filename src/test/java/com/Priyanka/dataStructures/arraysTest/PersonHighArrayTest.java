package com.Priyanka.dataStructures.arraysTest;

import com.Priyanka.dataStructures.arrays.Person;
import com.Priyanka.dataStructures.arrays.PersonHighArray;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by prinks on 1/3/18.
 */
public class PersonHighArrayTest {

    PersonHighArray personHighArray;

    @Before
    public void initialize() {
        personHighArray = new PersonHighArray(10);

        personHighArray.insert("Sanjana","Sharma",1);
        personHighArray.insert("John","Doe",20);
        personHighArray.insert("Mickey","Mouse",35);
        personHighArray.insert("Peter","Pan",39);

        personHighArray.display();

        System.out.println("---");
    }

    @Test
    public void findDoe() {
        Person p = personHighArray.find("Doe");
        p.display();
    }

    @Test
    public void findSharma() {
        Person p = personHighArray.find("Sharma");
        p.display();
    }

    @Test
    public void deletePeterPan() {
        personHighArray.delete("Pan");
        personHighArray.display();
    }

    @Test
    public void findChipDale() {
        Person p = personHighArray.find("Dale");
        if(p!=null)
            p.display();
    }

    @Test
    public void deleteTimmy() {
        personHighArray.delete("Timmy");
        personHighArray.display();
    }
}
