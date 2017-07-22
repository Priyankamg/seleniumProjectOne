package com.Priyanka.dsa;

/**
 * Created by prinks on 7/22/17.
 */
public class person {
    String name;
    int heightInCms;
    int age;
    String eyeColour;

    public person(String name, int heightInCms, int age, String eyeColour) {
        this.name = name;
        this.heightInCms = heightInCms;
        this.age = age;
        this.eyeColour = eyeColour;
    }

    public void speak() {
        System.out.println("Hello, my name is " + name);
        System.out.println("I am " + heightInCms + " centimeters tall");
        System.out.println("I am " + age + " years old");
        System.out.println("My eye colour is " + eyeColour);
    }

    public void eat() {
        System.out.println("I like to eat");
    }

    public void work() {
        System.out.println("I love to go to work");
    }

    public void walk() {
        System.out.println("I like to go for a walk in the mornings or evenings. The weather is very pleasant");
    }
}
