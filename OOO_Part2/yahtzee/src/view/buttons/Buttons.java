package view.buttons;

import javafx.collections.FXCollections;
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
	
	public ComboBox<Categories> categories(){
		ComboBox<Categories> categories = new ComboBox<>();
		categories.setItems(FXCollections.observableArrayList(Categories.values()));
		categories.setPromptText("Categories");
		categories.setPrefSize(120, 36);
		return categories;
	}
	
	public Label setCurrentName(String naam){
		Label name = new Label("Dit is het speelbord van "+naam + " ");
		name.setPrefSize(400, 36);;
		return name;
	}
	
	public Label setName(String naam){
		Label name = new Label(naam + " is aan de beurt");
		name.setPrefSize(400, 36);
		return name;
	}
	
	public Button RollButton(){
		Button btn = new Button("Roll Dices");
		btn.setPrefSize(100, 36);
		return btn;
	}
	
}
