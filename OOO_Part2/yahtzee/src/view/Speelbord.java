

package view;


import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import controller.YahtzeeController;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.game.PersonalGame;
import model.player.Player;
import view.AskPlayers;
import view.board.MakeContent;
import view.dice.DiceCreator;
import view.gameframe.GameFrame;


public class Speelbord extends Application {
	
	

 
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
				PersonalGame ps = new PersonalGame(speler, null, 0);
				persons.voegSpelerToe(ps);
				input = JOptionPane.showInputDialog(message);
				}
				else if(!input.equals("1") || !input.equals("0")){
					input = JOptionPane.showInputDialog(error);
				}
				
					
		}

			
			
		
			
			
			
			
			
			
			
			List<PersonalGame> players = persons.getAll();

			for (int i = players.size()-1; i >= 0;i--){	
				PersonalGame s = players.get(i);
				Stage stage = new Stage();
				GameFrame frame = new GameFrame();
				frame.makeFrameWithRoll(primaryStage, s.getPlayer().getNaam());
				
				
			}
			
			
			
	}
	
	
}

	

