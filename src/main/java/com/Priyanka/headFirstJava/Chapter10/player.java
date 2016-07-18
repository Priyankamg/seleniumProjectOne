package com.Priyanka.headFirstJava.Chapter10;

/**
 * Created by Priyanka on 7/18/2016.
 */
public class player {
    public static int playerCount;
    private String name;

    public player(String name) {
        this.name = name;
        playerCount++;
    }

    /*
    A static method cannot have the following:
    1. Access to instance variables which are not static
    2. Call methods which are not static

    Reason:
    From outside, when this method is called, this method
    does not know anything about instance variables.
    Non-static methods also use instance variables (which are usually non-static.
    Therefore, static method can access static variables and static methods only.
     */
    public static int staticMethodGetPlayerCount() {
        return playerCount;
    }

    /*
    A non-static method can access static variable and static method
    There is no problem at all.
     */
    public int nonStaticMethodGetPlayerCount() {
        int count = staticMethodGetPlayerCount();
        return (count + playerCount);
    }

}
