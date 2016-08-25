package com.Priyanka.headFirstJavaTests.Chapter14Tests;

import com.Priyanka.headFirstJava.Chapter14.employee;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by Priyanka on 8/25/2016.
 */
public class employeeTest {
    public static void main(String[] args) {
        employee e = new employee();
        e.setId(45);
        e.setName("John");

        try {
            FileOutputStream fis = new FileOutputStream("src/test/java/com/Priyanka/headFirstJavaTests/Chapter14Tests/employee.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fis);
            oos.writeObject(e);
        } catch (FileNotFoundException fe) {
            fe.printStackTrace();
        } catch (IOException fe) {
            fe.printStackTrace();
        }
    }
}
