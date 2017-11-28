package model.board;

import controller.YahtzeeController;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.enums.Categories;
import model.player.Player;
import view.Maakcontent;

public class MakeNewBoard {

	Maakcontent content = new Maakcontent();

	public MakeNewBoard(){
		
	}
	
	public void makeBoard(Stage primaryStage, String naam,Pane dices) throws Exception {
	
		
		
	Group root = new Group();
    Scene scene = new Scene(root, 1400, 800, Color.BEIGE);

	GridPane gridpane = new GridPane();
	gridpane.setPadding(new Insets(5));
	Text text = new Text();
    gridpane.setHgap(10);
    gridpane.setVgap(10);
	primaryStage.setTitle("Yahtzee");
	Label name = new Label("Yahtzee");
	name = new Label(naam + " is aan de beurt");
	name.setTranslateX(600);
	name.setTranslateY(200);
	gridpane.add(name, 0, 0);
	ComboBox<Categories> categories = new ComboBox<>();
	categories.setItems(FXCollections.observableArrayList(Categories.values()));
	categories.setPromptText("Categories");
	categories.setTranslateX(100);
	categories.setTranslateY(300);
	gridpane.add(categories, 0, 0);
	Button btn = new Button("klik hier");
	btn.setOnMouseClicked(event -> content.RollAllDices());
	
	btn.setTranslateX(250);
	btn.setTranslateY(350);
	gridpane.add(dices, 0, 0);
	root.getChildren().addAll(gridpane,name,btn);
	primaryStage.setScene(scene);
	primaryStage.show();
	
}
}