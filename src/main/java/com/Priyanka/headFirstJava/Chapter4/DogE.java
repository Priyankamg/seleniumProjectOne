package com.Priyanka.headFirstJava.Chapter4;

/**
 * Created by prinks on 8/6/17.
 */
public class DogE {
    private String name;
    private int weight;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setWeight(int weight) throws Exception {
        if(!(weight==0))
            this.weight = weight;
        else
            throw new Exception("Weight cannot be 0. Set Weight greater than 0.");
    }
    
    public int getWeight() {
        return weight;
    }

    public void bark() {
        if (weight > 60) {
            System.out.println("Woof! Woof!");
        } else if (weight > 15) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
    
}
