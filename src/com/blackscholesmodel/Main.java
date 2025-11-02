package com.blackscholesmodel;

public class Main {

    public static void main(String[] args) {
        System.out.println("Black-Scholes Option Pricing Model");

        // Create object and gather input
        Calculate option = new Calculate();
        option.getUserInput();  
        option.displayData();   

        // Calculate/Display The Result
        double callPrice = option.calcCallPrice();
        System.out.println("\nEstimated Call Option Price:\n" + callPrice);
    }
}
