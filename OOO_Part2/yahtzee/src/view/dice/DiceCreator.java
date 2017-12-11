package view.dice;

import java.util.List;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import model.board.Dice;

public class DiceCreator extends StackPane {
	
	
	private int x1 = 100;
	private int y = 200;

	
	// maakt de diceVorm aan
	public DiceCreator(List<Label> result, List<Dice> dices, Pane root2){
		
		this.prepareLabels(result);
		for(int i = 0; i <= 4; i++){
			//Rectangle rect = new Rectangle(50 , 50);
			result.get(i).setTranslateX(x1);
			result.get(i).setTranslateY(y);
			x1 = x1 + 100;
			this.setAlignment(Pos.CENTER);
			root2.getChildren().add(result.get(i));
			System.out.println(result.size());
			//System.out.println(i + " " + labels.get(i).getText());
		}
	}


	public void prepareLabels(List<Label> result) {	
		
		for(int i = 0; i <= 4; i++){
			
			Label label = new Label();
			label.setTextFill(Color.WHITE);
			label.setStyle("-fx-background-color: black; -fx-padding: 10px 20px 10px 20px;");
			result.add(label);
			System.out.println(result.size());
		}
	}

	public void AllDices(List<Dice> result, List<Label> labels){
	
			for(int i=0;i<result.size();i++){
					result.get(i).roll();
					labels.get(i).setText(Integer.toString(result.get(i).getEyes()));
		//System.out.println(dices.get(i).getEyes());
	}	
}
}
