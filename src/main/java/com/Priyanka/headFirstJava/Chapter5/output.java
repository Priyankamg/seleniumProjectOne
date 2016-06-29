package com.Priyanka.headFirstJava.Chapter5;

/**
 * Created by Priyanka on 6/28/2016.
 */
public class output {
    public void go() {
        int y = 7;
        for(int x = 1; x < 8; x++){
            y++;
            if(x>4){
                System.out.print(++y + " ");
            }
            if(y>14){
                System.out.println(" x = "+x);
                break;
            }
        }
    }

}
