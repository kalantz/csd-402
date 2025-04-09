/* Kypton Lantz
 * 04/09/2025
 * Java for Programmers - Module 6 Assignment
 * This program creates a class titled Fan that simulates a fan with properties such as speed, radius, and color.
 * The program also includes a method to display the fan's properties and a main method to test the Fan class.
 */

public class Fan {
  //Constants
  public static final int STOPPED = 0;
  public static final int SLOW = 1;
  public static final int MEDIUM = 2;
  public static final int FAST = 3;

  //Private fields
  private int speed;
  private boolean on;
  private double radius;
  private String color;

  //No-arg constructor
  public Fan() {
    this.speed = STOPPED;
    this.on = false;
    this.radius = 6;
    this.color = "white";
  }

  //Argument constructor
  public Fan(int speed, boolean on, double radius, String color) {
    this.speed = speed;
    this.on = on;
    this.radius = radius;
    this.color = color;
  }

  //Getters and Setters
  public int getSpeed() {
    return speed;
  }
  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public boolean isOn() {
    return on;
  }
  public void setOn(boolean on) {
    this.on = on;
  }

  public double getRadius() {
    return radius;
  }
  public void setRadius(double radius) {
    this.radius = radius;
  }

  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }

  //Method to display fan properties
  @Override
  public String toString() {
    if (on) {
      return "Fan is on\n" +
             "Speed: " + speed + "\n" +
             "Radius: " + radius + "\n" +
             "Color: " + color;
    } else {
      return "Fan is off\n" +
             "Radius: " + radius + "\n" +
             "Color: " + color;
    }
  }

  //Main method to test the Fan class
  public static void main(String[] args) {
    //Create a Fan object with default properties
    Fan defaultFan = new Fan();

    //Create a Fan object with custom properties
    Fan customFan = new Fan(FAST, true, 10, "blue");

    //Display the properties of both fans
    System.out.println("=== Default Fan ===");
    System.out.println(defaultFan);

    System.out.println("\n=== Custom Fan ===");
    System.out.println(customFan);

    //Demonstrate using setters to change properties of the default fan
    defaultFan.setOn(true);
    defaultFan.setSpeed(MEDIUM);
    defaultFan.setRadius(8);
    defaultFan.setColor("red");

    System.out.println("\n=== Updated Default Fan ===");
    System.out.println(defaultFan);
  }
}
