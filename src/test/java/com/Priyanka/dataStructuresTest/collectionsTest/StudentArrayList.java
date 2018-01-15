package com.Priyanka.dataStructuresTest.collectionsTest;

import com.Priyanka.dataStructures.collections.Student;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by prinks on 1/15/18.
 */
public class StudentArrayList {
    public static void main(String[] args) {
        Student s1 = new Student(101,"Harry",26);
        Student s2 = new Student(102, "Ron", 21);
        Student s3 = new Student(103, "Hermoine", 22);

        ArrayList<Student> arrayList = new ArrayList<Student>();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);

        Iterator iterator = arrayList.iterator();

        while(iterator.hasNext()) {
            Student s = (Student) iterator.next();
            System.out.println(s.getRollNumber() + "," + s.getName() + "," + s.getAge());
        }

    }
}
