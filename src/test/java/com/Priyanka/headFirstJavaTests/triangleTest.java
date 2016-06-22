package com.Priyanka.headFirstJavaTests;

import com.Priyanka.headFirstJava.triangle;

/**
 * Created by Priyanka on 6/22/2016.
 */
public class triangleTest {
    public static void main(String[] args) {

        triangle[] ta = new triangle[4];
        int x=0;

        while (x<4){
            ta[x] = new triangle();
            ta[x].height = (x + 1) * 2;
            ta[x].length = x + 4;
            ta[x].setArea();
            System.out.print("triangle " + x + " area");
            System.out.println(" = " + ta[x].area);
            x = x + 1;
        }

        int y = x;
        x = 27;
        triangle t5=  ta[2];
        ta[2].area = 343;
        System.out.print("y = " + y);
        System.out.println(", t5 area = " +  t5.area);
        

    }
}
