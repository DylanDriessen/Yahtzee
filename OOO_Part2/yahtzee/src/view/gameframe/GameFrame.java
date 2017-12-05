package view.gameframe;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTable;

import exception.DomainException;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.score.Categories;
import view.board.BoardCreator;
import view.board.MakeContent;
import view.buttons.Buttons;
import view.dice.DiceCreator;



public class GameFrame {
	Buttons buttons = new Buttons();
	
	BoardCreator board = new BoardCreator();
	MakeContent content;
	
	
	public void makeFrameWithRoll(Stage primaryStage, String name){
	
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
			Label nameLabel = buttons.setName(name);
			root.getChildren().addAll(turn,categories,nameLabel,gridpane);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		}
		catch(DomainException e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	
	public void makeFrameWithoutRoll(Stage primaryStage, String naam){
		try{
			Group root = board.newGroup();
			Scene scene = board.newScene(root);
			GridPane gridpane = board.maakGrid();
			content = new MakeContent(); // constructor wordt opgeroepen voor zwarte vierkanten 
			Pane dices = content.maakContent(); // dices worden aagnemaakt
			primaryStage.setTitle("Yahtzee");
			gridpane.add(dices, 0, 0); // hier worden de dices toegevoegd
			Label name = buttons.setName(naam);
			root.getChildren().addAll(name,gridpane);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		}
		catch(DomainException e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	
	public JTable getScoreboard(){
		return null;
	}
	
	public void askPlayers(ArrayList<String> result){
		Stage stage = new Stage();
        Group root = new Group();
        Scene scene = new Scene(root, 220, 220, Color.BEIGE);
        stage.setScene(scene);
        TextField field = new TextField("What's your name");
        Button btn = new Button("Cick here to enter name");
        btn.setTranslateX(55);
        btn.setTranslateY(55);
        btn.setOnMouseClicked(event -> this.getNames(field.getText(), result));
        root.getChildren().addAll(field,btn);
        stage.show();
        
		
		
	}
	
	private void getNames(String name, ArrayList<String> result){
		result.add(name);
		System.out.println(result);
	}
	
	
}