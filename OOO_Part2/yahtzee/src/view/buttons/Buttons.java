package view.buttons;

import javafx.collections.FXCollections;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import model.score.Categories;

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
	
	public Label setCurrentName(String naam){
		Label name = new Label("Dit is het speelbord van "+naam + " ");
		name.setTranslateX(50);
		name.setTranslateY(100);
		return name;
	}
	
	public Label setName(String naam){
		Label name = new Label(naam + " is aan de beurt");
		name.setTranslateX(600);
		name.setTranslateY(200);
		return name;
	}
	
	public Button RollButton(){
		Button btn = new Button("Roll Dices");
		btn.setTranslateX(300);
		btn.setTranslateY(300);
		return btn;
	}
	
}
