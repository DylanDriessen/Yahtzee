

package view;

import java.awt.ScrollPane;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import controller.SpelController;
import javafx.application.Application;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.Dobbelsteen;
import model.Spel;
import model.Speler;
import view.AskPlayers;
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
	
	private SimpleIntegerProperty property = new SimpleIntegerProperty();
	private Dobbelsteen dobbel = new Dobbelsteen();
	private Maakcontent content = new Maakcontent();
	private ArrayList<Dice> dices = new ArrayList<>();
	
 
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
			int counter;
			
			SpelController persons = new SpelController();
			AskPlayers player = new AskPlayers();
			
			
			String input = "";
			String message = "Druk \n 1 om een naam toe te voegen \n 0 om te stoppen" ;
			String error = "Gelieve 1 of 0 in te voeren \n Druk \n 1 om een naam toe te voegen \n 0 om te stoppen";
			
			input = JOptionPane.showInputDialog(message);
			while (!input.equals("0")){
				if(input.equals("1")){
				String naam = player.askNewPlayer();
				Speler speler = new Speler(naam);
				persons.voegSpelerToe(speler);
				input = JOptionPane.showInputDialog(message);
				}
				else if(!input.equals("1") || !input.equals("0")){
					input = JOptionPane.showInputDialog(error);
				}
				
					
		}
			List<Speler> spelers = persons.getAll();
			
			
			for(Speler s: spelers){
				Stage stage = new Stage();

				MakeNewBoard board = new MakeNewBoard();
				System.out.println(s.getNaam());
				board.makeBoard(stage, s.getNaam(),content.maakContent());
				
			}
			
	}
	
	
}

	

