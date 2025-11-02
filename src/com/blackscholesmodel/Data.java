package com.blackscholesmodel;
import java.util.Scanner;

// Superclass for Calculate
public class Data {

    // Attributes 
    protected double S;     // Stock price
    protected double K;     // Strike price
    protected double r;     // Risk-free rate
    protected double t;     // Time to expiration (in years)
    protected double sigma; // Volatility

    //constructor
    public Data() {}

    //Constructor
    public Data(double S, double K, double r, double t, double sigma) {
        this.S = S;
        this.K = K;
        this.r = r;
        this.t = t;
        this.sigma = sigma;
    }

    // Scanner Method
    public void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter current stock price (S): ");
        S = scanner.nextDouble();
        System.out.print("Enter strike price (K): ");
        K = scanner.nextDouble();
        System.out.print("Enter risk-free interest rate (r as decimal): ");
        r = scanner.nextDouble();
        System.out.print("Enter time to expiration (t in years): ");
        t = scanner.nextDouble();
        System.out.print("Enter volatility (sigma as decimal): ");
        sigma = scanner.nextDouble();
    }

    // Print Method
    public void displayData() {
        System.out.println("\nOption's Data");
        System.out.println("Stock Price (S): " + S);
        System.out.println("Strike Price (K): " + K);
        System.out.println("Risk-Free Rate (r): " + r);
        System.out.println("Time to Expiration (t): " + t);
        System.out.println("Volatility (sigma): " + sigma);
    }
}
