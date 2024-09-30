/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.travisr1mathclassp4;
import java.util.Random; //Import Random class
import java.util.Scanner; //Import Scanner class
import java.text.DecimalFormat; //Import DecimalFormat class

/**
 *
 * @author TTang2026
 */
public class TravisR1MathClassP4 {

    public static void main(String[] args) {
        
        //Generating a random energy value between 1000.0 and 100,000,000.0 joules
        Random random = new Random();
        double energy = 1000.0 + (random.nextDouble() * (100000000.0 - 1000.0));
        
        //Speed of light in m/s
        double speedOfLight = 299792458;
        
        //Calculate mass in grams (m: kg to g conversion)
        double massInGrams = (energy/ (speedOfLight * speedOfLight)) * 1000;
        
        //Obtaining user-defined decimal places for rounding
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of decimal places to round to: ");
        int decimalPlaces = scanner.nextInt();
        
        //Formatting the user's desired decimal places in string
        String numberSigns = "";
        for (int i = 0; i < decimalPlaces; i++) {
            numberSigns += "#";
        }
        
        DecimalFormat fmt = new DecimalFormat ("#." + numberSigns);
                
        
        //Round the mass value
        double roundedMass = roundAvoid(massInGrams, decimalPlaces);
        
        //Outputting the answers
        System.out.printf("Energy: %s\n", fmt.format(energy));
        System.out.printf("Mass required: %s\n", fmt.format(roundedMass));
    }
    private static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
  }
}

