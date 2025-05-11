/* Kypton Lantz
 * 05/10/2025
 * Java for Programmers - Module 11 Assignment
 * This program is a JavaFX application that demonstrates the use of HBox and VBox layouts.
 * HBox arranges nodes horizontally, while VBox arranges them vertically.
 */


 import javafx.application.Application;
 import javafx.geometry.Insets;
 import javafx.geometry.Pos;
 import javafx.scene.Scene;
 import javafx.scene.control.Button;
 import javafx.scene.control.Label;
 import javafx.scene.layout.HBox;
 import javafx.scene.layout.VBox;
 import javafx.stage.Stage;
 
 public class HboxVboxExample extends Application {
 
     @Override
     public void start(Stage primaryStage) {
         // --- HBox Example ---
         // Create buttons to place in the HBox
         Button hButton1 = new Button("HBox Button 1");
         Button hButton2 = new Button("HBox Button 2");
 
         // Create an HBox with spacing of 10 pixels
         HBox hbox = new HBox(10);
         hbox.setPadding(new Insets(15)); // Add padding around the HBox
         hbox.setAlignment(Pos.CENTER);  // Center the children in the HBox
         hbox.setStyle("-fx-border-color: blue; -fx-border-width: 2; -fx-padding: 10;"); // Add blue border to HBox
         hbox.getChildren().addAll(hButton1, hButton2); // Add buttons to the HBox
 
         // --- VBox Example ---
         // Create labels to place in the VBox
         Label vLabel1 = new Label("VBox Label 1");
         Label vLabel2 = new Label("VBox Label 2");
 
         // Create a VBox with spacing of 10 pixels
         VBox vbox = new VBox(10);
         vbox.setPadding(new Insets(15)); // Add padding around the VBox
         vbox.setAlignment(Pos.CENTER_LEFT); // Align children to the center-left
         vbox.setStyle("-fx-border-color: purple; -fx-border-width: 2; -fx-padding: 10;"); // Add red border to VBox
         vbox.getChildren().addAll(vLabel1, vLabel2, hbox); // Add labels and the HBox to VBox
 
         // Create the scene and set it on the stage
         Scene scene = new Scene(vbox, 400, 200);
         primaryStage.setTitle("JavaFX HBox and VBox Example");
         primaryStage.setScene(scene);
         primaryStage.show();
     }
 
     public static void main(String[] args) {
         launch(args);
     }
 } 
 