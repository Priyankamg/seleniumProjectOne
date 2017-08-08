package com.Priyanka.headFirstJava.Chapter4;

/**
 * Created by prinks on 8/6/17.
 */
public class ElectricGuitar {
    String brand;
    int numberOfPickups;
    boolean rockStarUsesIt;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setNumberOfPickups(int numberOfPickups) {
        this.numberOfPickups = numberOfPickups;
    }

    public int getNumberOfPickups() {
        return numberOfPickups;
    }

    public void setRockStarUsesIt(boolean rockStarUsesIt) {
        this.rockStarUsesIt = rockStarUsesIt;
    }

    public boolean getRockStartUsesIt() {
        return rockStarUsesIt;
    }
}

