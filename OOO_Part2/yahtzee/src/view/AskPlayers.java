package view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.player.Player;


public class AskPlayers {
	ArrayList<String> result = new ArrayList<>();
	String naam = null;
	
	public ArrayList<String> askJavaFxPlayer(Stage stage){
		ArrayList<String> result = new ArrayList<>();
		stage.setTitle("Aanmelden");
		Group root = new Group();
		Scene scene = new Scene(root,220,110, Color.BEIGE);
		GridPane pane = new GridPane();
		pane.setHgap(10);
		pane.setVgap(10);
		TextField field = new TextField();
		Button next = new Button("next");
		next.setTranslateX(110);
		next.setTranslateY(55);
		next.setOnMouseClicked(event -> result.add(field.getText()));
		Button play = new Button("Play Game");
		play.setOnMouseClicked(event -> cancel(stage));
		play.setTranslateX(15);
		play.setTranslateY(55);
		
		
		field.setOnKeyPressed(new EventHandler<KeyEvent>() {
			
			@Override
			public void handle(KeyEvent event) {
				System.out.println("2");
				if (event.getCode() == KeyCode.ENTER){
				
				String naam = event.getCharacter();
				System.out.println(naam);
				result.add(naam);
				}
			}
		});
		
		
		root.getChildren().addAll(pane,field,next,play);
		stage.setScene(scene);
		stage.show();
		System.out.println(result);
		return result;
	}
	
	
	
	/*public Player askPlayer(){
		Stage stage = new Stage();
		Group root = new Group();
		Scene scene = new Scene(root, 220, 220, Color.BEIGE);
		stage.setScene(scene);
		TextField field = new TextField("What's your name");
		Button btn = new Button("Cick here to enter name");
		btn.setOnMouseClicked(event -> naam = field.getText());
		
		Player player = new Player(naam);
		root.getChildren().addAll(field);
		stage.show();
		return player;
	}*/
	

	private void cancel(Stage stage){
		stage.close();
	}

	
	



	public String askNewPlayer(){
		String naam = null;
		return naam = JOptionPane.showInputDialog("geef je naam");
	}
	
}


	
