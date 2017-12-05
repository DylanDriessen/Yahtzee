package view.buttons;

import javafx.collections.FXCollections;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import model.score.Categories;;

public class Buttons {

	public Button turn(){
		Button turn = new Button("Next players turn");
		turn.setTranslateX(500);
		turn.setTranslateY(360);
		return turn;
	}
	
	public ComboBox<Categories> categories(){
		ComboBox<Categories> categories = new ComboBox<>();
		categories.setItems(FXCollections.observableArrayList(Categories.values()));
		categories.setPromptText("Categories");
		categories.setTranslateX(290);
		categories.setTranslateY(350);
		return categories;
	}
	
	public Label setName(String naam){
		Label name = new Label(naam + "is aan de beurt");
		name.setTranslateX(600);
		name.setTranslateY(200);
		return name;
	}
	
	public Button next(){
		Button next = new Button("next Player");
		next.setTranslateX(55);
		next.setTranslateY(55);
		return next;
	}
	
}
