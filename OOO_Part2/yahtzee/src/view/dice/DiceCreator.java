package view.dice;

import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

public class DiceCreator extends StackPane {
	
	
	private int x1 = 100;
	private int x2 = 100;
	private int y = 200;
	private Pane root = new Pane();

	
	// maakt de diceVorm aan
	public DiceCreator(List<Label> result, Pane root2){
		
		
		System.out.println(result);
		this.prepareLabels(result);
		for(int i = 0; i <= 4; i++){
			result.get(i).setTranslateX(x1);
			result.get(i).setTranslateY(y);
			x1 = x1 + 100;
			this.setAlignment(Pos.CENTER);
			root2.getChildren().add(result.get(i));
			System.out.println(result.size());
			this.root = root2;
		}
	}

	

	public void prepareLabels(List<Label> result) {	
		
//		for(int i = 0; i <= 4; i++){
//
//			Label label = new Label();
//			label.setTextFill(Color.WHITE);
//			label.setStyle("-fx-background-color: black; -fx-padding: 10px 20px 10px 20px;");
//			result.add(label);
//			System.out.println(result.size());
//		}
		
		int i = 0;
		for (Label label : result){
			label.setTextFill(Color.WHITE);
			label.setStyle("-fx-background-color: black; -fx-padding: 10px 20px 10px 20px;");
			System.out.println("In the method");
			i++;
		}
	}

	public Pane returnRoot(){
		return root;
	}
	
	
//	public void rollAllDices(List<Dice> result, List<Label> labels){
//	
//			for(int i=0;i<result.size();i++){
//					result.get(i).roll();
//					labels.get(i).setText(Integer.toString(result.get(i).getEyes()));
//		//System.out.println(dices.get(i).getEyes());
//	}	
}

