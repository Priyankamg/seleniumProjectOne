package com.Priyanka.headFirstJavaTests.Chapter14Tests;

import com.Priyanka.headFirstJava.Chapter14.rectangle;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by Priyanka on 8/17/2016.
 */
public class rectangleTest {
    public static void main(String[] args) {
        rectangle rect = new rectangle();
        rect.setLength(30);
        rect.setBreadth(10);

        try {
            FileOutputStream fos = new FileOutputStream("src/test/java/com/Priyanka/headFirstJavaTests/Chapter14Tests/rectSerialized");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(rect);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
