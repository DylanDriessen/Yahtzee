package view;

import controller.SpelController;
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
import javafx.stage.Stage;
import model.Speler;
import model.enums.Categories;

public class MakeNewBoard {
	
<<<<<<< HEAD
	Maakcontent content = new Maakcontent();
	private Label label;
	private Label name;
	private ComboBox<Categories> categories;
	private GridPane gridpane;
=======

	Maakcontent content = new Maakcontent();

	
	
	
>>>>>>> 37d21588b74125aa0d9e67efa86117b370d1e136
	
	public MakeNewBoard(){
		
	}
	
	public void makeBoard(Stage primaryStage, String naam,Pane scene) throws Exception {
	
		
		
	Group root = new Group();
    Scene scene2 = new Scene(root, 1400, 800, Color.BEIGE);

	GridPane gridpane = new GridPane();
	gridpane.setPadding(new Insets(5));
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
<<<<<<< HEAD
=======

>>>>>>> 37d21588b74125aa0d9e67efa86117b370d1e136
	Button btn = new Button("klik hier");
	btn.setOnMouseClicked(event -> content.RollAllDices());
	btn.setTranslateX(250);
	btn.setTranslateY(350);
<<<<<<< HEAD
	root.getChildren().addAll(gridpane,name,btn);
	gridpane.add(scene, 0, 0);
	root.getChildren().addAll(gridpane,name);
=======
	

	gridpane.add(scene, 0, 0);
	root.getChildren().addAll(gridpane,name,btn);
>>>>>>> 37d21588b74125aa0d9e67efa86117b370d1e136
	primaryStage.setScene(scene2);
	primaryStage.show();
	
}
}
