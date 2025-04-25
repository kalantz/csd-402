/* Kypton Lantz
 * 04/25/2025
 * Java for Programmers - Module 10 Assignment
 * The DomesticDivision class includes a field for the state in which the division is located and a constructor that requires all fields when created. 
 */

 class DomesticDivision extends Division {
  //Fields
  private String state;

  //Constructor
  public DomesticDivision(String divisionName, int accountNumber, String state) {
    super(divisionName, accountNumber); // Call the constructor of the superclass
    this.state = state;
  }

  //Implement the display method
  @Override
  public void display() {
    System.out.println("Domestic Division Name: " + super.getDivisionName());
    System.out.println("Account Number: " + super.getAccountNumber());
    System.out.println("State: " + state);
  }
 }