package com.Priyanka.headFirstJava.Chapter14;

import java.io.Serializable;

/**
 * Created by Priyanka on 9/6/2016.
 */
public class cricket implements Serializable{
    String name;
    String team;

    public void setName(String name) {
        this.name = name;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }
}
