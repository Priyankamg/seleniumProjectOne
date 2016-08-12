package com.Priyanka.headFirstJavaTests.Chapter14Tests;

import com.Priyanka.headFirstJava.Chapter14.pond;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by Priyanka on 8/11/2016.
 */
public class pondTest {
    public static void main(String[] args) {
        pond p = new pond();

        try {
            FileOutputStream fos = new FileOutputStream("src/test/java/com/Priyanka/headFirstJavaTests/Chapter14Tests/pondSer");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(p);
        } catch (FileNotFoundException e) {
            System.out.println("-- inside fileNotFoundException -- ");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("-- inside ioException --");
            e.printStackTrace();
        }
    }
}
