/* Kypton Lantz
 * 04/25/2025
 * Java for Programmers - Module 10 Assignment
 * This program creates an abstract Division class with fields for a company's division name and account number, and an abstract display () method that will be defined in the subclasses.
 * A constructor in the superclass requires values for both fields.
 */

abstract class Division {
  // Fields
  private String divisionName;
  private int accountNumber;

  // Constructor
  public Division(String divisionName, int accountNumber) {
    this.divisionName = divisionName;
    this.accountNumber = accountNumber;
  }

  // Getter for divisionName
  public String getDivisionName() {
    return divisionName;
  }

  // Getter for accountNumber
  public int getAccountNumber() {
    return accountNumber;
  }

  // Abstract method to be implemented in subclasses
  public abstract void display();
}