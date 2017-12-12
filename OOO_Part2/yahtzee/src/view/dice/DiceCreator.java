package view.dice;

import java.util.ArrayList;
import java.util.List;

import controller.SubjectInterface;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import view.board.ObserverInterface;

public class DiceCreator extends StackPane  {
	
	
	private int x1 = 100;
	private int x2 = 100;
	private int y = 200;
	private Pane root = new Pane();

	List<Label> labels = new ArrayList<>();
	ArrayList<Integer> result;
	
	
	
	
	
	public DiceCreator(){
		
}
	
	
	public Rectangle createBackDice(int x1 , int y){
		Rectangle rect = new Rectangle(50,50,Color.BLACK);
		rect.setTranslateX(x1);
		rect.setTranslateY(y);
		return rect;
		
	}
	
	
	public ArrayList<Text> createText(ArrayList<Integer> result, int x1, int y){
		System.out.println(result);
		ArrayList<Text> textLijst = new ArrayList<>();
		for(int i = 0; i <=result.size()-1; i++){
		Text text = new Text(Integer.toString(result.get(i)));
		text.setFill(Color.WHITE);
		text.setTranslateX(x1);
		text.setTranslateY(y);
		textLijst.add(text);
		x1 = x1+100;
		}
		return textLijst;
	
	}
	
	
//	public StackPane createDice(ArrayList<Integer> result){
//		StackPane pane = new StackPane();
//		System.out.println(result);
//		int j = 0;
//		for(int i = 0; i <=4; i++){
//			Rectangle rect = new Rectangle(50,50, Color.BLACK);
//			Text text = new Text(Integer.toString(result.get(i)));
//			text.setFill(Color.WHITE);
//			text.setTranslateX(x1);
//			text.setTranslateY(y);
//			rect.setTranslateX(x1);
//			rect.setTranslateY(y);
//			x1 = x1+100;
//			j++;
//			pane.getChildren().addAll(rect,text);
//
//		}
//		x1 =100;
//		return pane;
//	}
		
		
	

	public Boolean RemoveDice(){
		boolean up = true;
		y = y + 200;
		return up;
		
	}


		
}

