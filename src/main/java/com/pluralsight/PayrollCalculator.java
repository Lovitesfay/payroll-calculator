package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args) {


        Scanner payroll = new Scanner(System.in);

        System.out.print("Enter Your Name:");

        String Name = payroll.nextLine();

        System.out.print("How many hours did you work? ");

        double hoursWorked = payroll.nextDouble();

        System.out.print("What is your hourly rate?");

        double hourlyRate = payroll.nextDouble();

        payroll.nextLine();

        double result = hoursWorked * hourlyRate;

        System.out.println("Lovi, You have made " + "$" + result + " for this week");




    }
}
