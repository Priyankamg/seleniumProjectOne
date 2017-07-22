package com.Priyanka.dsaTest;

import com.Priyanka.dsa.animal;
import com.Priyanka.dsa.bird;
import com.Priyanka.dsa.fish;

/**
 * Created by prinks on 7/22/17.
 */
public class zoo {
    public static void main(String[] args) {
        animal dog = new animal("Dog","Male",35,4,"Brown","omnivore");
        animal cat = new animal("Cat","Female",20,3,"Green","carnivore");
        animal cow = new animal("Cow","Male",90,10,"Black","herbivore");

        bird eagle = new bird("Eagle","Male",2,1,"Brown","Carnivore","Very powerful");
        bird crow = new bird("Crow","Female",1,2,"Black","Omnivore","not as powerful as that of an eagle");

        fish dolphin = new fish("Dolphin","Male",30,5,"Black","Carnivore");
        fish shark = new fish("Shark","Female",100,7,"Blue","Carnivore");

        dog.eat();
        dog.walk();

        cat.eat();
        cat.walk();

        cow.eat();
        cow.walk();

        eagle.fly();
        eagle.eat();

        crow.fly();
        crow.eat();

        dolphin.swim();
        shark.swim();
    }
}
