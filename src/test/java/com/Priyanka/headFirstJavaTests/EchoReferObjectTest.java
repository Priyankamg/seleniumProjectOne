package com.Priyanka.headFirstJavaTests;

import com.Priyanka.headFirstJava.Echo;

/**
 * Created by Priyanka on 6/21/2016.
 */
public class EchoReferObjectTest {
    public static void main(String[] args) {
        Echo e1 = new Echo();
        Echo e2 = e1;
        int x = 0;

        while(x < 4) {
            e1.hello();
            e1.count = e1.count + 1;

            if(x>0) {
                e2.count = e2.count + 1;
            }

            if(x>1){
                e2.count = e2.count + e1.count;
            }
            x = x + 1;
        }
        System.out.println(e2.count);
    }
}

