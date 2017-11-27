package view;

import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class Maakcontent {

	
	public Pane maakContent(){
		Label root = new Label();
		Pane root2 = new Pane();
		Dice dice = new Dice(); // Dobbelstenen aanmaken
		Dice dice2 = new Dice();
		Dice dice3 = new Dice();
		Dice dice4 = new Dice();
		Dice dice5 = new Dice();
		
		
		
		dice.setTranslateX(100);
		dice.setTranslateY(200);
		
		dice2.setTranslateX(200);
		dice2.setTranslateY(200);
		
		dice3.setTranslateX(300);
		dice3.setTranslateY(200);
		
		dice4.setTranslateX(400);
		dice4.setTranslateY(200);
		
		dice5.setTranslateX(500);
		dice5.setTranslateY(200);
		
		root2.getChildren().addAll(dice,dice2,dice3,dice4,dice5);
		
		
		
		
		
		return root2;
	}
}
