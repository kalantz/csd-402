/* Kypton Lantz
 * 04/06/2025
 * Java for Programmers - Module 4 Assignment
 * This program invokes 4 overloaded methods to return the average of an array of integers, an array of doubles, an array of shorts, and an array of longs.
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AverageMethods {

  // Overloaded method for short[]
  public static short average(short[] array) {
    int sum = 0;
    for (short num : array) {
      sum += num;
    }
    return (short)(sum / array.length);
  }

  // Overloaded method for int[]
  public static int average(int[] array) {
    int sum = 0;
    for (int num : array) {
      sum += num;
    }
    return sum / array.length;
  }

  // Overloaded method for long[]
  public static long average(long[] array) {
    long sum = 0;
    for (long num : array) {
      sum += num;
    }
    return sum / array.length;
  }

  // Overloaded method for double[]
  public static double average(double[] array) {
    double sum = 0.0;
    for (double num : array) {
      sum += num;
    }
    return sum / array.length;
  }

  // Helper method to get a positive integer input from the user
  public static int getPositiveIntInput(Scanner scanner, String prompt) {
    int input;
    do {
      System.out.print(prompt);
      while (!scanner.hasNextInt()) {
        System.out.print("Please enter a valid number: ");
        scanner.next(); // discard invalid input
      }
      input = scanner.nextInt();
      if (input <= 0) {
        System.out.println("Please enter a number greater than 0.");
      }
    } while (input <= 0);
    return input;
  }

  // Helper method to generate a random short array
  public static short[] generateRandomShortArray(int size, Random random) {
    short[] array = new short[size];
    for (int i = 0; i < size; i++) {
      array[i] = (short)(random.nextInt(10001) - 5000); // Random short values -5000 to 5000
    }
    return array;
  }

  // Helper method to generate a random int array
  public static int[] generateRandomIntArray(int size, Random random) {
    int[] array = new int[size];
    for (int i = 0; i < size; i++) {
      array[i] = random.nextInt(200001) - 100000; // Random int values -100000 to 100000
    }
    return array;
  }

  // Helper method to generate a random long array
  public static long[] generateRandomLongArray(int size, Random random) {
    long[] array = new long[size];
    for (int i = 0; i < size; i++) {
      array[i] = (long) (random.nextDouble() * 2_000_000_000L - 1_000_000_000L); // Random long values -1_000_000_000 to 1_000_000_000
    }
    return array;
  }

  // Helper method to generate a random double array
  public static double[] generateRandomDoubleArray(int size, Random random) {
    double[] array = new double[size];
    for (int i = 0; i < size; i++) {
      array[i] = random.nextDouble() * 200.0 - 100.0; // Random double values -100.0 to 100.0
    }
    return array;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    // Get user input for array sizes using the helper method
    int shortSize = getPositiveIntInput(scanner, "Enter the number of elements for the short array: ");
    int intSize = getPositiveIntInput(scanner, "Enter the number of elements for the int array: ");
    int longSize = getPositiveIntInput(scanner, "Enter the number of elements for the long array: ");
    int doubleSize = getPositiveIntInput(scanner, "Enter the number of elements for the double array: ");

    // Generate arrays using the helper methods
    short[] shortArray = generateRandomShortArray(shortSize, random);
    int[] intArray = generateRandomIntArray(intSize, random);
    long[] longArray = generateRandomLongArray(longSize, random);
    double[] doubleArray = generateRandomDoubleArray(doubleSize, random);

    // Display the arrays and their averages
    System.out.println("\nShort Array: " + Arrays.toString(shortArray));
    System.out.println("Average (short): " + average(shortArray));
    System.out.println();

    System.out.println("Integer Array: " + Arrays.toString(intArray));
    System.out.println("Average (int): " + average(intArray));
    System.out.println();

    System.out.println("Long Array: " + Arrays.toString(longArray));
    System.out.println("Average (long): " + average(longArray));
    System.out.println();

    System.out.println("Double Array: " + Arrays.toString(doubleArray));
    System.out.printf("Average (double): %.6f%n", average(doubleArray));

    // Close the scanner
    scanner.close();
  }
}
