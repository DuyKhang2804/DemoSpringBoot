package com.cybersoft.demospringboot.model;

public class CalculatorPlus {
    private static int a,b;

    public static int getA() {
        return a;
    }

    public static int getB() {
        return b;
    }

    public static void setA(int a) {
        CalculatorPlus.a = a;
    }

    public static void setB(int b) {
        CalculatorPlus.b = b;
    }
}
