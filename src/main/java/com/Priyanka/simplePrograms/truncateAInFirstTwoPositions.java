package com.Priyanka.simplePrograms;

/**
 * Created by Priyanka on 6/17/2016.
 */
public class truncateAInFirstTwoPositions {

    public String truncateAFirst2Positions(String given) {
        String truncated = given.substring(0,2); // This method gives a substring
                                                 // .substring(initialPosition, finalPosition)
                                                 // gives a substring from initial position to (finalPosition - 1)

        String op = "";

        String aInFirstPos = given.substring(0,1);
        String aInSecondPos = given.substring(1,2);


        if(truncated.equalsIgnoreCase("AA")) {
            op = given.substring(2); // This method gives a substring
                                     // starting from Position 2 to the end of String
                                     // If no finalPosition is given, the finalPostion = lengthOfString
                                     // Therefore, substring is from initialPosition to (lengthOfString - 1)
        } else if(aInFirstPos.equalsIgnoreCase("A")) {
            op = given.substring(1);
        } else if(aInSecondPos.equalsIgnoreCase("A")) {
            String firstLetter = given.substring(0,1);
            String restOfTheString = given.substring(2);
            op = firstLetter.concat(restOfTheString);
        } else{
            op = given;
            System.out.println("String was not truncated. Value of String: " + op);
        }
        return op;
    }
}
