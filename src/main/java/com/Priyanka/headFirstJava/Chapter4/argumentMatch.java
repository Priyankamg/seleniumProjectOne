package com.Priyanka.headFirstJava.Chapter4;

/**
 * Created by Priyanka on 6/23/2016.
 */
public class argumentMatch {
    public int num;
    public String name;
    public char ch;
    public boolean isFun;

    public void variousTypes() {
        System.out.println(name + " " + ch + " " + " " + isFun);
        num = num + Integer.parseInt(name) + ch;
        System.out.println("The value of num after: " + num);
        num =ch;
        System.out.println("The value of num after: " + num);

        System.out.println("The value of isFun is: " + isFun);
    }

    public void multipleParams(int nu, String na, char c, boolean is) {
        System.out.println(nu + " " + na + " " + c + " " + is);
    }

}
