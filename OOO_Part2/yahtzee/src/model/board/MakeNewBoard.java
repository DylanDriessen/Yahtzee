package model.board;

import javax.swing.JOptionPane;

import controller.YahtzeeController;
import exception.DomainException;
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
import model.board.MakeContent;
import model.board.RollAllDices;

public class MakeNewBoard {

	MakeContent content = new MakeContent();
	RollAllDices rolldices= new RollAllDices();

	public MakeNewBoard(){
		
	}
	
	public void makeBoard(Stage primaryStage, String naam,Pane dices) throws Exception {
	
		
		try{
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
	categories.setTranslateX(290);
	categories.setTranslateY(350);
	gridpane.add(categories, 0, 0);
<<<<<<< HEAD
	Button btn = new Button("Roll Dices");
	btn.setOnMouseClicked(event -> content.RollAllDices());
	btn.setTranslateX(300);
	btn.setTranslateY(300);
	Button turn = new Button("Next players turn");
	turn.setTranslateX(500);
	turn.setTranslateY(360);
=======
	Button btn = new Button("klik hier");
	btn.setOnMouseClicked(event -> rolldices.RollAllDices());
	
	btn.setTranslateX(250);
	btn.setTranslateY(350);
>>>>>>> e10b6f02b1354226ebaefef3d1049bfb861d4d72
	gridpane.add(dices, 0, 0);
	root.getChildren().addAll(gridpane,name,btn,turn);
	primaryStage.setScene(scene);
	primaryStage.show();
		}
		
		catch(DomainException e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	
}
}
