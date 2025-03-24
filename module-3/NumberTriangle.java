/* Kypton Lantz
 * 03/23/2025
 * Java for Programmers - Module 3 Assignment
 * This program generates the pattern you requested, with nested for loops to output numbers in a triangle format with @ symbols in a vertical line along the right side.
 */

 public class NumberTriangle {
  public static void main(String[] args) {
    int rows = 7; // number of rows in the triangle

    // Outer loop for each row
    for (int i = 0; i < rows; i++) {
      // Print leading spaces to center the numbers
      for (int j = 0; j < rows - i - 1; j++) {
        System.out.print("   "); //3 spaces for consistent alignment
      }

      // Print the increasing numbers
      int number = 1;
      for (int j = 0; j <= i; j++) {
        System.out.printf("%3d", number); //print numbers with a width of 3
        number *= 2;
      }

      // Print the decreasing numbers
      number /= 4; // Adjust to print the correct decreasing numbers
      for (int j = i - 1; j >= 0; j--) {
        System.out.printf("%3d", number); //print numbers with a width of 3
        number /= 2;
      }

      //Calculate and print trailing spaces to align the @ symbol
      int spacesAfterNumbers = (rows - i - 1) * 3; // 3 spaces per number
      for (int j = 0; j < spacesAfterNumbers; j++) {
        System.out.print(" ");
      }

      //Add extra spaces after the numbers to align the @ symbol
      System.out.print("   "); // Add three spaces after the last number

      //Print the @ symbol at the end of the line
      System.out.print("@");

      //Move to the next line
      System.out.println();
    }
  }
}
