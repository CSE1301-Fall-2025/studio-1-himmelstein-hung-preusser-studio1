package studio1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner in = new Scanner(System.in);
        // Prompt the user for a year
        System.out.print("Enter a year: ");
        int year = in.nextInt();
        // Check if the year is a leap year
        boolean isLeapYear = true;
        // Print whether the year is a leap year
         isLeapYear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    
        System.out.println(year + " is a leap year." + isLeapYear);}

}
