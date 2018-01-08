package com.Priyanka.dataStructuresTest.simpleSortingTest;

import java.util.Scanner;

/**
 * Created by prinks on 1/7/18.
 */
public class understandScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = Integer.parseInt(scanner.nextLine());

       // scanner.nextLine(); // This line is required when using Scanner. It doesn't ignore new line.

        System.out.println("Enter name: ");
        String name = scanner.nextLine();


        System.out.println("Name: " + name + " Number: " + number);

    }
}
