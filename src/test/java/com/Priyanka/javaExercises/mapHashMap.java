package com.Priyanka.javaExercises;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Priyanka on 7/25/2016.
 */
public class mapHashMap {

    public static void main(String[] args) {
        Map<String,String> engHinDic = new HashMap<String,String>();
        engHinDic.put("Monday","Somwar");
        engHinDic.put("Tuesday","Mangalwar");
        engHinDic.put("Wednesday","Budhwar");
        engHinDic.put("Thursday","Guruwar");
        engHinDic.put("Friday","Shukrawar");
        engHinDic.put("Saturday","Shaniwar");
        engHinDic.put("Sunday","Raviwar");
        // Print out all the values
        System.out.println(engHinDic.get("Monday"));
        System.out.println(engHinDic.get("Tuesday"));
        System.out.println(engHinDic.get("Wednesday"));
        System.out.println(engHinDic.get("Thursday"));
        System.out.println(engHinDic.get("Friday"));
        System.out.println(engHinDic.get("Saturday"));
        System.out.println(engHinDic.get("Sunday"));
        // Print key set
        System.out.println(engHinDic.keySet());
        // Print value set
        System.out.println(engHinDic.values());
        // size of the dictionary
        System.out.println(engHinDic.size());

        System.out.println();
        System.out.println();

        Map<String,Boolean> shoppingList = new HashMap<String, Boolean>();
        shoppingList.put("Bread",true);
        shoppingList.put("Onions",Boolean.TRUE);
        shoppingList.put("Toor Dal",false);
        shoppingList.put("Tomatoes",true);
        shoppingList.put("Cauliflower",Boolean.FALSE);

        System.out.println(shoppingList.get("Onions"));
        System.out.println(shoppingList.get("Toor Dal"));

        System.out.println(shoppingList.keySet());
        System.out.println(shoppingList.values());

        System.out.println(shoppingList.toString());
        System.out.println(shoppingList.isEmpty());

        shoppingList.remove("Toor Dal");
        System.out.println(shoppingList.toString());

        //shoppingList.replace("Tomatoes",false);

        //shoppingList.replace("Tomatoes",false);
        /*
        Clear method does not remove all the items
        The shoppingList that was referring to this dictionary earlier
        now refers to an empty dictionary
         */
        shoppingList.clear();
        System.out.println(shoppingList.toString());
        System.out.println(shoppingList.isEmpty());
    }

}
