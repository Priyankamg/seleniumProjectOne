package com.Priyanka.headFirstJava.Chapter8;

/**
 * Created by Priyanka on 7/9/2016.
 */
public interface breed {

    void whichBreed();

    void countryOfOrigin();

    /*
    Even though the method is defined in Pet interface too,
    there is no ambiguity as to which beFriendly needs to be used
    because the implementation of this method is in the class that
    implements this interface. Since the method definition is in the
    class that implements it, this will not cause deadly diamond of death
     */
    void beFriendly();
}
