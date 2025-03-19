/*Kypton Lantz
 * 03/19/2025
 * Java for Programmers -Module 1 Assignment 1
 * This program will calculate the energy needed to heat water from an initial temperature to a final temperature.
 */

import java.util.Scanner;

public class WaterHeatingCalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double waterAmount = 0;
    double initialTemperature = 0;
    double finalTemperature = 0;

    //Get water amount with validation
    while (true) {
      System.out.print("Enter the amount of water (in kilograms):");
      if (input.hasNextDouble()) {
        waterAmount = input.nextDouble();
        if (waterAmount > 0) {
          break;
        } else {
          System.out.println("Please enter a positive number.");
        }
      } else {
        System.out.println("Please enter a valid number.");
        input.next(); //clear invalid input
      }
    }

    //Get initial temperature with validation
    while (true) {
      System.out.print("Enter the initial temperature (in Celsius): ");
      if (input.hasNextDouble()) {
        initialTemperature = input.nextDouble();
        break;
      } else {
        System.out.println("Invalid input. Please enter a number.");
        input.next(); //clear invalid input
      }
    }

    //Get final temperature with validation
    while (true) {
      System.out.print("Enter the final temperature (in Celsius): ");
      if (input.hasNextDouble()) {
        finalTemperature = input.nextDouble();
        break;
      } else{
        System.out.println("Invalid input. Please enter a number.");
        input.next(); //clear invalid input
      }
    }

    // Calculate the energy needed to heat the water
    double energy = waterAmount * (finalTemperature - initialTemperature) * 4184;

    // Display the result
    System.out.println("The energy needed to heat the water from " + initialTemperature + " to " + finalTemperature + " is " + energy + " joules.");

    input.close();
  }
}
