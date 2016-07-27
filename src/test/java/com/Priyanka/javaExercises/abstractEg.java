package com.Priyanka.javaExercises;

import java.util.Scanner;

/**
 * Created by Priyanka on 7/27/2016.
 */
public class abstractEg {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String title = s.nextLine();
        String author = s.nextLine();
        int price = s.nextInt();
        myBook mb = new myBook(title,author,price);
        mb.display();
    }
}
