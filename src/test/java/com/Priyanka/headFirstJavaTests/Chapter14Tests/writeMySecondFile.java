package com.Priyanka.headFirstJavaTests.Chapter14Tests;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Priyanka on 9/6/2016.
 */
public class writeMySecondFile {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("src/test/java/com/Priyanka/headFirstJavaTests/Chapter14Tests/mySecondFile");
            fw.write("Learning to build an automation framework is fun");
            fw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
