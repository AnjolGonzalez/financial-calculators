package com.pluralsight;
import java.util.Scanner;
public class CdCalculator {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        //Deposit amount
        System.out.print("What is the initial deposit amount?  $");
        double principal = scanner.nextDouble();
        //Interest rate
        System.out.print("What is the yearly interest rate(percentage)? ");
        double interestRate = scanner.nextDouble()/100;
        //Number of years
        System.out.print("What is the number of years? ");
        int numYears = scanner.nextInt();
        //add future number display
        double futureValue = calculateFutureValue(principal, interestRate, numYears);

        System.out.print(" The future value after " + numYears + "years here, is $" + futureValue);

    }
    private static double calculateFutureValue(double principal, double interestRate, int numYears) {
        double futureValue = principal * Math.pow((1 + interestRate/365), numYears * 365);
        return futureValue;
    }
}
