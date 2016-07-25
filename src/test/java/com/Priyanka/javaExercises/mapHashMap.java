package com.Priyanka.javaExercises;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Priyanka on 7/25/2016.
 */
public class mapHashMap {
    public static void main(String[] args) {
        Map<String,String> engHinDic = new HashMap<String,String>();c
        engHinDic.put("Monday","Somwar");
        engHinDic.put("Tuesday","Mangalwar");
        engHinDic.put("Wednesday","Budhwar");
        engHinDic.put("Thursday","Guruwar");
        engHinDic.put("Friday","Shukrawar");
        engHinDic.put("Saturday","Shaniwar");
        engHinDic.put("Sunday","Raviwar");

        System.out.println(engHinDic.get("Monday"));
        System.out.println(engHinDic.get("Tuesday"));
        System.out.println(engHinDic.get("Wednesday"));
        System.out.println(engHinDic.get("Thursday"));
        System.out.println(engHinDic.get("Friday"));
        System.out.println(engHinDic.get("Saturday"));
        System.out.println(engHinDic.get("Sunday"));
    }

}
