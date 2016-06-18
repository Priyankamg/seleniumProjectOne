package com.Priyanka.simplePrograms;

/**
 * Created by Priyanka on 6/17/2016.
 */
public class areFirstAndLastTwoCharactersTheSame {

    public boolean areFirstLast2CharsSame(String given) {
        if (given.length() <=2) {
            return true;
        } else {
            String first2Chars = given.substring(0, 2);
            String last2Chars = given.substring(given.length() - 2);
            if (first2Chars.equalsIgnoreCase(last2Chars))
                return true;
            else
                return false;
        }
    }
}
