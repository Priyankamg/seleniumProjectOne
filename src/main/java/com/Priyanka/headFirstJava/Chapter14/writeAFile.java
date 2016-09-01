package com.Priyanka.headFirstJava.Chapter14;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Priyanka on 8/31/2016.
 */
public class writeAFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("src/test/java/com/Priyanka/headFirstJavaTests/Chapter14Tests/writingMyFirstFile.txt");
            writer.write("Hi! I am writing into my first file");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
