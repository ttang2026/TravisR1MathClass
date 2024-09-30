/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.travisr1mathclassp2;
import java.util.Random; //importing Random class

/**
 *
 * @author TTang2026
 */
public class TravisR1MathClassP2 {

    public static void main(String[] args) {
       
        //Generating a random radius between 1.0 and 20.0
        Random random = new Random();
        double radius = 1.0 + (19.0 * random.nextDouble());
        
        //Calculating the circle's area
        double area = Math.PI * radius * radius;
        
        //Calculating the sphere's volume
        double volume = (4.0/3.0) * Math.PI * radius * radius * radius;
        
        //Rounding the answers to three decimal places
        radius = Math.round(radius*1000.0) / 1000.0;
        area = Math.round(area*1000.0) / 1000.0;
        volume = Math.round(volume*1000.0) / 1000.0;
        
        //Printing the results
        System.out.println("Radius: " + radius);
        System.out.println("Area of the Circle: " + area);
        System.out.println("Volume of the Sphere: " + volume);
    }
}
