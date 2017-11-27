package view;

import controller.SpelController;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.Speler;

public class MakeNewBoard {
	
	
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
	Label label = new Label("Yahtzee");
	Label name = new Label(naam + " is aan de beurt");
	gridpane.add(scene, 0, 0);
	name.setTranslateX(600);
	name.setTranslateY(200);
	gridpane.add(name, 0, 0);
	root.getChildren().addAll(gridpane,name);
	primaryStage.setScene(scene2);
	primaryStage.show();
	
}
}
