package com.blackscholesmodel;
import java.util.Scanner;

public class Data {

    Scanner scanner = new Scanner(System.in);
    
    System.out.println("What is your call option price? ");
    double c = scanner.nextDouble(); //Call option Price

    System.out.println("What is the current Stock price? ");
    double s = scanner.nextDouble(); //Current Stock Price

    System.out.println("What is the Strike price? ");
    double k = scanner.nextDouble(); //Strike Price

    System.out.println("What is the risk-free interest rate (as a decimal)? ");
    double r = scanner.nextDouble(); //Risk-free Interest Rate

    System.out.println("What is time to expiration (in years)? ");
    double t = scanner.nextDouble(); //Time till Expiration

    System.out.println("What is the normal standard distribution value? ");
    double n = scanner.nextDouble(); //Normal Standard Distribution Value

    System.out.println("What is the volatility of the stock(as a decimal)? ");
    double sigma = scanner.nextDouble(); //Volatility of the Stock


    //constructor method:
    public Data(String species, int id) {
        this.species = species; 
        this.id = id; 
    }    
        //the first 'this.species' refers to the VARIABLE 'species' in THIS class for each new object.
        //the second 'species' refers to the PARAMTER, whose value was entered when creating the new object: ex., Pet("cat").  

    //behaviors:
    public void getSpecies(){
        System.out.println("This pet is a: " + species + " \nId: " + id);
    }
}