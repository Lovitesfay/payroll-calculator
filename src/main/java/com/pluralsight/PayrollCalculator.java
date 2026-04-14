package com.pluralsight;

import javax.naming.Name;
import java.util.Scanner;

public class PayrollCalculator {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
 String name = payroll();
 double hourworked = hours();
 double houryrate = rate();
 total(hourworked, houryrate);

    }
    public static String payroll  (){

        System.out.print("Enter Your Name: ");
        String Name = input.nextLine();
            return Name;
    }
    public static double hours()
  {
      System.out.print("How many hours did you work? ");
      double hoursWorked = input.nextDouble();
      return hoursWorked;
}
    public static double rate() {
        System.out.print("What is your hourly rate? ");

        double hourlyRate = input.nextDouble();

        input.nextLine();
        return hourlyRate;
    }
    public static void total(double hoursWorked, double hourlyRate){

        double result = hoursWorked * hourlyRate;
        System.out.println("Lovi, You have made " + "$" + result + " for this week");
    }

}
