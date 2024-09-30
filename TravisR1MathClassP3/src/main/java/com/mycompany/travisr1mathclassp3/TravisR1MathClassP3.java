/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.travisr1mathclassp3;
import java.util.Random; //importing Random class

/**
 *
 * @author TTang2026
 */
public class TravisR1MathClassP3 {

    public static void main(String[] args) {
        
        //Generating a random number between 1000.0 and 100,000,000.0
        Random random = new Random();
        double number = 1000.0 + (random.nextDouble() * (100000000.0 - 1000.0));
        
        //Calculate the square root, natural logarithm, and log10 logarithm
        double squareRoot = Math.sqrt(number);
        double naturalLog = Math.log(number);
        double log10 = Math.log10(number);
        
        //Round the answers to five decimal places
        number = Math.round(number*100000.0) / 100000.0;
        squareRoot = Math.round(squareRoot*100000.0) / 100000.0;
        naturalLog = Math.round(naturalLog*100000.0) / 100000.0;
        log10 = Math.round(log10*100000.0) / 100000.0;
        
        //Printing the answers
        System.out.printf("Number: %.5f\n", number);
        System.out.printf("Square Root: %.5f\n", squareRoot);
        System.out.printf("Natural Logarithm: %.5f\n", naturalLog);
        System.out.printf("Log10: %.5f\n", log10);
    }
}

