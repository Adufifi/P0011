package com.mycompany.p0011;

public class Display {

    void displayMenu() {
        System.out.println("Menu:");
        System.out.println("\t1. Binary");
        System.out.println("\t2. Decimal");
        System.out.println("\t3. Hexadecimal");
        System.out.println("\t4. Exit");
    }

    void displayResult(String result) {
        System.out.println("Result convert: " + result);
    }
}
