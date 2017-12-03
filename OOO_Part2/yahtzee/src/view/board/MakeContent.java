package view.board;

import java.util.ArrayList;
import java.util.List;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import model.board.Dice;
import model.board.RollAllDices;
import model.factory.DiceFactory;

public class MakeContent extends StackPane {
	
	List<Dice> dices = new ArrayList<>();
	List<Label> labels = new ArrayList<>();
	private Pane root2 = new Pane();
	private int x1 = 100;
	private int x2 = 100;
	private int y = 200;
	
	public MakeContent(){
		//Hele constructor mag in SimpleFactory komen
		prepareLabels();
		for(int i = 0; i <= 4; i++){
			//Rectangle rect = new Rectangle(50 , 50);
			labels.get(i).setTranslateX(x1);
			labels.get(i).setTranslateY(y);
			x1 = x1 + 100;
			this.setAlignment(Pos.CENTER);
			root2.getChildren().add(labels.get(i));
			//System.out.println(i + " " + labels.get(i).getText());
		}
	}

	public Pane maakContent() {	

		
		for(int i = 0; i <= 4; i++){
			
			Dice dice = new Dice();
			dices.add(dice);
			
			dice.setTranslateX(x2);
			dice.setTranslateY(y);
			x2 = x2 + 100; 
			
			root2.getChildren().add(dice);
		}
		
		Button btn = new Button("Roll Dices");
		btn.setOnMouseClicked(event -> this.AllDices());
		btn.setTranslateX(300);
		btn.setTranslateY(300);
		
		root2.getChildren().add(btn);
		
		return root2;
	}
	
	
	
	public void prepareLabels() {	
		
		for(int i = 0; i <= 4; i++){
			Label label = new Label();
			label.setTextFill(Color.WHITE);
			label.setStyle("-fx-background-color: black; -fx-padding: 10px 20px 10px 20px;");
			labels.add(label);
		}
	}

//	public void replaceDice(Dice dice, int y){
//		dice.setTranslateX(100 + y);
//		dice.setTranslateY(100 );
//	}
	
	// Code voor Dice
	public void AllDices(){
		for(int i=0;i<dices.size();i++){
			dices.get(i).roll();
			labels.get(i).setText(Integer.toString(dices.get(i).getEyes()));
			//System.out.println(dices.get(i).getEyes());
		}	

	}

}
