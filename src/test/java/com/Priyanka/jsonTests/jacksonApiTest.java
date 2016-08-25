package com.Priyanka.jsonTests;

import com.Priyanka.json.nameAge;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * Created by Priyanka on 8/2/2016.
 */
public class jacksonApiTest {
    @Test
    public void testAPIAttributes() {
        ObjectMapper objectMapper  = new ObjectMapper();
        File simpleDetailsJson = new File("src/main/java/com/Priyanka/json/simpleDetails.json");
        nameAge nameAgeObj=null;
        try {
            nameAgeObj = objectMapper.readValue(simpleDetailsJson,nameAge.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(nameAgeObj.getFirstName());
        System.out.println(nameAgeObj.getLastName());
        System.out.println(nameAgeObj.getAge());
//        System.out.println(nameAgeObj.getAddress().getStreetAddress());
//        System.out.println(nameAgeObj.getAddress().getCity());
//        System.out.println(nameAgeObj.getAddress().getState());
//        System.out.println(nameAgeObj.getAddress().getPostalCode());
//        System.out.println(nameAgeObj.getPhNo().get(0).getNumber());
//        System.out.println(nameAgeObj.getPhNo().get(0).getType());
//        System.out.println(nameAgeObj.getPhNo().get(1).getNumber());
//        System.out.println(nameAgeObj.getPhNo().get(1).getType());

        assertEquals("Age is incorrect", nameAgeObj.getAge(),26);
    }
}
