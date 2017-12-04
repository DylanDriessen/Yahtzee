package view.gameframe;

import javax.swing.JOptionPane;

import exception.DomainException;
import javafx.geometry.Insets;
import javafx.scene.Group;
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
import view.buttons.PlayButton;


public class GameFrame {
	PlayButton buttons = new PlayButton();
	
	public void makeFrameWithRoll(Stage primaryStage, String naam,Pane dices ){
	
		try{
			Group root = new Group();
			Scene scene = new Scene(root,1400,800,Color.BEIGE);
			
			GridPane gridpane = new GridPane();
			gridpane.setPadding(new Insets(5));
		    gridpane.setHgap(10);
		    gridpane.setVgap(10);
			primaryStage.setTitle("Yahtzee");
			Button turn = buttons.turn();
			gridpane.add(dices, 0, 0);
			ComboBox<Categories> categories = buttons.categories();
			Label name = buttons.setName(naam);
			root.getChildren().addAll(turn,categories,name,gridpane);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		}
		catch(DomainException e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	
	
}
