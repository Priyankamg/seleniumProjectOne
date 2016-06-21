package com.Priyanka.headFirstJava;

/**
 * Created by Priyanka on 6/20/2016.
 */
public class GuessGame {
    Player p1, p2, p3;
    int numberOfComputer;
    int numberp1, numberp2, numberp3;
    int x;
    int count;
    public void startGame() {
        System.out.println("Hi there! Let's start the guessing game");
        System.out.println("I will choose a number between 0 and 9 and each of you have to guess the number");
        System.out.println("3 chances to choose the right number");
        System.out.println("The winner will get a prize");

        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        numberOfComputer = (int) (Math.random() * 10);
        System.out.println("Computer guessed: " + numberOfComputer);
        x = 3;
        count = x;
        while (x > 0)
         {

            numberp1 = p1.guess();
            numberp2 = p2.guess();
            numberp3 = p3.guess();
             System.out.println("Number p1: " + numberp1);
             System.out.println("Number p2: " + numberp2);
             System.out.println("Number p3: " + numberp3);

            if (numberOfComputer == numberp1 && numberOfComputer == numberp2 && numberOfComputer == numberp3) {
                System.out.println("Player 1, 2 and 3 got it right. Awesome!");
                x = 0;
            } else if(numberOfComputer == numberp1 && numberOfComputer==numberp2 ) {
                System.out.println("Player 1 and 2 got it right. Sorry Player 3, you missed it.");
                x = 0;
            } else if(numberOfComputer == numberp2 && numberOfComputer == numberp3) {
                System.out.println("Player 2 and 3 got it right. Sorry Player 1, you missed it. ");
                x = 0;
            } else if(numberOfComputer == numberp3 && numberOfComputer==numberp1) {
                System.out.println("Player 3 and 1 got it right. Sorry Player 2, you missed it. ");
                x = 0;
            } else if (numberOfComputer == numberp1) {
                System.out.println("Player 1 wins. Way to go!");
                x = 0;
            } else if(numberOfComputer == numberp2) {
                System.out.println("Player 2 wins. Way to go!");
                x = 0;
            } else if(numberOfComputer == numberp3) {
                System.out.println("Player 3 wins. Way to go!");
                x = 0;
            }
             x--;
             if(x==-1) {
                 System.out.println("GAME OVER!");
             } else if(x==0) {
                 System.out.println("You did not get it right after " + count + " number of tries. GAME OVER.");
             } else {
                 System.out.println(x + " more tries to go. Guess again");
             }
         }
    }
}
