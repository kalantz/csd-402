/* Kypton Lantz
 * 04/09/2025
 * Java for Programmers - Module 5 Assignment
 * This program locates the largest and smallest elements in an array of doubles and integers.
 * It also tests the methods in the main method.
 */
import java.util.Random;

public class ArrayElementLocator {
  //Locate largest in a double array
  public static int[] locateLargest(double[][] arrayParam) {
    int[] location = new int[2];
    double max = arrayParam[0][0];

    for (int i = 0; i < arrayParam.length; i++) {
      for (int j = 0; j < arrayParam[i].length; j++) {
        if (arrayParam[i][j] > max) {
          max = arrayParam[i][j];
          location[0] = i;
          location[1] = j;
        }
      }
    }
    return location;
  }

  //Locate largest in an int array
  public static int[] locateLargest(int[][] arrayParam) {
    int[] location = new int[2];
    int max = arrayParam[0][0];

    for (int i = 0; i < arrayParam.length; i++) {
      for (int j = 0; j < arrayParam[i].length; j++) {
        if (arrayParam[i][j] > max) {
          max = arrayParam[i][j];
          location[0] = i;
          location[1] = j;
        }
      }
    }
    return location;
  }

  //Locate smallest in a double array
  public static int[] locateSmallest(double[][] arrayParam) {
    int[] location = new int[2];
    double min = arrayParam[0][0];

    for (int i = 0; i < arrayParam.length; i++) {
      for (int j = 0; j < arrayParam[i].length; j++) {
        if (arrayParam[i][j] < min) {
          min = arrayParam[i][j];
          location[0] = i;
          location[1] = j;
        }
      }
    }
    return location;
  }

  //Locate smallest in an int array
  public static int[] locateSmallest(int[][] arrayParam) {
    int[] location = new int[2];
    int min = arrayParam[0][0];

    for (int i = 0; i < arrayParam.length; i++) {
      for (int j = 0; j < arrayParam[i].length; j++) {
        if (arrayParam[i][j] < min) {
          min = arrayParam[i][j];
          location[0] = i;
          location[1] = j;
        }
      }
    }
    return location;
  }

  //Helper to print the int array
  public static void printIntArray(int[][] array) {
    System.out.println("Int Array:");
    for (int[] row : array) {
      for (int value : row) {
        System.out.printf("%4d", value);
      }
      System.out.println();
    }
  }

  //Helper to print the double array
  public static void printDoubleArray(double[][] array) {
    System.out.println("Double Array:");
    for (double[] row : array) {
      for (double value : row) {
        System.out.printf("%7.2f", value);
      }
      System.out.println();
    }
  }


  //Test the methods in main
  public static void main(String[] args) {
    Random rand = new Random();

    int rows = 3, cols = 4;

    //Generate random int and double arrays
    int[][] intArray = new int[rows][cols];
    double[][] doubleArray = new double[rows][cols];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        intArray[i][j] = rand.nextInt(100); // Random int between 0 and 99
        doubleArray[i][j] = Math.round((rand.nextDouble() * 100) * 100.0) / 100.0; // Random double between 0.0 and 100.00
      }
    }

    //Print the arrays
    printIntArray(intArray);
    printDoubleArray(doubleArray);

    //Find and print info for int array
    int[] largestIntLocation = locateLargest(intArray);
    int[] smallestIntLocation = locateSmallest(intArray);
    int largestInt = intArray[largestIntLocation[0]][largestIntLocation[1]];
    int smallestInt = intArray[smallestIntLocation[0]][smallestIntLocation[1]];

    System.out.println("\nLargest int: " + largestInt + " at location (" + largestIntLocation[0] + ", " + largestIntLocation[1] + ")");
    System.out.println("Smallest int: " + smallestInt + " at location (" + smallestIntLocation[0] + ", " + smallestIntLocation[1] + ")");

    //Find and print info for double array
    int[] largestDoubleLocation = locateLargest(doubleArray);
    int[] smallestDoubleLocation = locateSmallest(doubleArray);
    double largestDouble = doubleArray[largestDoubleLocation[0]][largestDoubleLocation[1]];
    double smallestDouble = doubleArray[smallestDoubleLocation[0]][smallestDoubleLocation[1]];

    System.out.println("\nLargest double: " + largestDouble + " at location (" + largestDoubleLocation[0] + ", " + largestDoubleLocation[1] + ")");
    System.out.println("Smallest double: " + smallestDouble + " at location (" + smallestDoubleLocation[0] + ", " + smallestDoubleLocation[1] + ")");
  }
}
