package studio1;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner in = new Scanner(System.in);
        
        // Prompt the user for three numbers
        System.out.print("Enter first number: ");
        double num1 = in.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = in.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = in.nextDouble();
        
        // Calculate the average
        double average = (num1 + num2 + num3) / 3;
        
        // Print the average
        System.out.println("Average of " + num1 + ", " + num2 + ", and " + num3 + " is " +average + ".");
    }


}
