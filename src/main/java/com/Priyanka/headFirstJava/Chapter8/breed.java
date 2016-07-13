package com.Priyanka.headFirstJava.Chapter8;

/**
 * Created by Priyanka on 7/9/2016.
 */
public interface breed {
    /*
    Why are interface variables public, static and final?
    - public - For accessibility across all the classes
    - static - Since an interface cannot be instantiated, the variables need to be accessed as
    <interfaceName>.<variableName>. Static variables can be referred without an instantiation.
    Therefore, it is static.
    - final - Since the variable is static, it will occupy only one memory location.
    If the variable was not final, then anyone who implements the interface
    can assign a value to it. Multiple classes who implement the interface will give
    multiple values to the variable. Since there's only one memory location, we do not know what value
    will get stored. Then, only one of the classes that implement the interface will get the correct value.
    Every other class will give a wrong value. Therefore, the variable needs to be final.
     */
    float c = 23.33f;
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
    are PUBLIC and ABSTRACT by default.
     */
    void beFriendly();
}
