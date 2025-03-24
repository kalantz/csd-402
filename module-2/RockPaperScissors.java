/* Kypton Lantz
 * 03/23/2025
 * Java for Programmers - Module 2 Assignment
 * This program plays "Rock, Paper, Scissors" with the user.
 */

 import java.util.Scanner;
 import java.util.Random;
 
 public class RockPaperScissors {
 
     // Constants for choices
     static final int ROCK = 1;
     static final int PAPER = 2;
     static final int SCISSORS = 3;
 
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         Random random = new Random();
 
         int userScore = 0;
         int computerScore = 0;
         int tieCount = 0;
         int roundsPlayed = 0;  // Track rounds played
 
         System.out.println("Welcome to Rock-Paper-Scissors!");
 
         boolean playAgain = true;
         while (playAgain) {
             int computerChoice = random.nextInt(3) + 1;
             int userChoice = getUserChoice(scanner);
 
             // Check if user wants to quit
             if (userChoice == 0) {
                 System.out.println("\nThanks for playing!");
                 break;
             }
 
             // Display choices
             System.out.println("\nComputer chose: " + choiceToString(computerChoice));
             System.out.println("You chose: " + choiceToString(userChoice));
 
             // Determine and display result
             int result = determineWinner(userChoice, computerChoice);
 
             if (result == 0) {
                 System.out.println("It's a tie!");
                 tieCount++;
             } else if (result == 1) {
                 System.out.println("You win this round!");
                 userScore++;
             } else {
                 System.out.println("Computer wins this round!");
                 computerScore++;
             }
 
             // Increment rounds played
             roundsPlayed++;
         }
 
         // Final score summary, displayed only once after quitting
         System.out.println("\nFinal Score:");
         System.out.println("You: " + userScore);
         System.out.println("Computer: " + computerScore);
         System.out.println("Ties: " + tieCount);
 
         // Determine the winner of the game
         if (userScore > computerScore) {
             System.out.println("After " + roundsPlayed + " rounds, you have won the game!");
         } else if (computerScore > userScore) {
             System.out.println("After " + roundsPlayed + " rounds, the computer has won the game!");
         } else {
             System.out.println("After " + roundsPlayed + " rounds, the game is a tie!");
         }
 
         scanner.close();
     }
 
     // Helper method to get user's choice with validation
     public static int getUserChoice(Scanner scanner) {
         int userChoice;
         while (true) {
             System.out.println("\nMake your choice: ");
             System.out.println("1. Rock");
             System.out.println("2. Paper");
             System.out.println("3. Scissors");
             System.out.println("0. Quit");
             System.out.print("Your choice: ");
 
             if (scanner.hasNextInt()) {
                 userChoice = scanner.nextInt();
                 if (userChoice >= 0 && userChoice <= 3) {
                     return userChoice;
                 } else {
                     System.out.println("Invalid choice. Please enter a number between 0 and 3.");
                 }
             } else {
                 System.out.println("Invalid input. Please enter a number.");
                 scanner.next(); // Clear invalid input
             }
         }
     }
 
     // Helper method to convert choice to string
     public static String choiceToString(int choice) {
         switch (choice) {
             case ROCK:
                 return "Rock";
             case PAPER:
                 return "Paper";
             case SCISSORS:
                 return "Scissors";
             default:
                 return "Invalid choice";
         }
     }
 
     // Helper method to determine winner
     public static int determineWinner(int userChoice, int computerChoice) {
         if (userChoice == computerChoice) {
             return 0; // Tie
         } else if ((userChoice == ROCK && computerChoice == SCISSORS) ||
                    (userChoice == PAPER && computerChoice == ROCK) ||
                    (userChoice == SCISSORS && computerChoice == PAPER)) {
             return 1; // User wins
         } else {
             return -1; // Computer wins
         }
     }
 } 