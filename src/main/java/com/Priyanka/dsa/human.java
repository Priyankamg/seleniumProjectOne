package com.Priyanka.dsa;

/**
 * Created by prinks on 7/22/17.
 */
public class human {
    String name;
    int age;
    String eyeColor;

    public human() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void speak() {
        System.out.println("Hello, my name is " + name);
        System.out.println("I am " + age + " years old");
        System.out.println("My eyes are " + eyeColor);
    }

    public void eat() {
        System.out.println("Eating..");
    }

    public void walk() {
        System.out.println("Walking..");
    }

    public void work() {
        System.out.println("Working..");
    }
}
