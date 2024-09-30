/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.travisr1mathclassp5;
import java.util.Scanner; //Importing Scanner class
import java.text.DecimalFormat; //Import DecimalFormat class

/**
 *
 * @author TTang2026
 */
public class TravisR1MathClassP5 {

    public static void main(String[] args) {
        
        //Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        //The real number from the user's input
        System.out.println("Enter a real number: ");
        double realNumber = scanner.nextDouble();
        
        //The integer from the user's input
        System.out.println("Enter an integer: ");
        int exponent = scanner.nextInt();
        
        //Calculate the power
        double answer = Math.pow(realNumber, exponent);
        
        //Obtaining the user-defined decimal places for rounding
        System.out.println("Enter the number of decimal places to round: ");
        int decimalPlaces = scanner.nextInt();
        
        //Formatting the user's desired decimal places in string
        String numberSigns = "";
        for (int i = 0; i < decimalPlaces; i++) {
            numberSigns += "#";
        }
        
        DecimalFormat fmt = new DecimalFormat ("#." + numberSigns);
        
        //Round the answer
        double roundedAnswer = roundAvoid(answer, decimalPlaces);
        
        //Outputting the answer
        System.out.printf("Result: %s\n", fmt.format(roundedAnswer));
    }
        private static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }
}

