package com.Priyanka.javaExercises;

/**
 * Created by Priyanka on 7/27/2016.
 */
public class student extends person {
    private int[] testScores;


    public student(String firstName, String lastName, int idNumber, int[] testScores) {
        super(firstName,lastName,idNumber);
        this.testScores = testScores;
    }

    char calculate() {
        int sum=0;
        int average=0;
        for(int i=0; i<testScores.length;i++) {
            sum += testScores[i];
        }
        average = sum/testScores.length;
        if(average>=90 && average<=100) {
            return'O';
        } else if(average>=80 && average<90) {
            return 'E';
        } else if(average>=70 && average<80) {
            return 'A';
        } else if(average>=55 && average<70) {
            return 'P';
        } else if(average>=40 && average<55) {
            return 'D';
        } else if(average<40) {
            return 'T';
        }
        return 'T';
    }


}
