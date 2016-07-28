package com.Priyanka.jsonTests;

import com.Priyanka.json.User;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

/**
 * Created by Priyanka on 7/27/2016.
 */
public class userTest {
    public static void main(String[] args) {
        File jsonFile = new File("src/main/java/com/Priyanka/json/user.json");
        ObjectMapper mapper = new ObjectMapper();
        User user = null;
        try {
            user = mapper.readValue(jsonFile, User.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(user.getName().getFirst());
        System.out.println(user.getName().getLast());
        System.out.println(user.getGender());

    }
}
