/* Kypton Lantz
 * 04/23/2025
 * Java for Programmers - Module 9 Assignment (Program 2)
 * This program creates a new file titled data.file, if the file does not exist. Then writes to the new file, adding 10 randomly generated numbers, or append 10 randomly generated numbers to a previous file. Each integer is separated by a space. 
 * It then closes the file, reopens the file, reads the data from the file, and displays it.
 */
import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class FileProgram {
  public static void main(String[] args) {
    String fileName = "data.file";
    Random random = new Random();

    try {
      //Create or append to the file
      File file = new File(fileName);
      boolean isNewFile = file.createNewFile(); // Create a new file if it doesn't exist

      //Write or append 10 random integers to the file
      FileWriter writer = new FileWriter(file, true); // true for append mode
      for (int i = 0; i < 10; i++) {
        int randomNumber = random.nextInt(100); // Generate a random number between 0 and 99
        writer.write(randomNumber + " "); // Write the number to the file followed by a space
      }
      writer.close(); // Close the writer

      if (isNewFile) {
        System.out.println("A new file has been created: " + fileName);
      } else {
        System.out.println("Data has been appended to the existing file: " + fileName);
      }

      //Read and display the data from the file
      Scanner reader = new Scanner(file);
      System.out.println("\nContents of the file: ");
      while (reader.hasNextLine()) {
        System.out.println(reader.nextLine()); // Read and print each line from the file
      }
      reader.close(); // Close the reader
    } catch (IOException e) {
      System.out.println("An error occurred while handling the file: " + e.getMessage());
      e.printStackTrace(); // Print the stack trace for debugging
    }
  }
}