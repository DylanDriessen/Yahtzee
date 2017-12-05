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
import view.dice.DiceCreator;

public class MakeContent extends StackPane {
	
	List<Dice> dices;
	List<Label> labels;
	private Pane root2 = new Pane();
	private int x1 = 100;
	private int x2 = 100;
	private int y = 200;
	DiceCreator creator;
	
	public MakeContent(){
		dices = new ArrayList<>();
		labels = new ArrayList<>();
		creator = new DiceCreator(labels, dices, root2);
		
	}

	public Pane maakContent() {	
		
			System.out.println(labels);
			System.out.println(dices);
		
		for(int i = 0; i <= 4; i++){
			
			Dice dice = new Dice();
			dices.add(dice);
			
			dice.setTranslateX(x2);
			dice.setTranslateY(y);
			x2 = x2 + 100; 
			
			root2.getChildren().add(dice);
		}
		
		Button btn = new Button("Roll Dices");
		btn.setOnMouseClicked(event -> creator.AllDices(dices, labels));
		
		btn.setTranslateX(300);
		btn.setTranslateY(300);
		
		root2.getChildren().add(btn);
		
		return root2;
	}
	


	//public void replaceDice(Dice dice, int y){
	//	dice.setTranslateX(100 + y);
	//	dice.setTranslateY(100 );
	//}
	
	// Code voor Dice
	

}
