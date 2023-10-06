package com.pluralsight;

import java.util.Scanner;

public class FinancialCalculators {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);

        System.out.println("Which calculator would you like to use?");
        System.out.print("1: Mortgage or 2: Cd ");

        int myoption = myscanner.nextInt();
        if (myoption == 1) {
            MortgageCalculator myCalculator = new MortgageCalculator();
            myCalculator.mortgage();
        }
        else if (myoption == 2) {
            CdCalculator myCdCalculator = new CdCalculator();
            myCdCalculator.main();
        }
        else {
        System.out.print("Invalid input try again");
    }
}
}
