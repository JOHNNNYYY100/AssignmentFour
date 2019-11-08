package GridPaneButtons;

import javafx.application.Application;
import javafx.event.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ToggleButtonsApp extends Application {
    Button[][] buttons;

    public void start(Stage primaryStage) {
        Pane aPane = new Pane();
        buttons = new Button[4][3];
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 3; col++) {
                buttons[row][col] = new Button();
                buttons[row][col].relocate(10 + col * 70, 10 + row * 70);
                buttons[row][col].setPrefSize(65, 65);
                buttons[row][col].setOnAction(new EventHandler<ActionEvent>() {
                    // This is the single event handler for all of the buttons
                    public void handle(ActionEvent event) {
                        for (int row = 0; row < 4; row++) {
                            for (int col = 0; col < 3; col++) {
                                if (event.getSource() == buttons[row][col]) {
                                    System.out.println("You pressed the button" + " at row: " + row + ", column: " + col + ".");
                                    // Now toggle the button's color
                                    String styleString = buttons[row][col].getStyle();
                                    if (styleString.charAt(14) == '0')
                                        buttons[row][col].setStyle("-fx-base: rgb(255,255,255);");
                                    else buttons[row][col].setStyle("-fx-base: rgb(0,0,0);");
                                }
                            }
                        }
                    }
                });
                // Pick a random color for the button
                if (Math.random() < 0.5) buttons[row][col].setStyle("-fx-base: rgb(0,0,0);");
                else buttons[row][col].setStyle("-fx-base: rgb(255,255,255);");
                aPane.getChildren().add(buttons[row][col]);
            }
        }


        primaryStage.setTitle("Toggle"); //Title
        primaryStage.setScene(new Scene(aPane, 225, 295)); //Se size of Window
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
