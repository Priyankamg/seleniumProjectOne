package com.Priyanka.dsa;

/**
 * Created by prinks on 7/22/17.
 */
public class bird {
    String name;
    String gender;
    int weightInKilograms;
    int age;
    String colour;
    String foodPreference;
    String eyesight;

    public bird(String name, String gender, int weightInKilograms, int age, String colour, String foodPreference, String eyesight) {
        this.name = name;
        this.gender = gender;
        this.weightInKilograms = weightInKilograms;
        this.age = age;
        this.colour = colour;
        this.foodPreference = foodPreference;
        this.eyesight = eyesight;
    }

    public void fly() {
        System.out.println("I am a " + gender + " " + name);
        System.out.println("I weigh " + weightInKilograms + " kilograms");
        System.out.println("I am a " + foodPreference);
        System.out.println("My body colour is " + colour);
        System.out.println("My eyesight is " + eyesight);
    }

    public void eat() {
        System.out.println("I am a " + gender + " " + name);
        System.out.println("I am " + age + " years old");
        System.out.println("I like to eat");
    }
}
