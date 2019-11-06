package assign3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;

import javax.xml.soap.Text;


    /*
     These are the 'model' elements.
     */
    public class BlackJackApplication extends Application{
        Hand dealerHand, playerHand;
        Deck deck;


    @Override
    public void start(Stage primaryStage) throws Exception {
        Hand H1=new Hand();
        primaryStage.setTitle("BlackJack!");
         HandPane aPane=new HandPane("Player 1");

            //Player Hand

            Label PB1 =new Label(aPane.getName()+" Hand");

            PB1.relocate(1,60);
            PB1.setPrefSize(100,30);
            PB1.setStyle("-fx-font: 11 Impact; -fx-base: rgb(170,0,0); -fx-text-fill: rgb(0 ,204,0);");
            PB1.setAlignment(Pos.CENTER);




            Label PB2=new Label("Total");
            PB2.relocate(1,90);
            PB2.setPrefSize(100,30);
            PB2.setFont(Font.font("Impact",11));
            PB2.setStyle("-fx-font: 11 Impact; -fx-base: rgb(170,0,0); -fx-text-fill: rgb(0 ,204,0);");
            PB2.setAlignment(Pos.CENTER);




            TextField PT1=new TextField("Player Card");
            PT1.relocate(100,60);
            PT1.setPrefSize(200,30);
            PT1.setStyle("-fx-font: 13 impact; -fx-base: rgb(0,204,0); -fx-text-fill: rgb(170,0,0);");



            TextField PT2=new TextField("Player's Total");
            PT2.relocate(100,90);
            PT2.setPrefSize(200,30);
            PT2.setStyle("-fx-font: 13 impact; -fx-base: rgb(0,204,0); -fx-text-fill: rgb(170,0,0);");

        //Current Bet

        Label L1=new Label("Current Bet");
        L1.relocate(1,120);
        L1.setPrefSize(100,30);
        L1.setStyle("-fx-font: 11 Impact; -fx-base: rgb(170,0,0); -fx-text-fill: rgb(0 ,204,0);");
        L1.setAlignment(Pos.CENTER);

        TextField TL1 =new TextField("Current Bet");
        TL1.relocate(100,120);
        TL1.setPrefSize(200,30);
        TL1.setStyle("-fx-font: 13 impact; -fx-base: rgb(0,204,0); -fx-text-fill: rgb(170,0,0);");

        //Place Bet
        Button PBP1= new Button("Place bet");//PBP= "Place Player Bet"
        PBP1.relocate(1,150);
        PBP1.setPrefSize(100,30);
        PBP1.setStyle("-fx-font: 11 Impact; -fx-base: rgb(255,0,127); -fx-text-fill: rgb(0,0,0);"); // I made te base yellow to bring attention to the betting


        primaryStage.setTitle("Black Jack");
        aPane.getChildren().addAll(PB1,PB2,PT1,PT2); //Player variables
        aPane.getChildren().addAll(L1,TL1); //Current Bet
            primaryStage.setScene(new Scene(aPane,300,210)); //Dimension of window
            aPane.setStyle("-fx-background-Color: Black");//Background Color
            primaryStage.show(); //To view





        //TODO: You should have two types of Panes that you have made, one
        //TODO: for the dealer and one for the player. You want it to display their
        //TODO: respective hands


        //TODO: Make a dealCard button that, when clicked, deals one card to the dealer and
        //TODO: one to the player. Don't forget to update the view.


        //TODO: Make a newGame Button that, when clicked, resets the player and
        //TODO: dealer hands to empty hands and updates the view.


        //FlowPane aPane = new FlowPane();
        //TODO: add elements to the FlowPane in the order you wish them to appear
        //TODO: feel free to use a different layout if you wish.


//        primaryStage.setScene(new Scene(aPane, 400, 400));
//        primaryStage.show();

    }

    public void update() {
        //TODO: update the GUI. Presumably the dealer's and player's hands have
        //TODO: changed since this was last called.

    }

    public static void main(String[] args) {
        launch(args);
    }
    }

