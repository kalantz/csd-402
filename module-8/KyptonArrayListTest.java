/* Kypton Lantz
 * 04/23/2025
 * Java for Programmers - Module 8 Assignment
 * This program accepts integers from the user until 0 is entered.
 * It stores the integers in an ArrayList and then finds the maximum value in the list.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class KyptonArrayListTest {

  //Method to find the max value in the ArrayList
  public static Integer max(ArrayList<Integer> list) {
    if (list == null || list.isEmpty()) {
      return 0;
    }

    Integer maxValue = list.get(0);
    for (Integer num : list) {
      if (num > maxValue) {
        maxValue = num;
      }
    }

    return maxValue;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<>();

    System.out.println("Enter integers (enter 0 to stop and include 0 in the list): ");

    while (true) {
      try {
        int input = Integer.parseInt(scanner.nextLine());
        numbers.add(input);
        if (input == 0) {
          break; // Stop input when 0 is entered
        }
      } catch (NumberFormatException e) {
        System.out.println("Invalid input. Please enter an integer.");
      }
    }

    scanner.close();

    //Call the max method and print the result
    Integer maxValue = max(numbers);
    System.out.println("The largest value in the list is: " + maxValue);

    //Optional test: Uncomment to test with a manually created list
    // ArrayList<Integer> testList = new ArrayList<>();
    // testList.add(5);
    // testList.add(12);
    // testList.add(7);
    // testList.add(0);
    // System.out.println("Test max value: " + max(testList)); // Should print 12
  }
}
