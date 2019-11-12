package Assign4;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import static java.lang.Integer.parseInt;


public class BlackJackView extends Pane {
    HandPane dealerPane;
    PlayerPane playerPane;

    Button hitMe, stay, newGame;
    Label message;
    BlackJackModel playerModel=new BlackJackModel();
    BlackJackModel model;

    public static void main(String[] args) {

    }
    public BlackJackView(BlackJackModel model) {

        this.model = model;

        //Objects Player and Dealer
        dealerPane = new HandPane("Dealer Hand");
        dealerPane.relocate(1, 1);

        playerPane = new PlayerPane("Player Hand");
        playerPane.relocate(1, 65);

        //Buttons
       newGame = new Button("New Game");
       newGame.setPrefSize(100, 30);
       newGame.relocate(1, 235);
        newGame.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
            } });


		//Hit Me
		hitMe = new Button("Hit Me");
		hitMe.relocate(100,235);
		hitMe.setPrefSize(100,30);
        hitMe.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
            } });

		//Stay
        stay = new Button("Stay");
        stay.relocate(200,235);
        stay.setPrefSize(100,30);
        stay.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent){

            } });

        //Place Bet
        message = new Label("Place bets!");
        message.relocate(300,235);
        message.setPrefSize(100,30);



        GridPane root = new GridPane();
        getChildren().addAll(root,dealerPane,playerPane,newGame,stay,message,hitMe);


    }

    public Button getHitMe() {
        update();
        return hitMe;
    }

    public Button getNewGame() {
        update();
        return newGame;
    }

    public Button getStay() {
        playerModel.stay();
        return stay;
    }

    public int getBet(){

        return playerPane.getBet();
    }

    /*
     * Write getters for 'newDeal', 'hitMe', and 'stay' button. //Done
     * Write getter for  'betButton' (from the playerPane class).//Done
     * Write getter for  'getBet()'  (from the playerPane class).//Done
     */


    // we update all fields in the view with data from the model
    public void update() {



        //update the player hand (in playerPane object),
        //       the player bet  (in playerPane object),
        //       the player cash (in playerPane object),
        //       the dealer hand (in dealerPane object),
        //       the message label.

        // All of this information is available by calling the appropriate model method.


    }

}
