package com.Priyanka.jsonTests;

import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;


/**
 * Created by Priyanka on 8/9/2016.
 */
public class mapsApiTest {
    String baseUrl = "https://maps.googleapis.com";
    String path = "/maps/api/geocode/json";
    String url = baseUrl + path;

    @Test
    public void testStatus() {
        int statusCodeObtd = given()
                .param("address","1600 Amphitheatre Pkwy Mountain View CA")
                .get(url)
                .statusCode();
        Assert.assertTrue(statusCodeObtd==200);
    }

    @Test
    public void testResponseType() {
        Headers responseType = given()
                .get(url)
                .headers();
        System.out.println("--------");
        System.out.println(responseType);
        System.out.println("--------");
        Assert.assertTrue(responseType.toString().contains("application/json"));


    }

    @Test
    public void testSingleHeaderHasAValue() {
        given()
                .get(url)
                .then()
                .assertThat()
                .header("Content-Type","application/json; charset=UTF-8");
    }

    @Test
    public void testMultipleHeaders() {
        given()
                .get(url)
                .then()
                .assertThat()
                .headers("Content-Type","application/json; charset=UTF-8","Cache-Control","no-cache, must-revalidate");
    }

    @Test
    public void testResponse() {
        Response response = given()
                .param("address","1600 Amphitheatre Pkwy Mountain View CA")
                .get(url)
                .then()
                .extract().response();
        response.prettyPrint();
        Assert.assertEquals(response.path("status"),"OK");
        Assert.assertEquals(response.path("results[0].formatted_address"),"1600 Amphitheatre Pkwy, Mountain View, CA 94043, USA");
        Assert.assertEquals(response.path("results[0].address_components[0].short_name"),"1600");
        Assert.assertEquals(response.path("results[0].address_components[1].short_name"),"Amphitheatre Pkwy");
        Assert.assertEquals(response.path("results[0].address_components[2].short_name"),"Mountain View");
        Assert.assertEquals(response.path("results[0].address_components[3].short_name"),"Santa Clara County");
        Assert.assertEquals(response.path("results[0].address_components[4].long_name"),"California");
        Assert.assertEquals(response.path("results[0].address_components[5].long_name"),"United States");
        Assert.assertEquals(response.path("results[0].address_components[6].types[0]"),"postal_code");

    }

}
