package com.Priyanka.javaExercises;

import java.util.Scanner;

/**
 * Created by Priyanka on 7/27/2016.
 */
public class inheritance {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String firstName = s.next();
        String lastName = s.next();
        int idNumber = s.nextInt();
        int numberOfScores = s.nextInt();
        int[] scores = new int[numberOfScores];
        for (int i = 0; i < numberOfScores; i++) {
            scores[i] = s.nextInt();
        }

        student stu = new student(firstName,lastName,idNumber,scores);
        student stu2 = stu;
        if(stu2==stu) {
            System.out.println("student 2 obj equals stu obj");
        } else {
            System.out.println("student 2 obj does not equal stu obj");
        }
        stu.printPerson();
        System.out.println("Grade: " + stu.calculate());
    }

}
