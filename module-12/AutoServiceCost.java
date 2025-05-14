/* Kypton Lantz
 * 05/14/2025
 * Java for Programmers - Module 12 Assignment
 * This program will calculate the cost of yearly auto service visits with 4 methods, including: standard, +oil change, +tire rotation, and +coupon deduction. 
 */

public class AutoServiceCost {
  //Constants for standard service costs
  private static final double STANDARD_SERVICE_CHARGE = 250.00;
  private static final double OIL_CHANGE_FEE = 40.00;
  private static final double TIRE_ROTATION_FEE = 30.00;

  //Method 1: No parameters
  public static double yearlyService() {
    return STANDARD_SERVICE_CHARGE;
  }

  //Method 2: 1 parameter (oil change fee)
  public static double yearlyService(boolean oilChange) {
    double total = STANDARD_SERVICE_CHARGE;
    if (oilChange) {
      total += OIL_CHANGE_FEE;
    }
    return total;
  }

  //Method 3: 2 parameters (oil change + tire rotation)
  public static double yearlyService(boolean oilChange, boolean tireRotation) {
    double total = STANDARD_SERVICE_CHARGE;
    if (oilChange) {
      total += OIL_CHANGE_FEE;
    }
    if (tireRotation) {
      total += TIRE_ROTATION_FEE;
    }
    return total;
  }

  //Method 4: 3 parameters (oil change + tire rotation - coupon)
  public static double yearlyService(boolean oilChange, boolean tireRotation, double coupon) {
    double total = yearlyService(oilChange, tireRotation);
    return total - coupon;
  }

  //Main method to test all 4 methods
  public static void main(String[] args) {
    System.out.println("===== Testing Overloaded Methods for Yearly Auto Service =====");

    //Test 1: No parameters - Standard service only
    System.out.println("Standard Service Cost: $" + yearlyService());

    //Test 2: 1 parameter - add oil change
    System.out.println("Standard Service + Oil Change: $" + yearlyService(true));
    System.out.println("Standard only (false param): $" + yearlyService(false));

    //Test 3: 2 parameters - oil and/or tire rotation
    System.out.println("Standard + Oil + Tire Rotation: $" + yearlyService(true, true));
    System.out.println("Standard + Tire only: $" + yearlyService(false, true));

    //Test 4: All options - coupon deduction
    System.out.println("Full service with $25 coupon: $" + yearlyService(true, true, 25.00));
    System.out.println("Standard + oil, $10 coupon: $" + yearlyService(true, false, 10.00));
    System.out.println("Standard + tire, $15 coupon: $" + yearlyService(false, true, 15.00));
  }
}