package com.Priyanka.headFirstJava.Chapter4;

/**
 * Created by prinks on 8/6/17.
 */
public class simpleMaths {
    private int num1;
    private int num2;
    private String operation;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum2() {
        return num2;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }

    public void addition() {
        int result1, result2;
        result2 = 0;
        result1 = result2 + num1 + num2; // A local variable inside a function needs to be initialized.
                                        // However, an instance variable in a class need not be initialized. It takes default values.
        System.out.println("Value of result1: " + result1);
        System.out.println("Value of result2: " + result2);
    }

}
