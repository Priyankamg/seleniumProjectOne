package com.Priyanka.headFirstJavaTests.Chapter10Tests;

import com.Priyanka.headFirstJava.Chapter10.player;

/**
 * Created by Priyanka on 7/18/2016.
 */
public class playerTest {
    public static void main(String[] args) {
        player p1 = new player("Sachin Tendulkar");
        System.out.println("After 1 object is made: " + p1.nonStaticMethodGetPlayerCount());
        player p2 = new player("Rahul Dravid");
        System.out.println("After 2 objects are made: " + p2.nonStaticMethodGetPlayerCount());
        player p3 = new player("M S Dhoni");
        System.out.println("After 3 objects are made: " + p3.nonStaticMethodGetPlayerCount());
        System.out.println("Number of player objects made are: " + player.staticMethodGetPlayerCount());
        System.out.println("Number of player objects made are: " + player.playerCount);


    }
}
