package view.gameframe;

import javax.swing.JOptionPane;

import exception.DomainException;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.enums.Categories;
import view.board.BoardCreator;
import view.board.MakeContent;
import view.buttons.Buttons;
import view.dice.DiceCreator;



public class GameFrame {
	Buttons buttons = new Buttons();
	
	BoardCreator board = new BoardCreator();
	MakeContent content;
	
	
	public void makeFrameWithRoll(Stage primaryStage, String naam){
	
		try{
			Group root = board.newGroup();
			Scene scene = board.newScene(root);
			GridPane gridpane = board.maakGrid();
			content = new MakeContent(); // constructor wordt opgeroepen voor zwarte vierkanten 
			Pane dices = content.maakContent(); // dices worden aagnemaakt
			primaryStage.setTitle("Yahtzee");
			Button turn = buttons.turn();
			gridpane.add(dices, 0, 0); // hier worden de dices toegevoegd
			ComboBox<Categories> categories = buttons.categories();
			Label name = buttons.setName(naam);
			root.getChildren().addAll(turn,categories,name,gridpane);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		}
		catch(DomainException e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	
	
}
