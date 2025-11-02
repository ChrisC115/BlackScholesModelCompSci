package com.blackscholesmodel;

// Subclass that inherits from Data
public class Calculate extends Data {

    // Constructor for Calculating
    public Calculate(double S, double K, double r, double t, double sigma) {
        super(S, K, r, t, sigma);
    }

    //Constructor Data Gathering
    public Calculate () {}


    // Black-Scholes Calculating Methods
    public double calcD1() {
        return (Math.log(S / K) + (r + Math.pow(sigma, 2) / 2.0) * t) / (sigma * Math.sqrt(t));
    }

    public double calcD2() {
        return calcD1() - sigma * Math.sqrt(t);
    }

    // N is complex so this is the simplified version
    private double N(double x) {
        return 0.5 * (1.0 + Math.tanh(x / Math.sqrt(2)));
    }

    // Main Calculator Method
    public double calcCallPrice() {
        double d1 = calcD1();
        double d2 = calcD2();
        return S * N(d1) - K * Math.exp(-r * t) * N(d2);
    }
}
