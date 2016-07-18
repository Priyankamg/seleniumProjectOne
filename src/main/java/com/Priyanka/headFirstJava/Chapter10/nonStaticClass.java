package com.Priyanka.headFirstJava.Chapter10;

/**
 * Created by Priyanka on 7/18/2016.
 */
public class nonStaticClass {
    String title;

    public nonStaticClass(String title) {
        this.title = title;
    }

    public void playMusic() {
        if(title.equals("Arijit")) {
            System.out.println("Hum Tere Bin..");
        } else if(title.equals("Sonu Nigam")) {
            System.out.println("Kal ho na ho ..");
        } else {
            System.out.println("Singer not present in our list");
        }
    }

    public static void hiThere() {
        System.out.println("There, There!");
    }
}
