package com.Priyanka.dsa;

/**
 * Created by prinks on 7/22/17.
 */
public class fish {
    String name;
    String gender;
    int weightInKilograms;
    int age;
    String colour;
    String foodPreference;

    public fish(String name, String gender, int weightInKilograms, int age, String colour, String foodPreference) {
        this.name = name;
        this.gender = gender;
        this.weightInKilograms = weightInKilograms;
        this.age = age;
        this.colour = colour;
        this.foodPreference = foodPreference;
    }

    public void swim() {
        System.out.println("I am a " + gender + " " + name);
        System.out.println("I weigh " + weightInKilograms + " kilograms");
        System.out.println("I am " + age + " years old");
        System.out.println("My body colour is " + colour);
        System.out.println("I am a " + foodPreference);
    }
}
