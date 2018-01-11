package com.Priyanka.dataStructuresTest.simpleSortingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by prinks on 1/11/18.
 */
public class ReadFromInput {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter name: ");
        String name = br.readLine();

        System.out.println("Enter number");
        int number = Integer.parseInt(br.readLine());

        System.out.println("name: " + name);
        System.out.println("number: " + number);
    }
}
