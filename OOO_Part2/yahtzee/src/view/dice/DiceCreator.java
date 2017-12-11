package view.dice;

import java.util.ArrayList;
import java.util.List;

import controller.SubjectInterface;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import view.board.ObserverInterface;

public class DiceCreator extends StackPane  {
	
	
	private int x1 = 100;
	private int x2 = 100;
	private int y = 200;
	private Pane root = new Pane();
	List<Label> labels = new ArrayList<Label>();
	private SubjectInterface controller;
	
	
	
	
	// maakt de diceVorm aan
	public DiceCreator(Pane root2, List<Label> labels){
		System.out.println(labels);
		this.prepareLabels(labels);
		for(int i = 0; i <= 4; i++){
			labels.get(i).setTranslateX(x1);
			labels.get(i).setTranslateY(y);
			x1 = x1 + 100;
			this.setAlignment(Pos.CENTER);
			root2.getChildren().add(labels.get(i));
			System.out.println(labels.size());
			this.root = root2;
		}
	}

	public Boolean RemoveDice(){
		boolean up = true;
		y = y + 200;
		return up;
		
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

