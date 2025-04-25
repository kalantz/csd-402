/* Kypton Lantz
 * 04/25/2025
 * Java for Programmers - Module 10 Assignment
 * This program creates two instances of each of these concrete classes.* (4 total instances: 2 InternationalDivision and 2 DomesticDivision).
 */

 public class UseDivision {
  public static void main(String[] args) {
    //Create instances of InternationalDivision
    InternationalDivision internationalDivision1 = new InternationalDivision("European Operations", 101, "Germany", "German");
    InternationalDivision internationalDivision2 = new InternationalDivision("Asian Operations", 102, "Japan", "Japanese");

    //Create instances of DomesticDivision
    DomesticDivision domesticDivision1 = new DomesticDivision("West Coast Operations", 201, "California");
    DomesticDivision domesticDivision2 = new DomesticDivision("East Coast Operations", 202, "New York");

    //Display the details of all divisions
    System.out.println("International Divisions:");
    internationalDivision1.display();
    System.out.println();
    internationalDivision2.display();
    System.out.println();

    System.out.println("Domestic Divisions:");
    domesticDivision1.display();
    System.out.println();
    domesticDivision2.display();
  }
 }