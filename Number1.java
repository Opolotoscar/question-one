/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.number1;

/**
 *
 * @author NYARUP
 */
import java.util.Scanner;

 public class Number1{
    // Method to check if a given month is a leap month
    public static boolean isLeapMonth(int year, int month) {
        // Check if the year is divisible by 4 but not by 100, or if it's divisible by 400
        boolean isLeapMonth = (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
        
        // Return true if it's a leap month according to the conditions
        return isLeapMonth && ((month % 100 != 0) || (month % 400 == 0));
    }

    public static void main(String[] args) {
        // Test the method with a sample year and month
        int year = 1988; // Example year
        int month = 8;   // Example month (August)

        // Check if the given month is a leap month and display the result
        boolean result = isLeapMonth(year, month);
        System.out.println("Is " + year + " month " + month + " a leap month? " + result);
    }
}



