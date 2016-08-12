package com.Priyanka.headFirstJavaTests.Chapter14Tests;

import com.Priyanka.headFirstJava.Chapter14.box;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by Priyanka on 8/11/2016.
 */
public class boxTest {
    public static void main(String[] args) {
        box b = new box();
        b.setHeight(20);
        b.setWidth(10);

        try {
            FileOutputStream fos = new FileOutputStream("src/test/java/com/Priyanka/headFirstJavaTests/Chapter14Tests/boxSerialized");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(b);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
