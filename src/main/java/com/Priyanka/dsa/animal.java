package com.Priyanka.dsa;

/**
 * Created by prinks on 7/22/17.
 */
public class animal {
    String name;
    String gender;
    int weightInKilograms;
    int age;
    String colour;
    String foodPreference;

    public animal(String name, String gender, int weightInKilograms, int age, String colour, String foodPreference) {
        this.name = name;
        this.gender = gender;
        this.weightInKilograms = weightInKilograms;
        this.age = age;
        this.colour = colour;
        this.foodPreference = foodPreference;
    }

    public void eat() {
        System.out.println("I am a " + gender + " " + name);
        System.out.println("I weigh " + weightInKilograms + " kilograms");
        System.out.println("I am a " + foodPreference);
    }

    public void walk() {
        System.out.println("I am a " + gender + " " + name);
        System.out.println("I am " + age + " years old");
        System.out.println("My body color is " + colour);
        System.out.println("I like to walk");
    }


}
