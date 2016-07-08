package com.Priyanka.headFirstJava.Chapter7;

/**
 * Created by Priyanka on 7/7/2016.
 */
public abstract class animal {
    String name;
    int size;
    String foodHabit;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setFoodHabit(String foodHabit) {
        this.foodHabit = foodHabit;
    }

    public String getFoodHabit() {
        return foodHabit;
    }

    public abstract void makeNoise();

    public abstract void reactionWhenAShotIsGivenByVet();
    
    public void roam() {

    }

    public void eat() {

    }

    public void sleep() {

    }
}
