/* Kypton Lantz
 * 04/13/2025
 * Java for Programmers - Module 7 Assignment
 * This program includes an UpdatedFan class and a UseFans class to simulate fan objects
 * and manage a collection of fans, displaying their properties without using toString().
 */
import java.util.ArrayList;

public class UpdatedFan {
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
  public UpdatedFan() {
    this.speed = STOPPED;
    this.on = false;
    this.radius = 6;
    this.color = "white";
  }

  //Argument constructor
  public UpdatedFan(int speed, boolean on, double radius, String color) {
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

  //Override toString() method
  @Override
  public String toString() {
    if (this.on) {
      return "Fan is ON\n" +
             "Speed: " + this.speed + "\n" +
             "Radius: " + this.radius + "\n" +
             "Color: " + this.color;
    } else {
      return "Fan is OFF\n" +
             "Radius: " + this.radius + "\n" +
             "Color: " + this.color;
    }
  }

  //Main method
  public static void main(String[] args) {
    UpdatedFan defaultFan = new UpdatedFan();
    UpdatedFan customFan = new UpdatedFan(FAST, true, 10, "blue");

    System.out.println("=== Default Fan ===");
    System.out.println(defaultFan);

    System.out.println("\n=== Custom Fan ===");
    System.out.println(customFan);

    defaultFan.setOn(true);
    defaultFan.setSpeed(MEDIUM);
    defaultFan.setRadius(8);
    defaultFan.setColor("red");

    System.out.println("\n=== Updated Default Fan ===");
    System.out.println(defaultFan);

    // Now call UseFans functionality
    UseFans.testUseFans();
  }

  // Static nested class
  public static class UseFans {
    public static void displayFan(UpdatedFan fan) {
      if (fan.isOn()) {
        System.out.println("Fan is on");
        System.out.println("Speed: " + fan.getSpeed());
      } else {
        System.out.println("Fan is off");
      }
      System.out.println("Radius: " + fan.getRadius());
      System.out.println("Color: " + fan.getColor());
    }

    public static void displayFanCollection(ArrayList<UpdatedFan> fans) {
      for (int i = 0; i < fans.size(); i++) {
        System.out.println("\n=== Fan #" + (i + 1) + " ===");
        displayFan(fans.get(i));
      }
    }

    public static void testUseFans() {
      ArrayList<UpdatedFan> fanList = new ArrayList<>();

      fanList.add(new UpdatedFan());
      fanList.add(new UpdatedFan(SLOW, true, 7.5, "green"));
      fanList.add(new UpdatedFan(MEDIUM, true, 9, "black"));
      fanList.add(new UpdatedFan(FAST, false, 6.5, "yellow"));

      fanList.get(0).setOn(true);
      fanList.get(0).setSpeed(FAST);
      fanList.get(0).setColor("purple");

      System.out.println("\n=== Displaying Fan Collection ===");
      displayFanCollection(fanList);
    }
  }
}
