package com.Priyanka.jsonTests;

import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;


/**
 * Created by Priyanka on 8/9/2016.
 */
public class mapsApiTest {
    String baseUrl = "https://maps.googleapis.com";
    String path = "/maps/api/geocode/json";

    @Test
    public void testStatus() {
        String url = baseUrl + path;
        System.out.println("Url is: " + url);
        int statusCodeObtd = given()
                .param("address","1600 Amphitheatre Pkwy Mountain View CA")
                .get(url)
                .statusCode();
        Assert.assertTrue(statusCodeObtd==200);
    }
}
