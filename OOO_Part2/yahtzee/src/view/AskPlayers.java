package view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class AskPlayers {
	
	private List<String> result = new ArrayList<>();

	/*public List<String> AddSpeler(Stage stage){
		
		
		Group root = new Group();
		List<String> result = new ArrayList<>();
		
	    Scene scene = new Scene(root, 1400, 800, Color.BEIGE);
	    GridPane gridpane = new GridPane();
		gridpane.setPadding(new Insets(5));
		gridpane.setHgap(10);
		gridpane.setVgap(10);
		stage.setTitle("Yahtzee");
		Text text = new Text("What's your name");
		TextField nameField = new TextField();
		Button btn = new Button("Ok");		
		String naam = nameField.getText();
		result.add(naam);
		Button btn = new Button("Ok");
		btn.setOnMouseClicked(event -> result.add(naam));
		Button btnCancel = new Button("Stop");
		btnCancel.setOnMouseClicked(event -> Cancel());
		
		root.getChildren().addAll(text,btn,nameField);
		stage.show();
		
		return result;
	}
	
	*/
	

	
	private void Cancel() {
		System.exit(0);
	}





	




	public String askNewPlayer(){
		String naam = null;
		return naam = JOptionPane.showInputDialog("geef je naam");
	}
	
}


	
