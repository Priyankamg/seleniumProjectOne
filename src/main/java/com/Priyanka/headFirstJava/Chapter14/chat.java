package com.Priyanka.headFirstJava.Chapter14;

import java.io.Serializable;

/**
 * Created by Priyanka on 8/17/2016.
 */
public class chat implements Serializable {
    /* A transient keyword implies that the particular instance variable
       will not be serialized. Why would you make an instance variable transient?
       Sometimes, the values will depend on values at RunTime. At such times, every time the program runs,
       the value of the transient variable will be different.
    */

    transient String currentId;
    String userName;
}
