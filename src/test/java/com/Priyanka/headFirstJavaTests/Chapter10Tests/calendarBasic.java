package com.Priyanka.headFirstJavaTests.Chapter10Tests;

import java.util.Calendar;

/**
 * Created by Priyanka on 7/21/2016.
 */
public class calendarBasic {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        System.out.println("Calendar time: " + c.getTime());
        System.out.println("Date: " + c.DATE);
        System.out.println("Month: " + c.MONTH);
        System.out.println("Year: " + c.YEAR);
    }
}
