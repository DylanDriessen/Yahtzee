

package view;

import java.awt.ScrollPane;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import controller.YahtzeeController;
import javafx.application.Application;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.board.Dice;
import model.factory.DiceFactory;
import model.game.Game;
import model.game.PersonalGame;
import model.player.Player;
import view.AskPlayers;
import view.board.MakeContent;
import view.board.MakeNewBoard;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Speelbord extends Application {
	
	private MakeContent content = new MakeContent();

 
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
			YahtzeeController persons = new YahtzeeController();
			AskPlayers player = new AskPlayers();
			
			String input = "";
			String message = "Druk \n 1 om een naam toe te voegen \n 0 om te stoppen" ;
			String error = "Gelieve 1 of 0 in te voeren \n Druk \n 1 om een naam toe te voegen \n 0 om te stoppen";
			
			input = JOptionPane.showInputDialog(message);
			while (!input.equals("0")){
				if(input.equals("1")){
				String naam = player.askNewPlayer();
				Player speler = new Player(naam);
				PersonalGame ps = new PersonalGame(speler, null);
				persons.voegSpelerToe(ps);
				input = JOptionPane.showInputDialog(message);
				}
				else if(!input.equals("1") || !input.equals("0")){
					input = JOptionPane.showInputDialog(error);
				}
				
					
		}

			
			List<PersonalGame> players = persons.getAll();

				
			for(PersonalGame s: players){
				Stage stage = new Stage();
				MakeNewBoard board = new MakeNewBoard();	
				MakeContent content = new MakeContent();
				board.makeBoard(stage, s.getPlayer().getNaam(),content.maakContent());
				
			}
			
			
			
	}
	
	
}

	

