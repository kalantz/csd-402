/* Kypton Lantz
 * 04/25/2025
 * Java for Programmers - Module 10 Assignment
 * The InternationalDivision class includes a field for the country in which the division is located, a field for the language spoken, and a constructor that requires all fields when created.
 */

 class InternationalDivision extends Division {
   // Fields
   private String country;
   private String language;
 
   // Constructor
   public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
     super(divisionName, accountNumber); // Call the constructor of the superclass
     this.country = country;
     this.language = language;
   }
 
   // Implement the display method
   @Override
   public void display() {
     System.out.println("International Division Name: " + super.getDivisionName());
     System.out.println("Account Number: " + super.getAccountNumber());
     System.out.println("Country: " + country);
     System.out.println("Language: " + language);
   }
 }