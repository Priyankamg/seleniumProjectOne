package com.Priyanka.headFirstJava.Chapter14;

import java.io.Serializable;

/**
 * Created by Priyanka on 8/17/2016.
 */
public class aquarium implements Serializable {

    private fish salmon;

    public aquarium() {
        salmon = new fish();
    }


}
