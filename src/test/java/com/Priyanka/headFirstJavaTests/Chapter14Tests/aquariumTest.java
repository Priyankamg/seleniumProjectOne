package com.Priyanka.headFirstJavaTests.Chapter14Tests;

import com.Priyanka.headFirstJava.Chapter14.aquarium;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by Priyanka on 8/17/2016.
 */
public class aquariumTest {
    public static void main(String[] args) {
        aquarium aqua = new aquarium();

        try {
            FileOutputStream fos = new FileOutputStream("src/test/java/com/Priyanka/headFirstJavaTests/Chapter14Tests/aquaSer");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(aqua);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
