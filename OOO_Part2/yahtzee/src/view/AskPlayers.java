package view;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


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

	public String getStringInput(String message){
		message = field.getText();
		return message;
	}	
}

		




	
