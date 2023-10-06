package com.pluralsight;
import java.util.Scanner;
import java.text.DecimalFormat;
public class MortgageCalculator {
    public static void mortgage() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your loan amount?");
        double loanAmount = scanner.nextDouble();

        System.out.print("What yearly interest rate?(percentage): ");
        double yearlyInterestRate = scanner.nextDouble();

        System.out.print("What is your loan length? (in years): ");
        int loanLengthYears = scanner.nextInt();

        System.out.println("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        double monthlyInterestRate = yearlyInterestRate/100/12;
        int loanLengthInMonths = loanLengthYears * 12;

        double monthlyPayment = calculateMonthlyPayment(loanAmount, monthlyInterestRate, loanLengthInMonths);
        double total = monthlyPayment * loanLengthInMonths;
        double totalInterest = total - principal;

        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.println("Mortgage Payment Details:");
        System.out.println("Loan Amount: $" + decimalFormat.format(loanAmount));
        System.out.println("Annual interest rate: " + yearlyInterestRate + "%");
        System.out.println("Loan length: " + loanLengthYears + " years");
        System.out.println("Principal amount: $" + decimalFormat.format(principal));
        System.out.println("Monthly pay: $" + decimalFormat.format(monthlyPayment));
        System.out.println("Total pay: $" + decimalFormat.format(total));
        System.out.println("Total Interest: $" + decimalFormat.format(totalInterest));

    }

    private static double calculateMonthlyPayment(double loanAmount, double monthlyInterestRate, int loanLengthInMonths) {
        double monthlyPayment;
        monthlyPayment = (loanAmount * monthlyInterestRate)/(1-Math.pow(1 + monthlyInterestRate, -loanLengthInMonths));
        return monthlyPayment;
    }

}
