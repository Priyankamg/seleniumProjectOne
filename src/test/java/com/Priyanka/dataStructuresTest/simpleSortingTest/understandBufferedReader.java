package com.Priyanka.dataStructuresTest.simpleSortingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by prinks on 1/7/18.
 */
public class understandBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number: ");
        int number = Integer.parseInt(br.readLine());
//        br.readLine();
        System.out.println("Enter name: ");
        String name = br.readLine();
        System.out.println("Name: " + name + " Number: " + number);
    }
}
