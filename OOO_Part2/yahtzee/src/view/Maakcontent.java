package view;

import java.util.ArrayList;

import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class Maakcontent {

	private DiceFactory dice = new DiceFactory();
	private DiceFactory dice2 = new DiceFactory();
	private DiceFactory dice3 = new DiceFactory();
	private DiceFactory dice4 = new DiceFactory();
	private DiceFactory dice5 = new DiceFactory();
	
	
	public void RollAllDices(){
		dice.roll();
		dice2.roll();
		dice3.roll();
		dice4.roll();
		dice5.roll();
	}
	
	public Pane maakContent(){
		
		
		Label root = new Label();
		Pane root2 = new Pane();
		DiceFactory dice = new DiceFactory();
		DiceFactory dice2 = new DiceFactory();
		DiceFactory dice3 = new DiceFactory();
		DiceFactory dice4 = new DiceFactory();
		DiceFactory dice5 = new DiceFactory();
		
		dice.setOnMouseClicked(event-> dice.replaceDice(dice,0));
		dice.setTranslateX(100);
		dice.setTranslateY(200);
		
		dice2.setOnMouseClicked(event -> dice2.replaceDice(dice2,100));
		dice2.setTranslateX(200);
		dice2.setTranslateY(200);
		
		dice3.setOnMouseClicked(event -> dice3.replaceDice(dice3,200));
		dice3.setTranslateX(300);
		dice3.setTranslateY(200);
		
		dice4.setOnMouseClicked(event -> dice4.replaceDice(dice4,300));
		dice4.setTranslateX(400);
		dice4.setTranslateY(200);
		
		dice5.setOnMouseClicked(event -> dice5.replaceDice(dice5,400));
		dice5.setTranslateX(500);
		dice5.setTranslateY(200);
		
		root2.getChildren().addAll(dice,dice2,dice3,dice4,dice5);
		
		
		
		
		
		return root2;
	}
}
