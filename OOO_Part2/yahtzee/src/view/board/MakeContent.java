package view.board;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import model.board.Dice;
import view.dice.DiceCreator;

public class MakeContent extends StackPane {
	
	List<Dice> dices;
	List<Label> labels;
	private Pane root2 = new Pane();
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
		
		
		
		return root2;
	}
}
