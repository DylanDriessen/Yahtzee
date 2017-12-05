package view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
	List<String> result = new ArrayList<>();
	TextField field = new TextField();
	Button next = new Button("next");
	Button play = new Button("Play Game");
	Group root = new Group();
	Scene scene = new Scene(root,220,110, Color.BEIGE);
	GridPane pane = new GridPane();
	
	public List<String> askJavaFxPlayer(Stage stage){
	ArrayList<String> result = new ArrayList<>();
	String naam = null;
		stage.setTitle("Aanmelden");
		pane.setHgap(10);
		pane.setVgap(10);
		next.setTranslateX(110);
		next.setTranslateY(55);
		play.setTranslateX(15);
		play.setTranslateY(55);
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

	public String getStringInput(String message){
		message = field.getText();
		return message;
	}
	
//	public String askNewPlayer(){
//		String naam = null;
//		return naam = JOptionPane.showInputDialog("geef je naam");
//	}
	
}
		
		
//		field.setOnKeyPressed(new EventHandler<KeyEvent>() {
//			
//			@Override
//			public void handle(KeyEvent event) {
//				System.out.println("2");
//				if (event.getCode() == KeyCode.ENTER){
//				
//				String naam = event.getCharacter();
//				System.out.println(naam);
//				result.add(naam);
//				}
//			}
//		});		

//		next.setOnMouseClicked(event -> result.add(field.getText()));
//      play.setOnMouseClicked(event -> cancel(stage));
//		System.out.println(field.getText());
//		result.add("test");
//		System.out.println(result);
		




	
