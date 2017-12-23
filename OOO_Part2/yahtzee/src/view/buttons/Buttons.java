package view.buttons;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import model.score.Categories;

public class Buttons {

	public Button turn(){
		Button turn = new Button("Next players turn");
		turn.setPrefSize(150, 36);
		return turn;
	}
	
	public ComboBox<Categories> categories(ArrayList<Categories> arrayList){
		ComboBox<Categories> categories = new ComboBox<>();
		categories.setItems(FXCollections.observableArrayList(arrayList));
		categories.setPromptText("Categories");
		categories.setPrefSize(120, 36);
		return categories;
	}
	
	public Label setName(String naam){
		Label name = new Label("THIS IS THE BOARD OF: "+naam);
		name.setPrefSize(500, 36);
		name.setStyle("-fx-text-fill: black; -fx-font-size: 17; -fx-font-weight: bold;");
		name.setPadding(new Insets(0,0,0,5));
		return name;
	}
	
	public Label setCurrentName(String naam){
		Label name = new Label("current player: "+ naam);
		name.setPrefSize(400, 36);
		name.setPrefSize(400, 36);
		name.setStyle("-fx-text-fill: black; -fx-font-size: 17; -fx-font-weight: 600;");
		name.setPrefSize(400, 36);
		name.setPadding(new Insets(0,0,0,5));
		return name;
	}
	
	public Button RollButton(){
		Button btn = new Button("Roll Dices");
		btn.setPrefSize(100, 36);
		return btn;
	}
	
	public Button endGame(){
		Button btn = new Button("End Game");
		btn.setPrefSize(100, 36);
		return btn;
	}
	
}
