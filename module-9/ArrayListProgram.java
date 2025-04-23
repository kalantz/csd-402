/* Kypton Lantz
 * 04/23/2025
 * Java for Programmers - Module 9 Assignment (Program 1)
 * This program uses an ArrayList filled with a minimum of 10 Strings and uses a ‘for-each’ loop to print the ArrayList collection. Then asks a user which element they would like to see again. Then, attempts to print the element in a try/catch format which will result in the element being displayed. 
 * If the element value received is invalid, it displays a message that an Exception has been thrown displaying “Out of Bounds”. 
 * This program, includes the use of Autoboxing/Auto-Unboxing, working with a user String input.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProgram {
  public static void main(String[] args) {
    //Create an ArrayList of Strings
    ArrayList<String> items = new ArrayList<String>();
    //Add 10 items to the ArrayList
    items.add("Apple");
    items.add("Banana");
    items.add("Cherry");
    items.add("Date");
    items.add("Elderberry");
    items.add("Fig");
    items.add("Grape");
    items.add("Honeydew");
    items.add("Kiwi");
    items.add("Lemon");

    //Print the ArrayList using a for-each loop
    System.out.println("Here are the items in the list:");
    for (String item : items) {
      System.out.println(item);
    }

    //Ask the user which element they would like to see again
    Scanner scanner = new Scanner(System.in);
    boolean validInput = false; //Flag to track valid input

    while (!validInput) {
      System.out.print("\nEnter the index of the item you would like to see again (0-9): ");
      String input = scanner.nextLine();

      try {
        //Convert the input to an integer (autoboxing)
        int index = Integer.parseInt(input);
        //Attempt to print the item at the specified index
        System.out.println("You selected: " + items.get(index)); //Auto-unboxing
        validInput = true; //Set flag to true if input is valid
      } catch (IndexOutOfBoundsException e) {
        //Handle the case where the index is out of bounds
        System.out.println("Out of Bounds. Please enter a valid index between 0 and 9.");
      } catch (NumberFormatException e) {
        //Handle the case where the input is not a valid integer
        System.out.println("Invalid input. Please enter a number between 0 and 9.");
      } catch (Exception e) {
        //Catch any other exceptions that may occur
        System.out.println("An unexpected error occurred: " + e.getMessage());
      }
    }

    //Close the scanner
    scanner.close();
    System.out.println("Thank you for using the ArrayList program!");
  }
}