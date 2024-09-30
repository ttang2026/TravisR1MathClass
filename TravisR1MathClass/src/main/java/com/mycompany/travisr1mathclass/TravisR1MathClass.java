/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.travisr1mathclass;
import java.util.Scanner; //Importing Scanner Class
import java.util.Random; //Importing Random Class

/**
 *
 * @author TTang2026
 */
public class TravisR1MathClass {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        
        int number = random.nextInt(91);
        double radians = Math.toRadians(number);
        System.out.println("Press 'g' to get ga random number from 0-90 to be displayed in sine, cosine, and tangent, or press 'q' to quit");
        
        while (true) {
            String userInput = scan.nextLine().toLowerCase();
            
            if (userInput.equals("g")) {
                
                double sine = Math.sin(radians);
                double cosine = Math.cos(radians);
                double tangent = Math.tan(radians);
                
                System.out.println("Number: " + number);
                System.out.println("Sine: " + roundAvoid(sine, 3));
                System.out.println("Cosine: " + roundAvoid(cosine, 3));
                System.out.println("Tangent: " + roundAvoid(tangent, 3));
                
                break;
                

            } else if (userInput.equals("q")) {
                
                System.out.println("Goodbye!");
                
                break;
            }
        } 
    }
    public static double roundAvoid(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }
}
