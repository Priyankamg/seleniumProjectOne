package com.Priyanka.headFirstJava.Chapter8;

/**
 * Created by Priyanka on 7/9/2016.
 */
public interface breed {
    public float c = 23.33f;
    public char d = '1';
    
    void whichBreed();

    void countryOfOrigin();

    /*
    Even though the method is defined in Pet interface too,
    there is no ambiguity as to which beFriendly needs to be used
    because the implementation of this method is in the class that
    implements this interface. Since the method definition is in the
    class that implements it, this will not cause deadly diamond of death.
    What is deadly diamond of death?
    If a class extends 2 classes which have the same methods with same arguments and return types
    and if these methods are not abstract, which method will the sub-class inherit?
    There is ambiguity. In order to avoid that, we have interfaces in place.
    We can have a class implement multiple interfaces since all the methods in the interface
    are public and abstract by default.
     */
    void beFriendly();
}
