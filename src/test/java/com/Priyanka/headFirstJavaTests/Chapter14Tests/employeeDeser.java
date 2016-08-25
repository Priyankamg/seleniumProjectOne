package com.Priyanka.headFirstJavaTests.Chapter14Tests;

import com.Priyanka.headFirstJava.Chapter14.employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by Priyanka on 8/25/2016.
 */
public class employeeDeser {
    public static void main(String[] args) {
        Object one = null;
        try {
            FileInputStream fis = new FileInputStream("src/test/java/com/Priyanka/headFirstJavaTests/Chapter14Tests/employee.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            one = ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        employee emp = (employee) one;
        System.out.println("Employee's class: " + emp.getClass());
        System.out.println("Employee's id: " + emp.getId());
        System.out.println("Employee's name: " + emp.getName());
    }
}
