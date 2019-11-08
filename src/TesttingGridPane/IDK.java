package TesttingGridPane;

import javafx.application.Application;
import javafx.event.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


import java.awt.*;

public class IDK extends Application {
    Button[][] buttons;


    public void start(Stage primaryStage) {
            Pane aPane = new Pane();
            buttons = new Button[10][10];
            for (int row = 0; row < 10; row++) {
                for (int col = 0; col < 10; col++) {
                    buttons[row][col] = new Button();
                    buttons[row][col].relocate(10 + col * 50, 10 + row * 50);
                    buttons[row][col].setPrefSize(65, 65);
                    buttons[row][col].setStyle("-fx-base: rgb(255,255,255);");
                    aPane.getChildren().add(buttons[row][col]);
                }

            }
            primaryStage.setTitle("Testing");
            primaryStage.setScene(new Scene(aPane,600,600));
            primaryStage.show();
        }

    public static void main(String[] args) {
        launch(args);

    }

}



