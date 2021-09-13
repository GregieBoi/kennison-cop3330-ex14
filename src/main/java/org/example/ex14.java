/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 McGreggor Kennison
 */


package org.example;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ex14 {

    // main
    public static void main(String[] args) {

        // initialize amount
        double amount = get_amount();

        // initialize tax and calculate total
        double tax = get_tax(amount, get_state());
        double total = amount + tax;

        // set format and rounding mode
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.CEILING);

        // print output
        System.out.println("The subtotal is $" + df.format(amount) + ".\n"
                + "The tax is $" + df.format(tax) + ".\n"
                + "The total is $" + df.format(total) + ".");

    }

    // gets amount
    public static double get_amount() {

        // prompts for input and returns scan
        System.out.print("What is the order amount? ");
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }

    // gets state
    public static String get_state() {

        // prompts for input and returns scan
        System.out.print("What is the state? ");
        Scanner input = new Scanner(System.in);
        return input.next();
    }


    // determines tax
    public static double get_tax(double amount, String state) {

        // initialize rate as zero
        double tax_rate = 0;

        // checks if state is WI
        if (state.equals("WI")) {

            // sets rate to WI rate
            tax_rate = 0.055;

        }

        // returns calculated tax
        return  (amount * tax_rate);
    }
}
