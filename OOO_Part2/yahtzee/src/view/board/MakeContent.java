package view.board;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import model.board.Dice;
import model.factory.DiceFactory;

public class MakeContent {
	
	

public Pane maakContent(){
		
		
		Label root = new Label();
		Pane root2 = new Pane();
		Dice dice = new Dice();
		Dice dice2 = new Dice();
		Dice dice3 = new Dice();
		Dice dice4 = new Dice();
		Dice dice5 = new Dice();
		
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

public void replaceDice(Dice dice, int y){
	dice.setTranslateX(100 + y);
	dice.setTranslateY(100 );
	
}

}
