package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Vishal Choday
 */
/*Exercise 11 - Currency Conversion
        At some point, you might have to deal with currency exchange rates, and you’ll need to ensure your calculations are as precise as possible.

        Write a program that converts currency. Specifically, convert euros to U.S. dollars. Prompt for the amount of money in euros you have, and prompt for the current exchange rate of the euro. Print out the new amount in U.S. dollars.

        The formula for currency conversion is derived from

        c_to / c_frame = rate
        where

        c_to is the amount in U.S. dollars.
        c_from is the amount in euros.
        rate is the per-unit current exchange rate from c_from to c_to.
        Example Output
        How many euros are you exchanging? 81
        What is the exchange rate? 1.3751
        81 euros at an exchange rate of 1.3751 is
        111.38 U.S. dollars.
        Constraints
        Ensure that fractions of a cent are rounded up to the next penny.
        Use a single output statement.
*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double amt_of_euros_now;

        System.out.println("How many euros are you exchanging? ");
        amt_of_euros_now = Double.parseDouble(input.nextLine());
        double exchanging;
        System.out.println("What is the exchange rate? ");
        exchanging = Double.parseDouble(input.nextLine());

        double EXCH_THE_DOL;
        EXCH_THE_DOL =  ((amt_of_euros_now * exchanging) * 100) / 100;

        System.out.printf("%.0f euros at an exchange rate of %.4f is\n%.2f U.S. dollars.", amt_of_euros_now, exchanging, EXCH_THE_DOL);


    }

}
