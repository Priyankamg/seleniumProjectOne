package com.Priyanka.headFirstJavaTests.Chapter14Tests;

import com.Priyanka.headFirstJava.Chapter14.cricket;

import java.io.*;

/**
 * Created by Priyanka on 9/6/2016.
 */
public class cricketTest {
    public static void main(String[] args) {

        cricket one = new cricket();
        cricket two = new cricket();

        one.setName("Sachin Tendulkar");
        one.setTeam("India");

        two.setName("Ricky Ponting");
        two.setTeam("Australia");

        try {
            FileOutputStream fos = new FileOutputStream("src/test/java/com/Priyanka/headFirstJavaTests/Chapter14Tests/cricketSer");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(one);
            oos.writeObject(two);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream("src/test/java/com/Priyanka/headFirstJavaTests/Chapter14Tests/cricketSer");
            ObjectInputStream ois = new ObjectInputStream(fis);
            cricket first = (cricket) ois.readObject();
            cricket second = (cricket) ois.readObject();
            System.out.println(first.getName() + " is from " + first.getTeam());
            System.out.println(second.getName() + " is from " + second.getTeam());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }



    }
}
